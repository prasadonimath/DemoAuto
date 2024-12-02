

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.sound.midi.Soundbank;

import org.apache.commons.collections4.functors.WhileClosure;
import org.apache.poi.ss.formula.ptg.NotEqualPtg;
import org.apache.xmlbeans.impl.xb.xsdschema.All;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import tests.search;

public class demo {
	WebElement search = null ;
	static WebDriver driver;
	
	public WebElement searchWebElement(String loc) {
		
		try {
			 driver =new ChromeDriver();
			WebDriverManager.chromedriver().setup();
			driver.manage().window().maximize();
			
			driver.get("https://www.google.co.in/");
			search= driver.findElement(By.id(loc));	
		} catch (Exception e) {	
			System.out.println("Exception found");
		}
		return search;
		}
	
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("-----Start-----");
		
		demo demo = new demo();
		try {
			WebElement search= demo.searchWebElement("APjFqb");
		} catch (Exception e) {
			System.out.println("Exception Found");
			}
		
		
		JavascriptExecutor js =(JavascriptExecutor) driver;
		
		js.executeScript("window.open('https://petstore.swagger.io/','_blank');");
		js.executeScript("window.open('https://www.wikipedia.org','_blank');");
		js.executeScript("window.open('https://letcode.in/test','_blank');");
		
				
		
		Set<String> allHandles = driver.getWindowHandles();
		
		List<String> ls = new ArrayList<String> (allHandles);	
		System.out.println(ls);
		
		
//		Iterator iterator =allHandles.iterator();
			
		for (int i =0; i<=ls.size()-1;i++) {
			String handleString =ls.get(i);
			driver.switchTo().window(handleString);
//			System.out.println(driver.getTitle());
			
			if (driver.getTitle().equalsIgnoreCase("Swagger UI")) {
				WebElement click = driver.findElement(By.xpath("//button[contains(text(),'Allow')]"));
				String msg = click.getText();
				click.click();
				System.out.println("Switched to "+driver.getTitle()+" and clicked "+"'"+msg+"'"+" button.");
				}
			}
		driver.quit();
		System.out.println("-------End-------");
		}
	}
		
		

	



