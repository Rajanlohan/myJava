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

public class TC_004_Registration_Functionality_FetchData {
	
	WebDriver driver;
	
	@BeforeMethod
	public void startBrowser() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rajan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.thetestingworld.com/testings/");
		
	}

	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}

	@Test
	public void tc_001() throws InterruptedException
	{
	  
	  driver.findElement(By.name("fld_username")).sendKeys("username");
	  driver.findElement(By.name("fld_email")).sendKeys("username@gmail.com");	  
	  driver.findElement(By.xpath("//input[@type='submit']")).click();
	  
	  System.out.println(driver.getCurrentUrl());
	  System.out.println(driver.getTitle());
//	  System.out.println(driver.getPageSource());
	  
	  System.out.println("attribute value is : "+driver.findElement(By.name("terms")).getAttribute("type"));
	  
	  System.out.println(driver.findElement(By.name("terms")).isSelected());
	  driver.findElement(By.name("terms")).click();
	  System.out.println(driver.findElement(By.name("terms")).isSelected());
      
	}
	
}



