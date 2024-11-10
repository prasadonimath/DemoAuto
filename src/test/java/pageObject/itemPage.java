package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class itemPage {
WebDriver driver;
	
	public itemPage(WebDriver driver) {
			this.driver = driver;
	}
	
	By addTo=By.xpath("//button[@id='add-to-cart']");
	By cartIcon=By.id("shopping_cart_container");
	
	public void addtoCart() {
		driver.findElement(addTo).click();
	}
	public void clickCart() {
		driver.findElement(cartIcon).click();
	}
	

}
