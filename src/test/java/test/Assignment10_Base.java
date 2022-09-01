package test;

import java.io.InputStream;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.yaml.snakeyaml.Yaml;

import com.beust.jcommander.Parameter;

import utils.Common;

public class Assignment10_Base {
	Common common;
	//String browser = "chrome";
	//String url = "https://www.bravenet.com/login";
	WebDriver driver;
	
	@Parameters({"browser","url"})
	@BeforeTest
	public void beforeTest(String browser , String url) {
		common = new Common();
		common.setupBrowser(browser, url);
		driver = common.getDriver();
	}
	
	/*@AfterTest
	public void afterTest() {
		common.quitBrowser();
	} */
	
	
}



