package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class B extends Parent  {
	
	@Test
	public void m4() {
		System.out.println("class b m4");
	}
	@Test
	public void m5() {
		System.out.println("class b m5");
	}
	@Test
	public void m6() {
		System.out.println("class b m6");
	}
	
	@BeforeTest
	public void beforetestB() {
		System.out.println("class B before test");
	}
	
	@AfterTest
	public void aftertestB() {
		System.out.println("class B after test");
	}

}
