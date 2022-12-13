package seleniumRevision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class LocatorConcept {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("http://www.ebay.com");
		
		driver.findElement(By.linkText("Sign in")).click();
		
		driver.findElement(By.linkText("create an account")).click();
//		driver.findElement(By.id("firstname")).sendKeys("tester");
//		driver.findElement(By.id("lastname")).sendKeys("active");
//		driver.findElement(By.id("Email")).sendKeys("tester@info.com");
//		driver.findElement(By.id("password")).sendKeys("User123");
//	    
//		Actions action = new Actions(driver);
//		action.moveToElement(driver.findElement(By.id("EMAIL_REG_FORM_SUBMIT"))).build().perform();
	
		driver.findElement(By.id("businessaccount-radio")).click();
		driver.findElement(By.id("businessName")).sendKeys("User");
		driver.findElement(By.id("businessEmail")).sendKeys("Userinfo@info.com");
		driver.findElement(By.id("bizPassword")).sendKeys("tester123");
		
		Select select = new Select(driver.findElement(By.id("businessCountry")));
		select.selectByVisibleText("India");
		
		driver.findElement(By.id("bizOnlyToBuy")).click();
		
		
		

	}

}
