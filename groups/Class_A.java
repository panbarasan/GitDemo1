package groups;

import org.testng.annotations.Test;

public class Class_A {
	
	@Test(groups = {"smoke"})
	public void m1()
	{
		System.out.println("hello");
	}
	@Test(groups = {"Reg"})
	public void m2()
	{
		System.out.println("how r u");
	}

}
