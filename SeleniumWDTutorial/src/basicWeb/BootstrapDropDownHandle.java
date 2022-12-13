package basicWeb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropDownHandle {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));   
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		
		driver.findElement(By.xpath("//button[contains(@class,'multiselect dropdown')]")).click();
        WebElement list = driver.findElement(By.xpath("//ul[contains(@class,'multiselect-container dropdown-menu')]/li/a/label"));
		
        System.out.println(list.getText());
        
		
		
	
		
//		driver.findElement(By.xpath("//button[contains(@class,'multiselect dropdown')]//following::ul/li[6]//input[@value='Angular']")).click();
//		driver.findElement(By.xpath("//button[contains(@class,'multiselect dropdown')]//following::ul/li[8]//input[@value='Java']")).click();
//		driver.findElement(By.xpath("//ul[@class='multiselect-container dropdown-menu']/li[10]/a/label[@class='checkbox']")).click();
		
      
	}

}
