package POM;


import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;



public class Assignment10_LoginPage {
	private WebDriver driver;


	@CacheLookup
	@FindBy(id = "userid")
	WebElement user;

	@CacheLookup
	@FindBy(id = "password")
	WebElement passwd;


	@CacheLookup
	@FindBy(xpath="//*[@id=\"brave-app\"]/div[1]/div/form/div[1]/div[3]/button/div/span")
	WebElement loginButton;

	


	public Assignment10_LoginPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void SetUsername(String username)
	{
		user.clear();
		user.sendKeys(username);
	}
	public void SetPassword(String password)
	{
		passwd.clear();
		passwd.sendKeys(password);
	}

	public void loginWithCredentials(String username, String password) throws IOException {
		
		SetUsername(username);
		Reporter.log(username);
		SetPassword(password);
		Reporter.log(password);
		
		//Reporter.log("username = " + username);
		//Reporter.log("password = " + password);
		loginButton.click();

	}


	

	}


