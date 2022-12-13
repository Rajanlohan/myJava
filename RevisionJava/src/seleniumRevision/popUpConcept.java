package seleniumRevision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class popUpConcept {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://www.spinny.com");
		
		driver.findElement(By.className("styles__desktopHeaderCityText")).click();
		
		Select select = new Select(driver.findElement(By.className("styles__searchInput ")));
		select.selectByVisibleText("Bangalore");
		
	}

}
