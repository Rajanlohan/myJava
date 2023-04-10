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

public class TC_003_Registration_Functionality_DropDown {
	
	WebDriver driver;
	
	@BeforeMethod
	public void startBrowser() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rajan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.thetestingworld.com/testings/");
//		driver.navigate().to("https://www.google.com");
//		Thread.sleep(2000);
//		driver.navigate().to("https://www.thetestingworld.com/testings/");
//		driver.navigate().back();
//		driver.navigate().forward();
		
		
	}

	@AfterMethod
	public void closeBrowser()
	{
//		driver.close();
	}

	@Test
	public void tc_001() throws InterruptedException
	{
	  driver.findElement(By.name("fld_username")).sendKeys("username");
	  driver.findElement(By.name("fld_email")).sendKeys("username@gmail.com");	  
	  driver.findElement(By.name("fld_password")).sendKeys("password");	  
	  driver.findElement(By.name("fld_cpassword")).sendKeys("password");
	  
      Select gender = new Select(driver.findElement(By.name("sex")));
      gender.selectByVisibleText("Male");
      
      Select country = new Select(driver.findElement(By.name("country")));
      country.selectByVisibleText("India");
      System.out.println("country name is : "+ country.getFirstSelectedOption().getText());
      List<WebElement> allcountry = country.getOptions();
		for(WebElement e : allcountry)
		{
			System.out.println(e.getText());
		}
		
//	  Thread.sleep(4000);
//	  Select state = new Select(driver.findElement(By.name("state"))); 	
//      state.selectByIndex(3);
//      
//      Thread.sleep(4000);
//      Select city = new Select(driver.findElement(By.name("city")));
//      city.selectByIndex(1);
	  
	  driver.findElement(By.xpath("//input[@type='submit']")).click();
      
	}
	
}



