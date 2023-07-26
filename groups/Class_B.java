package groups;

import org.testng.annotations.Test;

public class Class_B {
	
	@Test(groups = {"Functional"})
	public void m1()
	{
		System.out.println("hyyy");
	}
	@Test(groups = {"Reg"})
	public void m2()
	{
		System.out.println("come");
	}

}
