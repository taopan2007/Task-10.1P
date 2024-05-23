package web.service;

public class LoginService {

    public static boolean login(String username, String password) {
        return "admin".equals(username) && "admin".equals(password);
    }

	/**
	 * Static method returns true for successful login, false otherwise.
	 * @param username
	 * @param password
	 * @return
	 */
	public static boolean login(String username, String password, String dob) {
		// Match a fixed user name and password.
		//
		if ("admin".equals(username) && "admin".equals(password)) {
			return true;
		}
		return false;
	}
	

}
