package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class A extends Parent {
	@Test
	public void m1() {
		System.out.println("class a m1");
	}
	@Test
	public void m2() {
		System.out.println("class a m2");
	}
	@Test
	public void m3() {
		System.out.println("class a m3");
	}
	
	@BeforeTest
	public void beforetest() {
		System.out.println("class a before test");
	}
	
	@AfterTest
	public void aftertest() {
		System.out.println("class a after test");
	}
	
	@BeforeSuite
	public void beforesuite() {
		System.out.println("class a before suite--");
	}
	
	@AfterSuite
	public void aftersuite() {
		System.out.println("class a after suite--");
	}
	
	@BeforeMethod
	public void bfmethod()
	{
		System.out.println("class A bfmethod");
	}
	
@AfterMethod
	public void afmethod()
	{
		System.out.println("class A afmethod");
	}



}
