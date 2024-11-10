package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class homePage {
	WebDriver driver;
	
	public homePage(WebDriver driver) {
			this.driver = driver;
	}
	
	By item= By.id("item_4_title_link");
	
	
	public void clickItem() {
		driver.findElement(item).click();
	}
	}
	
	
	


