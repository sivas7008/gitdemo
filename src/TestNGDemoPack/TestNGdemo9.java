package TestNGDemoPack;

import org.testng.Assert;
import org.testng.TestNG;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGdemo9 {
	
	@Test(dataProvider="dataset")
	public void demo1(String a, String b)
	{
		System.out.println(a);
		System.out.println(b);
	}
	@Test
		public void demo2()
	{
		System.out.println("I am from test2");
	}
	
	@DataProvider(name="dataset")
	public Object[][] testData()
	{
		Object[][] test = new Object[2][2];
		test[0][0] = "Siva";
		test[0][1] = "Avyukth";
		test[1][0]="Sulo";
		test[1][1]="Karthick";
		
		return test;
		
		
	}
	
}
