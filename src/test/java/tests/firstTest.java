package tests;

import java.awt.desktop.UserSessionEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;	
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class firstTest {

	public static void main(String[] args) throws InterruptedException {
//		System.out.println("hi");

//		System.getProperty("webdriver.chrome.driver", "D:/Automation_Testing/Projectsss/chromedriver-win64");
//		WebDriverManager.chromedriver().setup();

	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.saucedemo.com/");
		String users = driver.findElement(By.xpath("//div[@id='login_credentials']")).getText();
		String usernames[] = users.split(":")[1].trim().replaceAll("\n", ",").split(",");
//		System.out.println(usernames.length);
		
		String password = driver.findElement(By.className("login_password")).getText().split(":")[1];
//		System.out.println(password);

		try {
			driver.findElement(By.id("user-name")).sendKeys(usernames[0]);
			driver.findElement(By.id("password")).sendKeys(password);
			driver.findElement(By.id("login-button")).click();		
		
			if (driver.getTitle().equalsIgnoreCase("Swag Labs")) {
				System.out.println("Logged in Sucessfully with user : "+usernames[0]);
				driver.quit();
				}
			
			
		} catch (Exception e) {
			System.out.println("Login Failed");
			System.out.println(e.getMessage());
			driver.quit();


		}
		
		

		
	}

}
