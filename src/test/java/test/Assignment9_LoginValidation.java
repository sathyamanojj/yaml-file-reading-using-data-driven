package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import POM.Assignment9_Login;

public class Assignment9_LoginValidation extends Assignment9_Base {
	//Close the Notificationthat appears on the page
	@Test(enabled = true)
	public void delaywait()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div[3]/div[1]/button[1]")));

		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/div[1]/button[1]")).click();
	}

	//Hover the pointer to the menu item ‘HOME & KITCHEN’
	//Click on the menu item ‘Curtains’from the drop-down menu

	@Test(priority = 1)
	public void Hover_Menu() {

		// Adding wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Assignment9_Login obj1 = new Assignment9_Login(driver);
		obj1.HomeandKitchen();
		System.out.println("Done Mouse hover on 'Home and Kitchen' from Menu");
	}
	
	// 2▪Click on the menu item ‘Curtains’from the drop-down menu▪A new tab opens.
	//Transfer the focus to the new tab▪Click on the first item that is visible
	
	@Test(priority = 2)
	public void switching_the_tabs() {
		Assignment9_Login obj2 = new Assignment9_Login(driver);
		try {
			obj2.SwitchTabs();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("switched to tab  curtains ");
	}

	//A new tab will open again, transfer the focus to the new tab
	//▪Click on the ‘ADD TO CART’button
	
	@Test(priority = 3)
	public void Adding_the_product() {
		Assignment9_Login obj3 = new Assignment9_Login(driver);
		try {
			obj3.Addcarttab();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("switched to tab add cart");
	}

	//Verify the message ‘Product added to cart’
@Test(priority= 4)
public void Validating_Message()
{
	Assignment9_Login obj4 = new Assignment9_Login(driver);
	obj4.titleValidation();
	System.out.println("Message validated successfully");
}

	
}
