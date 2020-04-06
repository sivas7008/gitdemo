package TestNGDemoPack;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGdemo10 {
	
	@Test
	public void demo1()
	{
		Assert.assertTrue(true);
	}
	@Test
		public void demo2()
	{
		Assert.assertTrue(false);
	}
	
	
}
