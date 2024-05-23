package web.service;

public class LoginService {
    public static boolean login(String username, String password) {
        return "admin".equals(username) && "admin".equals(password);
    }
}
//NEW COMMIT