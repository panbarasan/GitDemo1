package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Parent {
	
	@BeforeClass
	public void beforeclassc() {
		System.out.println("parent before class--");
	}
	
	@AfterClass
	public void afterclass() {
		System.out.println("parent after class--");
	}
	
	//@BeforeTest
	public void beforetest() {
		System.out.println("parent before test--");
	}
	
	//@AfterTest
	public void aftertest() {
		System.out.println("parent after test--");
	}
	
	@BeforeSuite
		public void beforesuite() {
			System.out.println("parent before suite--");
		}
		
		@AfterSuite
		public void aftersuite() {
			System.out.println("parent after suite--");
		}
		
		@BeforeMethod
		public void bfmethod()
		{
			System.out.println("parent bfmethod");
		}
		
	@AfterMethod
		public void afmethod()
		{
			System.out.println("parent afmethod");
		}

}
