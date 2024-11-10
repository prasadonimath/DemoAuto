package tests;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObject.loginPage;

public class loginTest extends baseTest {

	@Test(priority =1,groups ="sanity")
	public void login()   throws IOException {
		
//		baseTest.setup();

		loginPage lp=new loginPage(driver);
		lp.enterusername("standard_user");
		lp.enterpassword("secret_sauce");
		lp.login();
		lp.verifyTitle();
		
//		baseTest.tearDown();
		
		
	}
}
