package org.webautomation.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.webTestingAutomation_base.Base_Class;

public class TC_002_Registration_RadioButton extends Base_Class  {

	@Test
	public void tc_001() throws InterruptedException
	{
	  driver.findElement(By.name("fld_username")).sendKeys("username");
	  driver.findElement(By.name("fld_email")).sendKeys("username@gmail.com");	  
	  driver.findElement(By.name("fld_password")).sendKeys("password");	  
	  driver.findElement(By.name("fld_cpassword")).sendKeys("password");
	 
      
	  driver.findElement(By.xpath("//input[@name='add_type' and @type='radio']")).click();
	  
      
	  
	  driver.findElement(By.xpath("//input[@type='submit']")).click();
      
	}
	
}



