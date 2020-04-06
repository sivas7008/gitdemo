package TestNGDemoPack;

import org.testng.annotations.Test;

public class TestNGdemo4 {
	
	@Test(dependsOnMethods={"Weblogin"})
	public void APIlogin()
	{
		System.out.println("I am from APIlogin");
	}
	
	@Test
	public void Weblogin()
	{
		System.out.println("I am from Weblogin");
	}
	@Test
	public void Mobilelogin()
	{
		System.out.println("I am from Mobilelogin");
	}
}
