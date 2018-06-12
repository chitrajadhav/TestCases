package com.scp.testng.testcasedemo;

import org.testng.annotations.Test;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {


// @Test()
	//@Test(groups={"a1","b1"})
//@Test(priority=2)
	//@Test(invocationCount=2)
	@Test(invocationCount=2,invocationTimeOut=5,timeOut=25)
	//@Test(suiteName="loginsute")
	//@Test(timeOut=25)
	public void f1()
	{
		System.out.println("Login test f1 ");
	}
	
	@Test(dependsOnMethods="f3",alwaysRun=true)
	public void f2()
	{
		System.out.println("Login test f2");
	}
	
	@Test
	
	 
	public void f3()
	{
		int x=5;
	
		System.out.println("Login test f3");
		System.out.println(x/0);
	}
	
	//@BeforeClass
	//@BeforeTest
	//@Test
	@BeforeMethod()
//@BeforeGroups
	public void f4()
	{
		System.out.println("Login test f4");
	}
	
}
