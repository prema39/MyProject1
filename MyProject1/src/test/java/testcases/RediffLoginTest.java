package testcases;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.HomePage;
import pages.RediffMailLoginPage;

public class RediffLoginTest extends BaseTest {
	@Test
	public void initialise() {
		RediffMailLoginPage rmp = new RediffMailLoginPage(driver);
		rmp.loginToRediffmail("ar454", "arvind");
		HomePage hp = new HomePage(driver);
		hp.pageTitle();
		
	}
	

}
