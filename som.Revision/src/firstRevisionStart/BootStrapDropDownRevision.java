package firstRevisionStart;

import java.sql.Driver;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapDropDownRevision {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		
		driver.findElement(By.xpath("//*[contains(@class,'multiselect dropdown')]")).click();
		String beforeXpath ="//ul[contains(@class,'multiselect-container dropdown-menu')]/li[";
		String afterXpath ="]/a/label";
		
		for(int i=1; i<=14; i++) {
		
			String list = driver.findElement(By.xpath(beforeXpath + i + afterXpath)).getText();
			System.out.println(list);
			
		}
		
				
		

	}

}
