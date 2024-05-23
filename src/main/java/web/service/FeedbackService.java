package web.service;

import java.util.ArrayList;
import java.util.List;

public class FeedbackService {
    private static List<String> feedbacks = new ArrayList<>();

    public static void addFeedback(String task, String feedback) {
        feedbacks.add("Task: " + task + " - Feedback: " + feedback);
    }

    public static List<String> getFeedbacks() {
        return feedbacks;
    }
}
