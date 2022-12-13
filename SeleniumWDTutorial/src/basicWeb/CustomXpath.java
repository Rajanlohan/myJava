package basicWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CustomXpath {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
//		driver.get("https://www.spinny.com/");
		
//		driver.findElement(By.xpath("//input[@class='styles__searchInput styles__forGTM']")).sendKeys("new swifty");
//		Select select = new Select(driver.findElement(By.className("styles__desktopHeaderCityTexSpan")));
		
//		select.selectByVisibleText("Bangalore");
		
//		contains --->
		
//		driver.findElement(By.xpath("//input[contains(@class,'styles__searchInput styles__forGTM')]")).sendKeys("hyundai"); 
		
//		starts-with-->
		
//		driver.findElement(By.xpath("//input[starts-with(@id,'test_')]")).sendKeys("java");
		
//		ends-with
//		driver.findElement(By.xpath("//input[ends-with(@id,'_test_t')]")).sendKeys("java");
		
		
		driver.get("https://www.ebay.com/");
		
		driver.findElement(By.xpath("//a[contains(text(),'Help & Contact')]")).click();
		
	}

}
