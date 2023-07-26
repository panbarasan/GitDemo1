package test;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class DependsOn {
	
	@Test
	public void mep1()
	{
		assertTrue(false);
		System.out.println("hi");
		
	}
	@Test(dependsOnMethods = {"mep1"}, alwaysRun = true)
	public void mep2()
	{
		System.out.println("hello");
	}
	
	@Test(dependsOnMethods = {"mep2"})
	public void mep3()
	{
		System.out.println("hrw");
	}

}
