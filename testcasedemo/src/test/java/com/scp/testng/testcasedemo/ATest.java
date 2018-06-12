package com.scp.testng.testcasedemo;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ATest {

	
	@Test
	public void a1()
	{
		System.out.println("Atest class a1" );
	}
	@Test
	public void a2()
	{
		System.out.println("Atest class a2" );
	}
	@Test
public void a3()
	{
		System.out.println("Atest class a3" );
	}
	@Test
	public void a4()
	{
		System.out.println("Atest class a4" );
	}
	
	@BeforeClass
	public void beforeMethodTest()
	{
		System.out.println("this is before method");
	}
}

