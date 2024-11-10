package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class cartPage {
	WebDriver driver;

	public cartPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By item= By.id("item_4_title_link"	);
	
	public void verifyItem() {
		System.out.println(driver.findElement(item).getText());
		Assert.assertEquals(driver.findElement(item).getText(), "Sauce Labs Backpack");		
	}
}
