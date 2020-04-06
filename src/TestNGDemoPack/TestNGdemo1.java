package TestNGDemoPack;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGdemo1 {
	
	@BeforeTest
	public void Test1()
	{
		System.out.println("I am from BeforeTest Method Class1");
		
	}
	
	@Test(description="This is from TestNGdemo1 test methods")
	public void Test2()
	{
		System.out.println("I am from Test2 Method");
		
	}
	@Test(groups="SmokeTest")
	public void Test3()
	{
		System.out.println("I am from Test3 Method");
		
	}
	@Test(groups="RegressionTest")
	public void Test4()
	{
		System.out.println("I am from Test4 Method");
		
	}
	@AfterTest
	public void Test5()
	{
		System.out.println("I am from AfterTest Method Class1");
		
	}

}
