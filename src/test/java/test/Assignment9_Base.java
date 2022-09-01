package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import utils.Common;

public class Assignment9_Base {
	
	Common common;
	String browser = "chrome";
	String url = "https://www.shopclues.com/";
	// Navigate to the web application: https://www.shopclues.com/
	

	static WebDriver driver;

	@BeforeTest
	public void beforeTest() {
		common = new Common();
		common.setupBrowser(browser, url);
		driver = common.getDriver();
		//Maximize browser window
		 driver.manage().window().maximize();
		
	}

	@AfterTest
	public void afterTest() {
		common.quitBrowser();
	} 


}