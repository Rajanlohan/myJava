package org.webautomation.testcases;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.webTestingAutomation_Library.PropertyReader;
import org.webTestingAutomation_base.Base_Class;

public class TC_007_Mouse_click_doubleClick extends Base_Class {
	

	@Test
	public void tc_001() throws InterruptedException, IOException
	{
	   driver.findElement(By.name("fld_username")).sendKeys(PropertyReader.applicationConfig("App_username"));
	   Actions act = new Actions(driver);
       
//	   act.click(driver.findElement(By.xpath("//a[text()='Read Detail']"))).perform();
	   
	   act.contextClick(driver.findElement(By.xpath("//a[text()='Read Detail']"))).perform();


	}
	
}



