package com.testNGPractice;

import org.testng.annotations.Test;

public class PriorityKeyword {
	
	//**without Priority Keyword**//
	//**Test case oredre is changing based on the alphabet **//
	//putFirstGear
	//putSecondGear
	//putThireddGear
	//car stsrted
	
	
	@Test
	public void startThear()
	{
		System.out.println("car stsrted");
	}
	@Test
	public void putFirstGear()
	{
		System.out.println("putFirstGear");
	}
	@Test
	public void putSecondGear()
	{
		System.out.println("putSecondGear");
	}
	@Test
public void putThireddGear()
{
		System.out.println("putThireddGear");
	}
	
	
	//**with Priority Keyword**//
		//**Test case oredre is followed based on the priority keyword **//
		//car started
	//putFirstGear
//	putSecondGear
//	putThireddGear
//	@Test(priority=0)
//	public void startThear()
//	{
//		System.out.println("car started");
//	}
//	@Test(priority = 1)
//	public void putFirstGear()
//	{
//		System.out.println("putFirstGear");
//	}
//	@Test(priority = 2)
//	public void putSecondGear()
//	{
//		System.out.println("putSecondGear");
//	}
//	@Test(priority = 3)
//	public void putThireddGear()
//	{
//		System.out.println("putThireddGear");
//	}
	
	

}
