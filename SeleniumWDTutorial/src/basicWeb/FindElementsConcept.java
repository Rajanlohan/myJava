package basicWeb;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsConcept {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.ebay.com/");
		
		//1. get the total count of links on the page
		//2. get the text of each link on the page

		List<WebElement> linklist = driver.findElements(By.tagName("a"));
		
		//(input, button) etc we can find that
		System.out.println(linklist.size());
		
		for(int i=0; i<linklist.size(); i++)
		{
			String linktext = linklist.get(i).getText();
			System.out.println(linktext);
		}

	}

}
