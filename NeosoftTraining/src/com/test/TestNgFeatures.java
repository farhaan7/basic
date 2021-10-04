package com.test;

import org.testng.annotations.Test;

public class TestNgFeatures {
	//depends on methods tells that the method is dependent on the success of the respective method.
	//if the method is successful then only the dependent method will run or else it will be shown as skipped.!!!
	@Test
	public void loginTest(){		//if logintest gets failed then other tests wont run as they r dependent on it!!
		System.out.println("login test");
	//	int i = 9/0;
	}
	
	@Test(dependsOnMethods="loginTest")
	public void HomePageTest(){
		System.out.println("Home Page test");
	}
	
	@Test(dependsOnMethods="loginTest")
	public void SearchPageTest(){
		System.out.println("SearchPageTest");
	}
	
	@Test(dependsOnMethods="loginTest")
	public void RegPageTest(){
		System.out.println("RegPageTest");
	}
	
	
	
	

}
