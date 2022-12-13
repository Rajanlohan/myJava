package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasics {
	
	@BeforeSuite   //1
	public void setUp() {
		System.out.println("setup system property for chrome");
	}
	
	@BeforeTest  //2
	public void login() {
		System.out.println("login method");
	}
		
	@BeforeClass  //3
	public void launchBrowser() {
		System.out.println("launch chrome Browser");
	}
	
	@BeforeMethod  //4
	public void enterURL() {
		System.out.println("enter URL");
	}
	
	@Test   //5
	public void googleTitleTest() {
		System.out.println("Google Title Test");
	}
	
	@AfterMethod   //6
	public void logOut() {
		System.out.println("logout from app");
	}
	
    @AfterClass
    public void closeBrowser() {
    	System.out.println("Close Browser");
    }
    
    @AfterTest  //7
    public void deleteAllCookies() {
    	System.out.println("deleteAllCookies");
    }
    
    
    
	
	

}





