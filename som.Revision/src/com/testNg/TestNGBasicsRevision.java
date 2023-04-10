package com.testNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasicsRevision {

	@BeforeSuite
	public void setup() {
		System.out.println("setup system property for chrome");
	}

	@BeforeTest
	public void launchBrowser() {
		System.out.println("launch Browser");
	}

	@BeforeClass
	public void login() {
		System.out.println("login to app");
	}

	@BeforeMethod
	public void enterURL() {
		System.out.println("Before enter URL");
	}

	@Test
	public void googleTitleTest() {
		System.out.println("Google title test");
	}
	
	@Test
	public void searchTitle() {
		System.out.println("search the title");
	}

	@AfterMethod
	public void logout() {
		System.out.println("After Method logout the app");
	}

	@AfterClass
	public void logOut() {
		System.out.println("close Browser");
	}

	@AfterTest
	public void deleteAllCookies() {
		System.out.println("delete all cookies");
	}

}
