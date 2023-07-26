package paremeters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Class_A {
	
	@Parameters({"url"})
	@Test()
	public void m1( String url)
	{
		System.out.println("hello");
		System.out.println("url values comming from parameter"+url);
	}
	@Test()
	public void m2()
	{
		System.out.println("how r u");
	}

}
