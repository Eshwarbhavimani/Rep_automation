package com.testng;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleTest {
	@BeforeSuite
	public void samplebeforesuite()
	{
		System.out.println("The before suite excution");
	}
	@BeforeTest
	public void sampleBeforeTest()
	{
		System.out.println("The excution of before tes");
	}
	@AfterTest
	public void sampleAfterTest()
	{
		System.out.println("The excution of After test");
	}
	@Test
	public void sampleTestngExample()
	{
		System.out.println("The example for testng");
	}
	@AfterSuite
	public void sampleAftersuite()
	{
		System.out.println("The aftersuite excution");
	}

}
