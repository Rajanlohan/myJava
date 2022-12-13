package basicWeb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SafariTestClass {

	public static void main(String[] args) {
		
		WebDriver driver = new SafariDriver();
		
		driver.get("http:\\www.google.com");
		
		System.out.println(driver.getTitle());
		

	}

}
