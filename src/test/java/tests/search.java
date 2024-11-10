package tests;

import javax.swing.border.TitledBorder;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import dev.failsafe.internal.util.Assert;

public class search {

	public static void main(String[] args) throws InterruptedException {

		System.getProperty("webdriver.chrome.driver", "D:/Automation_Testing/Projectsss/chromedriver-win64");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.google.com/");
		WebElement Search = driver.findElement(By.id("APjFqb"));
		Search.sendKeys("java");
		Search.sendKeys(Keys.ENTER);
		System.out.println(driver.getTitle());

		WebElement java = driver.findElement(By.xpath("//*[@href='https://www.java.com/']"));
		java.click();
		System.out.println(driver.getTitle());

	}

}
