package org.webautomation.testcases;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.webDriverAutomation.Verification.Verification;
import org.webTestingAutomation_Library.CaptureScreenShot;
import org.webTestingAutomation_Library.PropertyReader;
import org.webTestingAutomation_base.Base_Class;

public class TC_001_Registration_Functionality extends Base_Class {
	
	

	@Test
	public void tc_001() throws InterruptedException, IOException
	{
	  driver.findElement(By.name(PropertyReader.locatorConfig("username")))
	                                .sendKeys(PropertyReader.applicationConfig("App_username"));
	  driver.findElement(By.name(PropertyReader.locatorConfig("emailid")))
	                                .sendKeys(PropertyReader.applicationConfig("App_email"));	  
	  driver.findElement(By.name(PropertyReader.locatorConfig("password")))
	                                .sendKeys(PropertyReader.applicationConfig("App_password"));	  
	  driver.findElement(By.name(PropertyReader.locatorConfig("confirmpass")))
	                                .sendKeys(PropertyReader.applicationConfig("App_password"));
	 
//	  driver.findElement(By.xpath("//input[@name='add_type' and @type='radio']")).click();
	 
	  CaptureScreenShot.screenshot(driver,"screenshot");
	  
//      Select gender = new Select(driver.findElement(By.name("sex")));
//      gender.selectByVisibleText("Male");
//      
//      Select country = new Select(driver.findElement(By.name("country")));
//      country.selectByVisibleText("India");
//      System.out.println("country name is : "+ country.getFirstSelectedOption().getText());
	  
	  
	  Assert.assertTrue(Verification.validateElementVisibility
			  (driver, "xpath", PropertyReader.locatorConfig("signup_xpath")), "Error in application");
	  
      driver.findElement(By.xpath(PropertyReader.locatorConfig("signup_xpath"))).click();
      
	}
	
}



