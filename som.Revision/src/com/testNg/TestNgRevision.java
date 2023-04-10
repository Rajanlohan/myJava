package com.testNg;

import org.testng.annotations.Test;

public class TestNgRevision {

	@Test
	public void loginTest() {
		System.out.println("login test");
		
	}
	
	@Test(dependsOnMethods="loginTest")
	public void homePage() {
		System.out.println("home page test");
	}
	
	@Test(dependsOnMethods="loginTest")
	public void searchTest() {
		System.out.println("search test");
	}
}
