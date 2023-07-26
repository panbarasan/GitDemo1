package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class C extends Parent  {
	
	@Test
	public void m7() {
		System.out.println("class c m7");
	}
	@Test
	public void m8() {
		System.out.println("class c m8");
	}
	@Test
	public void m9() {
		System.out.println("class c m9");
	}
	
	@BeforeClass
	public void beforeclassc() {
		System.out.println("class c before class");
	}
	
	@AfterClass
	public void aftertest() {
		System.out.println("class c after class");
	}

}
