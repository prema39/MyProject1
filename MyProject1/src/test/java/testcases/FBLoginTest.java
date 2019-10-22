package testcases;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.FBLoginPage;
import pages.HomePage;

public class FBLoginTest extends BaseTest {
	@Test
	public void initialise() {
		FBLoginPage fp = new FBLoginPage(driver);
		fp.loginToFB("lathareddye@gmail.com", "Mangala39");
		HomePage hp = new HomePage(driver);
	}
	

}
