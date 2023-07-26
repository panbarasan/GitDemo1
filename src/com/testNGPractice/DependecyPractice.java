package com.testNGPractice;

import org.testng.annotations.Test;

public class DependecyPractice {
	
	//group of friends planning for munnar trip
	//step1:frst they need to plan
	//step2:book a ticket
	//step3:reach munnar
	
	//in the above all 3 steps depends on one another//
	@Test      //(enabled = false)
	public void planning()
	{
		System.out.println("plan successfull");
	}
	@Test(dependsOnMethods = "planning")
	public void ticketBooking()
	{
		System.out.println("ticketBooking successfull");
	}
	@Test(dependsOnMethods = "ticketBooking")
	public void munnar()
	{
		System.out.println("reached munnar successfull");
	}
	
	
	

}
