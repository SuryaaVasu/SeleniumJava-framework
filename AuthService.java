package P1;

//uN,Pd is empty means invalid or failed
public class AuthService {
    public String login(String username, String password) {
        if (username == null || username.isEmpty() || password == null || password.isEmpty()) {
            return "Invalid Input";
        }

        if ("admin".equals(username) && "admin123".equals(password)) {
            return "Login Successful";
        }

        return "Login Failed";
    }
}
