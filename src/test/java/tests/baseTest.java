package tests;

import java.io.IOException;
import org.apache.logging.log4j.core.Logger;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


import net.bytebuddy.asm.Advice.This;
import utils.excel;
import utils.propertyFile;

public  class baseTest {
	
public static WebDriver driver;
public Logger logger;
	
	public static void setup() throws IOException {

		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.saucedemo.com/");
		
	}
	public static void tearDown() {
		driver.quit();
		
	}
	
	@BeforeClass
	public static void loadBrowser() throws IOException {
//		logger=LogManager.getLogger();	
		
		if (propertyFile.getProperty("Browser").equalsIgnoreCase("chrome")) {
			
			driver = new ChromeDriver();
			}
		if (propertyFile.getProperty("Browser").equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
			}
		if (propertyFile.getProperty("Browser").equalsIgnoreCase(" ")) {
			driver = new ChromeDriver();
			}
		
		driver.manage().window().maximize();

		driver.get("https://www.saucedemo.com/");
		
	}
	
	@AfterClass
	public static void closeBrowser() {
		driver.quit();
		
	}
	
	

}
