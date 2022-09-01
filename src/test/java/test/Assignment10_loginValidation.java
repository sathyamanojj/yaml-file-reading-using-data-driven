package test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.yaml.snakeyaml.Yaml;

import POM.Assignment10_LoginPage;
import utils.Common;

public class Assignment10_loginValidation {

	InputStream inputstream;
	Common common;
	String filename = "readdata.yaml";
	private HashMap<String,Object> usermap ;
	Yaml yaml = new Yaml();
	
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
	
	@BeforeClass
	public void beforeclass()
	{
		inputstream = this.getClass().getClassLoader().getResourceAsStream(filename);
		usermap = yaml.load(inputstream);
	}
	
	@Test(priority =1)
	public void LoginFunctionality1() throws IOException 
	{
		HashMap<String,String> data = (HashMap<String,String> )usermap.get("test1");
		Assignment10_LoginPage obj = new Assignment10_LoginPage(driver);
		String username = data.get("username");
		String password = data.get("password");
		obj.loginWithCredentials(username, password);

	}
	@Test(priority =2)
	public void LoginFunctionality2() throws IOException 
	{
		HashMap<String,String> data = (HashMap<String,String> )usermap.get("test2");
		Assignment10_LoginPage obj = new Assignment10_LoginPage(driver);
		String username = data.get("username");
		String password = data.get("password");
		obj.loginWithCredentials(username, password);

	}@Test(priority =3)
	public void LoginFunctionality3() throws IOException 
	{
		HashMap<String,String> data = (HashMap<String,String> )usermap.get("test3");
		Assignment10_LoginPage obj = new Assignment10_LoginPage(driver);
		String username = data.get("username");
		String password = data.get("password");
		obj.loginWithCredentials(username, password);

	}@Test(priority =4)
	public void LoginFunctionality4() throws IOException 
	{
		HashMap<String,String> data = (HashMap<String,String> )usermap.get("test4");
		Assignment10_LoginPage obj = new Assignment10_LoginPage(driver);
		String username = data.get("username");
		String password = data.get("password");
		obj.loginWithCredentials(username, password);

	}@Test(priority =5)
	public void LoginFunctionality5() throws IOException 
	{
		HashMap<String,String> data = (HashMap<String,String> )usermap.get("test5");
		Assignment10_LoginPage obj = new Assignment10_LoginPage(driver);
		String username = data.get("username");
		String password = data.get("password");
		obj.loginWithCredentials(username, password);

	}
}
