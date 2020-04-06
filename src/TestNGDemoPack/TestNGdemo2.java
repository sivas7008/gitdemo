package TestNGDemoPack;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGdemo2 {
	
	@BeforeTest
	public void Test1()
	{
		System.out.println("I am from BeforeTest Method Class2");
		
	}
	
	@Test
	public void MobileLoan() 
	{
		System.out.println("I am from Test2 Method Class2");
		
	}
	
	@Test(groups="SmokeTest")
	public void CarLoan() 
	{
		System.out.println("I am from Test3 Method Class2");
		
	}
	@Test(groups="RegressionTest")
	public void SchoolLoan() 
	{
		System.out.println("I am from Test4 Method Class2");
		
	}
	
	@AfterTest
	public void Test5()
	{
		System.out.println("I am from After Test Method Class2");
		
	}

}
