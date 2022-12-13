package com.interview;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CovidGraph {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.google.com/search?q=covid+case+in+india&oq=covid+case+in+india&aqs=chrome..69i57j0i433i512j0i457i512j0i512l7.8403j0j15&sourceid=chrome&ie=UTF-8");
		
		List<WebElement> graph = driver.findElements(By.xpath("(//*[local-name()='svg' and @class='uch-psvg'])[1]//*[name()='rect']"));
        Actions act = new Actions(driver);
		for(WebElement e : graph) {
			act.moveToElement(e).perform();
			String str = driver.findElement(By.xpath("//*[@class='ExnoTd']")).getText();
		    System.out.println(str);
		}
		
		
	}

}
