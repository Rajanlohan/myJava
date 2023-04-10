package basicWeb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisibilityTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));   
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://classic.crmpro.com");
		
		boolean b1 = driver.findElement(By.xpath("//input[contains(@type,'submit')]")).isDisplayed();
        System.out.println(b1);
        
        boolean b2 =driver.findElement(By.xpath("//input[contains(@type,'submit')]")).isEnabled();
		System.out.println(b2);
       
		
		driver.quit();
	}

}
