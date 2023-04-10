package firstRevisionStart;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LaunchGoogle {

	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://wonderlandbakery.com");
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		String title = driver.getTitle();
		System.out.println(title);
		
		
//		Alert alert = driver.switchTo().alert();
		Thread.sleep(5000);
		
		
	    driver.findElement(By.xpath("//div[@class='modal-header']//following::button//span")).click();
	    
	    Actions action = new Actions(driver);
        
	    action.moveToElement(driver.findElement(By.xpath("//*[@id='menu-item-421']/a"))).build().perform();
	    Thread.sleep(2000);
//	    action.moveToElement(driver.findElement(By.xpath("//*[@text()='Logo Cookies']"))).build().perform();
//	    Thread.sleep(2000);
//	    action.moveToElement(driver.findElement(By.xpath("//*[@text()='Anniversary Message']"))).build().perform();
//	    Thread.sleep(2000);

	    action.moveToElement(driver.findElement(By.xpath("//*[@id='menu-item-615']/a"))).build().perform();
	    Thread.sleep(2000);
	    action.moveToElement(driver.findElement(By.xpath("//*[@id='menu-item-623']/a"))).build().perform();
	    Thread.sleep(2000);
	    action.moveToElement(driver.findElement(By.xpath("//*[@id='menu-item-684']/a"))).build().perform();
	    Thread.sleep(2000);
	    action.moveToElement(driver.findElement(By.xpath("//*[@id='menu-item-638']/a"))).build().perform();
	    Thread.sleep(2000);
	    action.moveToElement(driver.findElement(By.xpath("//*[@id='menu-item-650']/a"))).build().perform();
	    Thread.sleep(2000);
	    action.moveToElement(driver.findElement(By.xpath("//*[@id='menu-item-666']/a"))).build().perform();
	    Thread.sleep(2000);
	    action.moveToElement(driver.findElement(By.xpath("//*[@id='menu-item-633']/a"))).build().perform();
	    
	    
	    
//		if(title.equals("Google"))
//		{
//			System.out.println("correct title");
//		}
//		else
//		{
//			System.out.println("incorrect title");
//		}
//		
//		
//		System.out.println(driver.getCurrentUrl());
////		System.out.println(driver.getPageSource());
//		driver.quit();

	}

}
