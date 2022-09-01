package POM;

import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;


public class Assignment9_Login {

	private WebDriver driver;


	@CacheLookup
	@FindBy(xpath = "//*[@id='nav_46']/a")
	WebElement menuOption;

	@CacheLookup
	@FindBy(xpath ="//*[@id='column_1']/ul/li[4]/a")
	WebElement selectcurtain;
	
	@CacheLookup
	@FindBy(id="det_img_124453395")
	WebElement FirstItemVisible;
	
	@CacheLookup
	@FindBy(xpath = "//*[@class='img_section img_280\']")
	WebElement image;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id='add_cart']")
	WebElement AddtoCart; 
	
	@CacheLookup
	@FindBy(xpath = "//div[@id='snackbar' and @class ='show']")
	WebElement ProductTitle; 
	
  

	public Assignment9_Login(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void waits()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div[3]/div[1]/button[1]")));

		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/div[1]/button[1]")).click();
	}

	public void HomeandKitchen()
	{
		 //Instantiate Action Class        
        Actions actions = new Actions(driver);   	
    	actions.moveToElement(menuOption).perform();
    selectcurtain.click();
    	
	}
	
	public void SwitchTabs() throws InterruptedException
	{
		ArrayList<String> tab1 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab1.get(1));
		Thread.sleep(5000);
		
		image.click();
	}
	public void Addcarttab() throws InterruptedException
	{
		ArrayList<String> tab2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab2.get(2));
		
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement AddtoCart = driver.findElement(By.xpath("//*[@id='add_cart']"));
		//Dimension abc =AddtoCart.getSize();
		//System.out.println(abc);
		//Scroll the web page till the web element is found
		js.executeScript("window.scrollBy(200,48)", "");
		
		AddtoCart.click();
		System.out.println("added to cart succesfully");
		
		
		
	
	
	}

	public void titleValidation() {
		String expectedTitle = "Product added to cart";
		//String actualTitle= driver.findElement(By.xpath("//div[@id='snackbar' and @class ='show']")).getText();
		String actualTitle = ProductTitle.getText();
		System.out.println("actual value produced is "+ actualTitle);
		System.out.println("expected value produced is "+ expectedTitle);
		//String actualTitle = driver.getTitle();
		//System.out.println("actual title is " +actualTitle);
		
		Reporter.log("Expected title = " + expectedTitle);
		Reporter.log("Actual title = " + actualTitle);
		
		assertTrue(actualTitle.equals(expectedTitle), "Product added to cart");
	}
}
	
	

	
		
		
	


	


	
