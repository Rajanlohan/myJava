package com.test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {

	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
//		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));   
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
        driver.get("http://www.google.com");	
	}
	@Test(priority=1,groups="title")
	public void googleTitleTest() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	@Test(priority=3,groups="logo")
	public void googleLogoTest() {
		boolean b = driver.findElement(By.xpath("/html/body/ntp-app//div/ntp-logo")).isDisplayed();  
	}
	
	@Test(priority=2,groups="link")
	public void mailLinkTest() {
		boolean b = driver.findElement(By.linkText("Gmail")).isDisplayed();
	}
	
	@Test(priority=4,groups="test")
	public void test1() {
		System.out.println("test1");
	}
	
	@Test(priority=5,groups="test")
	public void test2() {
		System.out.println("test2");
	}
	
	@Test(priority=6,groups="test")
	public void test3() {
		System.out.println("test3");
	}
	
	
    @AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
}
