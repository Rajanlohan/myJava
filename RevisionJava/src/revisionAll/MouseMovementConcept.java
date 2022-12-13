package revisionAll;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementConcept {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.spinny.com/?utm_source=SPD-Search-Top8-National-Brand-EM&utm_medium=gads_c_search&utm_campaign=&utm_content=586920586020&utm_term=e_spinny&partner_id=EAIaIQobChMIu6iy0LCl-QIVRmoqCh0fYwQqEAAYASAAEgIdZ_D_BwE&source=googleads&sub_source=SPD-Search-Top8-National-Brand-EM&gclid=EAIaIQobChMIu6iy0LCl-QIVRmoqCh0fYwQqEAAYASAAEgIdZ_D_BwE");
		
//		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[1]/div/div[2]/div[1]/div[2]/div/input")).sendKeys("swift desire");
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/ul/li[2]"))).build().perform();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/ul/li[2]/div/div/div/div/div/ul/li[3]/a/span")).click();
		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		Alert alert = driver.switchTo().alert();	
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//input[@class='styles__searchInput ']")).sendKeys("Delhi");
		

	}

}
