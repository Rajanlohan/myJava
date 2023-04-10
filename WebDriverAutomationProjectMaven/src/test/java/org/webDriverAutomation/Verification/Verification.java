package org.webDriverAutomation.Verification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Verification {

	public static boolean validateURL(WebDriver driver, String expURL)
	{
		boolean result = false;
		if(driver.getCurrentUrl().equalsIgnoreCase(expURL))
		{
			result = true;
		}
		return result;
	}
	
// ---------------------*******************************---------------------------------------------
	public static boolean validateTitle(WebDriver driver, String expTitle)
	{
		boolean result= false;
		if(driver.getTitle().equalsIgnoreCase(expTitle))
		{
			result = true;
		}
		return result;
	}
	
// ---------------------*******************************---------------------------------------------

	public static boolean elementExists(WebDriver driver, String xpath)
	{
		boolean result = false;
		try 
		{
			driver.findElement(By.xpath(xpath));
			result = true;
		
		}catch(Exception e)
		{
			
		}
		return result;
	}

// ---------------------*******************************---------------------------------------------

	public static boolean elementExists(WebDriver driver, String loctype, String locValue)
	{
		boolean result = false;
		try
		{
			if(loctype.equalsIgnoreCase("xpath"))
			{
				driver.findElement(By.xpath(locValue));
			}
			else if(loctype.equalsIgnoreCase("id"))
			{
				driver.findElement(By.id(locValue));
			}
			else if(loctype.equalsIgnoreCase("name"))
			{
				driver.findElement(By.name(locValue));
			}
			result = true;
		
		}catch(Exception e)
		{
			
		}
		return result;
	}
	
// ---------------------*******************************---------------------------------------------
	
	public static boolean validateTextOnElement(WebDriver driver, String loctype, String locValue, String expText)
	{
		boolean result = false;
		String actualValue = "";
		try
		{
			if(loctype.equalsIgnoreCase("xpath"))
			{
				actualValue = driver.findElement(By.xpath(locValue)).getText();
			}
			else if(loctype.equalsIgnoreCase("id"))
			{
				actualValue = driver.findElement(By.id(locValue)).getText();
			}
			else if(loctype.equalsIgnoreCase("name"))
			{
				actualValue = driver.findElement(By.name(locValue)).getText();
			}
			
			if(actualValue.equalsIgnoreCase(expText))
			{
				result = true;
			}
				
		}catch(Exception e)
		{
			
		}
		return result;
	}
	
// ---------------------*******************************---------------------------------------------
	
	public static String validateTextPresentOnElement(WebDriver driver, String loctype, String locValue)
	{
		
		String actualValue = "";
		try
		{
			if(loctype.equalsIgnoreCase("xpath"))
			{
				actualValue = driver.findElement(By.xpath(locValue)).getText();
			}
			else if(loctype.equalsIgnoreCase("id"))
			{
				actualValue = driver.findElement(By.id(locValue)).getText();
			}
			else if(loctype.equalsIgnoreCase("name"))
			{
				actualValue = driver.findElement(By.name(locValue)).getText();
			}
			
				
		}catch(Exception e)
		{
			
		}
		return actualValue ;
	}
	
//  ****************************************************************************************************************
	
	public static boolean validateTextOnPage(WebDriver driver, String expVal)
	{
		boolean result = false;
		if(driver.getPageSource().contains(expVal))
		{
			result = true;
		}
		return result;
	}
	
//  ****************************************************************************************************************

	public static boolean validateAttribute(WebDriver driver, String loctype, String locVal, String attributename, String expVal)
	{
		boolean result = false;
		String actVal = "";
		try
		{
			if(loctype.equalsIgnoreCase("xpath"))
			{
				actVal = driver.findElement(By.xpath(locVal)).getAttribute(attributename);
			}
			else if(loctype.equalsIgnoreCase("id"))
			{
				actVal = driver.findElement(By.id(locVal)).getAttribute(attributename);
			}
			else if(loctype.equalsIgnoreCase("name"))
			{
				actVal = driver.findElement(By.name(locVal)).getAttribute(attributename);
			}
			
			if(actVal.equalsIgnoreCase(expVal))
			{
				result = true;
			}
		}
		catch(Exception e)
		{
			
		}
		
		return result;
	}
	
//***************************************************************************************************************
	
	public static boolean validateElementVisibility(WebDriver driver, String loctype, String locVal)
	{
	   boolean result = false;
	   try
	   {
		   if(loctype.equalsIgnoreCase("xpath"))
		   {
			   result = driver.findElement(By.xpath(locVal)).isDisplayed();
		   }
		   else if(loctype.equalsIgnoreCase("id"))
		   {
			   result = driver.findElement(By.id(locVal)).isDisplayed();
		   }
		   else if(loctype.equalsIgnoreCase("name"))
		   {
			   result = driver.findElement(By.name(locVal)).isDisplayed();
		   }
		   
	   }
	   catch(Exception e) {
		   
	   }
		return result;
	}
	
//	******************************************************************************
	
	public static boolean validateElementEnable(WebDriver driver, String loctype, String locVal)
	{
	   boolean result = false;
	   try
	   {
		   if(loctype.equalsIgnoreCase("xpath"))
		   {
			   result = driver.findElement(By.xpath(locVal)).isEnabled();
		   }
		   else if(loctype.equalsIgnoreCase("id"))
		   {
			   result = driver.findElement(By.id(locVal)).isEnabled();
		   }
		   else if(loctype.equalsIgnoreCase("name"))
		   {
			   result = driver.findElement(By.name(locVal)).isEnabled();
		   }
		   
	   }
	   catch(Exception e) {
		   
	   }
		return result;
	}
	
//	*******************************************************************************
	
	public static boolean validateElementSelected(WebDriver driver, String loctype, String locVal)
	{
	   boolean result = false;
	   try
	   {
		   if(loctype.equalsIgnoreCase("xpath"))
		   {
			   result = driver.findElement(By.xpath(locVal)).isSelected();
		   }
		   else if(loctype.equalsIgnoreCase("id"))
		   {
			   result = driver.findElement(By.id(locVal)).isSelected();
		   }
		   else if(loctype.equalsIgnoreCase("name"))
		   {
			   result = driver.findElement(By.name(locVal)).isSelected();
		   }
		   
	   }
	   catch(Exception e) {
		   
	   }
		return result;
	}
	
	
}
