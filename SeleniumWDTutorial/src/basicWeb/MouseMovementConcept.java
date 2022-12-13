package basicWeb;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementConcept {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.spicejet.com/");   
		
		Actions action = new Actions(driver);
		
		action.moveToElement(driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div[2]/div[1]/div/div[2]/div[2]/div/div[1]/div[1]"))).build().perform();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div[2]/div[1]/div/div[2]/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div/div[1]/a/div/div")).click();     
		

	}

}
