package pages;

import org.openqa.selenium.WebDriver;


import util.ElementActions;

public class HomePage extends ElementActions {

	public HomePage(WebDriver driver) {
		super(driver);
		
	}
	public void pageTitle() {
		String title = driver.getTitle();
		System.out.println(title);
		//Assert.assertEquals(title, "Facebook");
	}

	
	
	}
	
