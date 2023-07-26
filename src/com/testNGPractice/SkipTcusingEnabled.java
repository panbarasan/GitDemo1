package com.testNGPractice;

import org.testng.annotations.Test;

public class SkipTcusingEnabled {
	
	@Test//by default the enabled boolean value is true, if you want to skip any tc then use enable=false 
	public void method1() {
		
		System.out.println("method 1");
		
	}
	@Test
public void method2() {
		
		System.out.println("method 2");
		
	}
	@Test
public void method3() {
	
	System.out.println("method 3");
	
}

}
