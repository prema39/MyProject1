package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import util.ElementActions;

public class FBLoginPage extends ElementActions {

	public FBLoginPage(WebDriver driver) {
		super(driver);
	}

	By email_txt = By.id("email");
	By pass_txt = By.id("pass");
	By login_btn = By.id("loginbutton");

	public void loginToFB(String uName, String pAss) {
		enterText(email_txt, uName);
		enterText(pass_txt, pAss);
		clickOn(login_btn);

	}

}