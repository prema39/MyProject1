package pages;

import org.openqa.selenium.WebDriver;
import org.testng.AssertJUnit;

import util.ElementActions;

public class HomePage extends ElementActions {

	public HomePage(WebDriver driver) {
		super(driver);
		
	}
	public void pageTitle() {
		String title = driver.getTitle();
		AssertJUnit.assertEquals(title, "Login·: rediff");
		System.out.println(title);
	}

	
	
	}
	
