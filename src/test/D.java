package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class D extends Parent  {
	
	@Test
	public void m7() {
		System.out.println("class d m10");
	}
	@Test
	public void m8() {
		System.out.println("class d m11");
	}
	@Test
	public void m9() {
		System.out.println("class d m12");
	}
	
	@BeforeClass
	public void beforeclassc() {
		System.out.println("class d before class");
	}
	
	@AfterClass
	public void aftertest() {
		System.out.println("class d after class");
	}
	

}
