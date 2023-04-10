package org.webTestingAutomation_base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.webTestingAutomation_Library.PropertyReader;

public class Base_Class {
	
    public WebDriver driver;
	
	@BeforeMethod
	public void startBrowser() throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rajan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(PropertyReader.applicationConfig("App_url"));
//		driver.navigate().to("https://www.google.com");
//		Thread.sleep(2000);
//		driver.navigate().to("https://www.thetestingworld.com/testings/");
//		driver.navigate().back();
//		driver.navigate().forward();
		
		
	}

	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}

}
