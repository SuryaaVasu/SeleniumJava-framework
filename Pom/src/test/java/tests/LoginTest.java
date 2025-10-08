package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class LoginTest extends BaseTest{
	
	@Test
	public void validLogin() {
		LoginPage page = new LoginPage(driver);
		page.enterUsername("admin@yourstore.com");
		page.enterPassword("admin");
		page.clickLogin();
		System.out.println("Tittle of the page :"+driver.getTitle());
		
		Assert.assertEquals(driver.getTitle(), "Dashboard / nopCommerce administration");
		
	}
}
