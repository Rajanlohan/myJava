package basicWeb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestClass {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http:\\www.google.com");
		
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.equals("Google"))
		{
			System.out.println("correct title");
		} else
		{
			System.out.println("incorrect title");
		}
		
		System.out.println(driver.getCurrentUrl());
//		System.out.println(driver.getPageSource());
		
		driver.quit();
		

	}

}
