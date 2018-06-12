package com.scp.testng.testcasedemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class BTest {

	@Test
	public void b1(){
		System.out.println("btest class b1");
		
	}
	@Test
	public void b2(){
		System.out.println("btest class b2");
		
	}
	@Test
	public void b3(){
		System.out.println("btest class b3");
		
	}
	@Test
	public void b4(){
		System.out.println("btest class b4");
		
	}
	
	@AfterClass
	public void afterTestmethod()
	{
		System.out.println("after test b method ");
	}
}
