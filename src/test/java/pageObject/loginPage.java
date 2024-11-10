package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import tests.baseTest;

public class loginPage {
	WebDriver driver;
	public static String username;

	public loginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By user=By.id("user-name");
	By pass=By.id("password");
	By click=By.id("login-button");
	
	
	public void enterusername(String username) {
		this.username=username;
		driver.findElement(user).sendKeys(username);
		}
	public void enterpassword(String password) {
		driver.findElement(pass).sendKeys(password);
		}
	public void login() {
		driver.findElement(click).click();
		}
	public void verifyTitle() {
		if (driver.getTitle().equalsIgnoreCase("Swag Labs")) {
			System.out.println("Logged in Sucessfully with user : "+username);
		}
	}

}
