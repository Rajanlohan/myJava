package basicWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropBox {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("http://wonderlandbakery.com/add_user.php"); 
		
		driver.findElement(By.name("fname")).sendKeys("Rajan");
		driver.findElement(By.name("lname")).sendKeys("Lohan");
//		driver.findElement(By.name("sex")).click();
		driver.findElement(By.xpath("//input[@value='Female']")).click();

//        Select value = new Select(driver.findElement(By.name("sex")));
//        value.selectByVisibleText("Female");
        		
		driver.findElement(By.name("st_add")).sendKeys("11 street, noida, uttar pradesh");
		driver.findElement(By.name("city")).sendKeys("Noida");
		
		Select select = new Select(driver.findElement(By.name("cmbState")));
		select.selectByVisibleText("GA");
		
		driver.findElement(By.name("country")).sendKeys("India");
		driver.findElement(By.name("zip")).sendKeys("12345");
		driver.findElement(By.name("phone")).sendKeys("9089679887");
		driver.findElement(By.name("login")).sendKeys("user@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Rajan9009");
		
		Thread.sleep(5000);
		
		driver.findElement(By.name("btn_cancel")).click();
		
		
				
				

	}

}
