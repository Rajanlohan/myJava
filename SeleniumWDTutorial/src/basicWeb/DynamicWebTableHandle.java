package basicWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DynamicWebTableHandle {
	
	

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://classic.crmpro.com");
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("TesterUser");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Rajan@012");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.switchTo().frame("mainpanel");
//		Actions action = new Actions(driver);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		
		//*[@id="vContactsForm"]/table/tbody/tr[4]/td[2]/a
		//*[@id="vContactsForm"]/table/tbody/tr[5]/td[2]/a
		//*[@id="vContactsForm"]/table/tbody/tr[6]/td[2]/a               
		//*[@id="vContactsForm"]/table/tbody/tr[7]/td[2]/a
	
		// Method no. --1
		
//		String before_xpath = "//*[@id='vContactsForm']/table/tbody/tr[";
//		String after_xpath = "]/td[2]/a";
//		String input_xpath = "]/td[1]/input";

//	    for(int i=4; i<8; i++)
//		{
//		  String str = driver.findElement(By.xpath(before_xpath+i+after_xpath)).getText();
//		  System.out.println(str);
//		  
//		  if(str.contains("User uder")||(str.contains("varun bhatt"))) 
//		  {
//			driver.findElement(By.xpath(before_xpath+ i +input_xpath)).click();  
//		  }
//		}
		
	    driver.findElement(By.xpath("//form[@id='vContactsForm']/table/tbody/tr[7]/td[1]/input")).click();
	    driver.findElement(By.xpath("//form[@id='vContactsForm']/table/tbody/tr[6]/td[1]/input")).click();
	    driver.findElement(By.xpath("//form[@id='vContactsForm']/table/tbody/tr[4]/td[1]/input")).click();
		
	}

}
