package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import javafx.scene.control.Alert;
import util.ElementActions;

public class RediffMailLoginPage extends ElementActions {

	public RediffMailLoginPage(WebDriver driver) {
		super(driver);

	}

	By signin_btn = By.linkText("Sign in");
	By user_txbx = By.id("login1");
	By pass_txt = By.id("password");
	By login_btn = By.name("proceed");

	public void loginToRediffmail(String uName, String pAss) {

		enterText(user_txbx, uName);
		enterText(pass_txt, pAss);
		clickOn(login_btn);

	}

}