package org.webautomation.testcases;

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
import org.webTestingAutomation_base.Base_Class;

public class TC_008_Mouse_MoveTo_Element extends Base_Class {
	
	
	@Test
	public void tc_001() throws InterruptedException
	{
	
	   Actions act = new Actions(driver);
       
       act.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'TESTING QUIZ')]"))).perform();
       driver.findElement(By.xpath("//span[contains(text(),'JMeter Quiz')]")).click();

       act.keyDown(Keys.CONTROL).click(driver.findElement
    		           (By.xpath("//span[contains(text(),'Our blog')]"))).keyUp(Keys.CONTROL).build().perform();
       
	}
	
}



