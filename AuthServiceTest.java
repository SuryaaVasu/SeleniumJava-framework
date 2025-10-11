package Test_p1;

import static org.junit.Assert.*;


import org.junit.Test;

import P1.AuthService;

public class AuthServiceTest {

    private final AuthService authService = new AuthService();

    @Test
    public void testValidLogin() {
        //assertEquals("Login Successful", authService.login("admin", "admin123"));
    	String result = authService.login("admin", "admin123");
        System.out.println("Test valid: " + result);
        assertEquals("Login Successful",result);
    }

    @Test
    public void testInvalidUsername() {
        //assertEquals("Login Failed", authService.login("us", "admin123"));
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
        //assertEquals("Invalid Input", authService.login("admin", ""));
    	String result = authService.login("admin", "");
        System.out.println("Test empty Password: " + result);
        assertEquals("Invalid Input", result);
    }

    @Test
    public void testNullUsername() {
        //assertEquals("Invalid Input", authService.login(null, "admin123"));
    	String result = authService.login(null, "admin123");
        System.out.println("Test Null un: " + result);
        assertEquals("Invalid Input", result);
    }

    @Test
    public void testNullPassword() {
        //assertEquals("Invalid Input", authService.login("admin", null));
        String result = authService.login("admin", null);
        System.out.println("Test Null Password: " + result);
        assertEquals("Invalid Input", result);
    }
}

