package basicWeb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalendarSelectTest {

	public static void main(String[] args) throws InterruptedException {
		 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));   
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://classic.crmpro.com/index.html");
		
		driver.findElement(By.name("username")).sendKeys("TesterUser");
		driver.findElement(By.name("password")).sendKeys("Rajan@012");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/form/div/div/input")).click();
		
		Thread.sleep(3000);
		driver.switchTo().frame("mainpanel");
		Thread.sleep(2000);    
		
		String date = "24/July/2016 ";
		String dateArr[] = date.split("/");
		String day = dateArr[0];
		String month = dateArr[1];
		String year = dateArr[2];
		
		Select select = new Select(driver.findElement(By.xpath("//select[@name='slctMonth']")));
		select.selectByVisibleText(month);
		
		
		Select select1 = new Select(driver.findElement(By.xpath("//select[@name='slctYear']")));
		select1.selectByVisibleText(year);
		
		String before_xpath = "//*[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr[";
		String after_xpath = "]/td[";
		
		boolean flag = false;
		String dayVal = null;
  		for(int rowNum = 2; rowNum <= 7; rowNum++)
		{
			for(int colNum = 1; colNum <= 7; colNum++)
			{
				
				try 
				{
				    dayVal = driver.findElement(By.xpath(before_xpath+rowNum+after_xpath+colNum+"]")).getText();
				}catch(NoSuchElementException e) 
				{
				  	System.out.println("Please enter a correct date value"); 
				  	flag = false;
				  	break;
				}
				System.out.println(dayVal);
				if(dayVal.equals(day)) 
				{
					driver.findElement(By.xpath(before_xpath+rowNum+after_xpath+colNum+"]")).click();
		            flag = true;
					break;
				}
				  
			}
			if(flag)
			{
				break;
			}
				
		}
  		

	}

}
