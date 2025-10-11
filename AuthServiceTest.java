package Test_p1;

import static org.junit.Assert.*;
import org.junit.Test;
import P1.AuthService;

public class AuthServiceTest {

    private final AuthService authService = new AuthService();

    @Test
    public void testValidLogin() {
    	String result = authService.login("admin", "admin123");
        System.out.println("Test valid: " + result);
        assertEquals("Login Successful",result);
    }

    @Test
    public void testInvalidUsername() {
    	String result = authService.login("un","admin123");
        System.out.println("Test invalid un: " + result);
        assertEquals("Login Failed", result);
    }

    @Test
    public void testInvalidPassword() {
        //assertEquals("Login Failed", authService.login("admin", "wrongpass"));
    	String result = authService.login("admin", "wrong");
        System.out.println("Test invalid Password: " + result);
        assertEquals("Login Failed", result);
    }

    @Test
    public void testEmptyUsername() {
        //assertEquals("Invalid Input", authService.login("", "admin123"));
    	String result = authService.login("", "admin123");
        System.out.println("Test empty un: " + result);
        assertEquals("Invalid Input", result);
    
    }

    @Test
    public void testEmptyPassword() {
    	String result = authService.login("admin", "");
        System.out.println("Test empty Password: " + result);
        assertEquals("Invalid Input", result);
    }

    @Test
    public void testNullUsername() {
    	String result = authService.login(null, "admin123");
        System.out.println("Test Null un: " + result);
        assertEquals("Invalid Input", result);
    }

    @Test
    public void testNullPassword() {
        String result = authService.login("admin", null);
        System.out.println("Test Null Password: " + result);
        assertEquals("Invalid Input", result);
    }
}


