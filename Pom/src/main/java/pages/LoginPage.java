package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private WebDriver driver;
	
	private By username = By.id("Email");
	private By password =By.id("Password");
	private By loginbtn = By.xpath("//button[normalize-space()='Log in']");
	
	public LoginPage(WebDriver driver) {
		this.driver= driver;
	}
	
	public void enterUsername(String name) {
		driver.findElement(username).clear();
		driver.findElement(username).sendKeys(name);
	}

	public void enterPassword(String pass) {
		driver.findElement(password).clear();;
		driver.findElement(password).sendKeys(pass);
	}

	public void clickLogin() {
		driver.findElement(loginbtn).click();;
	}
}
