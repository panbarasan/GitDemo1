package com.testNGPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Suiteexample {
	
	WebDriver driver;
	long starttime;
	@BeforeSuite
  public void launchbrowser() {
	   starttime = System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jaya Pradha\\Desktop\\driver\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		 driver=new ChromeDriver();
	  
  }
//	@Test
//	public void openGoogle() {
//		long starttime = System.currentTimeMillis();
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jaya Pradha\\Desktop\\driver\\chromedriver.exe");
//		//WebDriver driver=new ChromeDriver();
//		WebDriver driver=new ChromeDriver();
//
//		//driver.get("https://www.google.com/");
//		//driver.quiet();
//		driver.get("https://www.google.com/");
//		driver.quit();
//		long endtime = System.currentTimeMillis();
//		
//		long totaltime=endtime-starttime;
//		System.out.println("TOTAL TIME TAKEN "+endtime);
//		
//
//	}
	
//	@Test
//	public void openYahoo() {
//		long starttime = System.currentTimeMillis();
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jaya Pradha\\Desktop\\driver\\chromedriver.exe");
//		//WebDriver driver=new ChromeDriver();
//		WebDriver driver=new ChromeDriver();
//
//		//driver.get("https://www.google.com/");
//		//driver.quiet();
//		driver.get("https://in.search.yahoo.com/?fr2=inr");
//		driver.quit();
//		long endtime = System.currentTimeMillis();
//		
//		long totaltime=endtime-starttime;
//		System.out.println("TOTAL TIME TAKEN "+endtime);
//
//
//	}
//	@Test
//	public void openBing() {
//		long starttime = System.currentTimeMillis();
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jaya Pradha\\Desktop\\driver\\chromedriver.exe");
//		//WebDriver driver=new ChromeDriver();
//		WebDriver driver=new ChromeDriver();
//
//		//driver.get("https://www.google.com/");
//		//driver.quiet();
//		driver.get("https://www.bing.com/");
//		driver.quit();
//		long endtime = System.currentTimeMillis();
//		
//		long totaltime=endtime-starttime;
//		System.out.println("TOTAL TIME TAKEN "+endtime);
//
//
//	}
	
	@Test
public void openGoogle() {
		driver.get("https://www.google.com/");
		
	}
	@Test
	public void openYahoo() {
			driver.get("https://in.search.yahoo.com/?fr2=inr");
			
		}
	@Test
	public void openBing() {
			driver.get("https://www.bing.com/");
			
		}
	@AfterSuite
	public void closebrowser() {
		driver.quit();
long endtime = System.currentTimeMillis();
		
		long totaltime=endtime-starttime;
		System.out.println("TOTAL TIME TAKEN "+endtime);
		
	}



}
