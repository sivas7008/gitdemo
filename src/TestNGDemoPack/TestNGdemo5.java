package TestNGDemoPack;

import org.testng.annotations.Test;

public class TestNGdemo5 {
	@Test(priority=1)
	public void APIlogin()
	{
		System.out.println("I am from APIlogin");
	}
	
	@Test(timeOut=200)
	public void Weblogin() throws Exception
	{
		Thread.sleep(5000);
		System.out.println("I am from Weblogin");
	}
	@Test(priority=2)
	public void Mobilelogin()
	{
		System.out.println("I am from Mobilelogin");
	}
}
