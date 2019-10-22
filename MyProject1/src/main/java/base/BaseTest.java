package base;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import util.Configuration;

public class BaseTest {

public static WebDriver driver;

@BeforeSuite
public static void suiteSetUp() {
	Configuration.loadConfiguration();

}

@BeforeMethod
public static void launchBrowser() {
	String browserName = Configuration.getBrowserName().trim().toLowerCase();
	switch (browserName) {
	case "chrome":
		System.setProperty("webdriver.chrome.driver",
				"/Users/premalathaeddyam/eclipse-workspace/chromedriver");
		driver = new ChromeDriver();
		break;
	}

	driver.get(Configuration.getURL());
	

}


//@AfterMethod
//public static void tearDown() {
//	driver.close();
//}

}
