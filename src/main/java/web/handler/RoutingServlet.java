package web.handler;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import web.service.LoginService;
import web.service.TaskService;
import web.service.FeedbackService;

@Controller
@RequestMapping("/")
public class RoutingServlet {

    @GetMapping("/")
    public String welcome() {
        return "view-welcome";
    }

    @GetMapping("/login")
    public String loginView() {
        return "view-login";
    }

    @PostMapping("/login")
    public RedirectView login(HttpServletRequest request, RedirectAttributes redirectAttributes) {
        String username = request.getParameter("username");
        String password = request.getParameter("passwd");


        if (LoginService.login(username, password)) {
            return new RedirectView("/submit-task", true);
        } else {
            redirectAttributes.addFlashAttribute("message", "Login Failed");
            return new RedirectView("/login", true);
        }
    }

    @GetMapping("/submit-task")
    public String submitTaskView() {
        return "view-submit-task";
    }

    @PostMapping("/submit-task")
    public RedirectView submitTask(HttpServletRequest request, RedirectAttributes redirectAttributes) {
        String title = request.getParameter("title");
        String description = request.getParameter("description");
        String file = request.getParameter("file");

        if (TaskService.submitTask(title, description, file)) {
            redirectAttributes.addFlashAttribute("message", "Task submitted successfully.");
            return new RedirectView("/feedback", true);
        } else {
            redirectAttributes.addFlashAttribute("message", "Task submission failed.");
            return new RedirectView("/submit-task", true);
        }
    }

    @GetMapping("/feedback")
    public String feedbackView(HttpServletRequest request) {
        request.setAttribute("feedbacks", FeedbackService.getFeedbacks());
        return "view-feedback";
    }
}

