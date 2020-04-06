package TestNGDemoPack;

import org.testng.annotations.Test;

public class TestNGdemo3 {
	
	@Test(groups={"Group A"})
	public void VolvoCar()
	{
		System.out.println("I am from Group A");
	}
	@Test(groups={"Group A", "Group B"})
	public void Benz()
	{
		System.out.println("I am from Group A and B");
	}
	
	@Test(groups={"Group B"})
	public void Nissan()
	{
		System.out.println("I am from Group B");
	}

	
}
