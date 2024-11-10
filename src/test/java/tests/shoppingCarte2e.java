package tests;

import org.testng.annotations.Test;

import pageObject.cartPage;
import pageObject.homePage;
import pageObject.itemPage;
import pageObject.loginPage;

public class shoppingCarte2e extends baseTest{
	
	@Test(priority = 1,groups = {"sanity","regression"})
	public void login() {
		 
		loginPage lp=new loginPage(driver);
		lp.enterusername("standard_user");
		lp.enterpassword("secret_sauce");
		lp.login();
		lp.verifyTitle();
	}
	
	@Test(priority = 2,groups = "regression")
	public void search() {
		homePage hp=new homePage(driver);
		hp.clickItem();
	}
	
	
	@Test(priority = 3,groups = "regression")
	public void addItem() {
		itemPage it=new itemPage(driver);
		it.addtoCart();
		it.clickCart();
	}	
	
	@Test(priority = 4,groups = "regression")
		public void verify() {
			cartPage cp=new cartPage(driver);
			cp.verifyItem();
			
		}
		
}
	

