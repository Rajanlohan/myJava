package seleniumRevision;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WonderLandBakeryConcept {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("http://wonderlandbakery.com");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//div[@class='modal-header']//following::button//span")).click();
		
		Actions action = new Actions(driver);
		
		action.moveToElement(driver.findElement(By.linkText("Treats"))).build().perform();
		action.moveToElement(driver.findElement(By.linkText("Cookies"))).build().perform();
//		action.moveToElement(driver.findElement(By.linkText("Cookie Arrangements"))).build().perform();
		Thread.sleep(3000);
		
		action.moveToElement(driver.findElement(By.linkText("Parties"))).build().perform();
		action.moveToElement(driver.findElement(By.linkText("Weddings"))).build().perform();
//		action.moveToElement(driver.findElement(By.linkText("Favors"))).build().perform();
		Thread.sleep(3000);
		
		action.moveToElement(driver.findElement(By.linkText("Gifts"))).build().perform();
		action.moveToElement(driver.findElement(By.linkText("Wonderland Brand"))).build().perform();
		action.moveToElement(driver.findElement(By.linkText("Videos - Click to View"))).click(driver.findElement(By.linkText("Videos - Click to View")));
		
		
		

	}

}
