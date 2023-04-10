package testcases;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.Assert;

import verify.Compare;

public class TC_001 {
    
	WebDriver driver;
	boolean result;
	@BeforeMethod
	public void createDriver()
	{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	
//	@Test
//	public void testcase1()
//	{
//	    driver.findElement(By.id("email")).sendKeys("Hello");
//	    Assert.assertTrue(Compare.validateURL(driver, "https://www.facebook.com/"),"[Error] This match is not found");
//	}
//	
//	@Test
//	public void testcase2()
//	{
//		Assert.assertTrue(Compare.validateTitle(driver,"Facebook – log in or sign up"));
//	}
	
//	@Test
//	public void testcase3()
//	{
//		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("facebook");
//		Assert.assertTrue(Compare.elementExists(driver,"//input[@id='email']"));
//		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("facebook");
//	}
//	
//	@Test
//	public void testcase4()
//	{
//		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("facebook");
//		Assert.assertTrue(Compare.elementExists(driver,"id","//input[@id='email']"));
//		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("facebook");
//	}
	
//	@Test
//	public void testcase5()
//	{
//		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("facebook");
//		Assert.assertTrue(Compare.validateTextOnElement(driver, "name", "login", "Log in"));
//		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("facebook");
//	}
	
	
//	@Test
//	public void testcase6()
//	{
//		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("facebook");
//		String actResult = Compare.validateTextPresentOnElement(driver, "name", "login");
//		Assert.assertEquals(actResult, "Log in");
//		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("facebook");
//	}
	
	
//	@Test
//	public void testcase7()
//	{
//		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("facebook");
//		boolean actResult = Compare.validateTextOnPage(driver, "phone number");
//		Assert.assertTrue(actResult);
//		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("facebook");
//	}
	
	
//	@Test
//	public void testcase8()
//	{
//		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("facebook");
//		boolean actResult = Compare.validateAttribute(driver, "id", "email", "data-testid", "royal_email");
//		Assert.assertTrue(actResult);
//		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("facebook");
//	}
	
//	@Test
//	public void testcase9()
//	{
//		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("facebook");
//		boolean actResult = Compare.validateElementVisibility(driver, "id", "email");
//		Assert.assertTrue(actResult);
//		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("facebook");
//	}
	
	
	@Test
	public void testcase10()
	{
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("facebook");
		boolean actResult = Compare.validateElementEnable(driver, "id", "email");
		Assert.assertTrue(actResult);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("facebook");
	}
	
	
//	@Test
//	public void testcase11()
//	{
//		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("facebook");
//		boolean actResult = Compare.validateElementSelected(driver, "name", "login");
//		Assert.assertTrue(actResult);
//		
//		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("facebook");
//	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
}


