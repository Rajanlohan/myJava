package basicWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://signup.ebay.com/pa/crte?siteid=0&co_partnerId=0&UsingSSL=1&rv4=1&ru=https%3A%2F%2Fwww.ebay.com%2Fmye%2Fmyebay%2Fwatchlist&signInUrl=https%3A%2F%2Fwww.ebay.com%2Fsignin%3Fsgn%3Dreg%26siteid%3D0%26co_partnerId%3D0%26UsingSSL%3D1%26rv4%3D1%26ru%3Dhttps%253A%252F%252Fwww.ebay.com%252Fmye%252Fmyebay%252Fwatchlist");

//		 1.xpath
		
//		driver.findElement(By.xpath("//*[@id=\"ap_customer_name\"]")).sendKeys("Tom");
//		driver.findElement(By.xpath("//*[@id=\"ap_phone_number\"]")).sendKeys("9897989569");
//		driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("tompeter@gmail.com");
	
//		2.id
//		driver.findElement(By.id("firstname")).sendKeys("Tarun");
//		driver.findElement(By.id("lastname")).sendKeys("peter");
//		driver.findElement(By.id("Email")).sendKeys("user@gmail.com");
		
//		3.name
		
//		driver.findElement(By.name("firstname")).sendKeys("Rajan");
//		driver.findElement(By.name("lastname")).sendKeys("Lohan");
//		driver.findElement(By.name("Email")).sendKeys("user@gmail.com");
		
//		4.link
		
//		driver.findElement(By.linkText("User Agreement")).click();
		
//		5.CSSSelector
//		  if id is there ----#(id)
//		  if class is there---- .(class)
		
//		driver.findElement(By.cssSelector("#firstname")).sendKeys("Rajan");
//		driver.findElement(By.cssSelector("#lastname")).sendKeys("Lohan");
//		driver.findElement(By.cssSelector("#Email")).sendKeys("user@gmail.com");
		
//		6.class name
		
		driver.findElement(By.className("textbox__control textbox__control--underline qm-element-masked")).sendKeys("Rajan");
		
		
		
		
	}

}
