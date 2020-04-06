package TestNGDemoPack;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGdemo6 {
	
	@Test
	@Parameters({"a","b"})
	public void Sum(int c, int d)
	{
		System.out.println(c+d);
		
	}
	@Test
	@Parameters({"a","b"})
	public void Subraction(int a, int b)
	{
		System.out.println(a-b);
	}
	
	
}
