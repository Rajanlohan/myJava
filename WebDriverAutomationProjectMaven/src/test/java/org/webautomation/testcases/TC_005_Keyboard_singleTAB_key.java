package org.webautomation.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_005_Keyboard_singleTAB_key {
	
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
//		driver.close();
	}

	@Test
	public void tc_001() throws InterruptedException
	{
	   driver.findElement(By.name("fld_username")).sendKeys("Hello");
	   Actions act = new Actions(driver);
	   act.sendKeys(Keys.TAB).perform();
	   act.sendKeys("hello@gmail.com").perform();
	   act.sendKeys(Keys.TAB).perform();
	   act.sendKeys("hello").perform();
	   act.sendKeys(Keys.TAB).perform();
	   act.sendKeys("hello").perform();
	   
      
	}
	
}



