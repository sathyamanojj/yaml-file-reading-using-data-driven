package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import utils.Common;

public class BaseTest {
	Common common;
	String browser = "chrome";
	String url = "https://www.facebook.com";
	static WebDriver driver;
	
	@BeforeTest
	public void beforeTest() {
		common = new Common();
		common.setupBrowser(browser, url);
		driver = common.getDriver();
	}
	
	@AfterTest
	public void afterTest() {
		common.quitBrowser();
	}
	
	
}



