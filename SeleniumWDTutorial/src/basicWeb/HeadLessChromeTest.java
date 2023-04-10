package basicWeb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLessChromeTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("window-size=1920,980");
		options.addArguments("headless");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));   
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://classic.crmpro.com");
		System.out.println("Login page title "+driver.getTitle());

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("TesterUser");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Rajan@012");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		System.out.println("Home page title "+driver.getTitle());
		
		

	}

}
