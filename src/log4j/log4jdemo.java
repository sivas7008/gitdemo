package log4j;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

public class log4jdemo {
	
	static Logger log = Logger.getLogger(log4jdemo.class);
	
	public static void main (String args[])
	{
		DOMConfigurator.configure("log4j.xml");
		log.debug("I am from debug");
		log.info("I am from info message");
		log.warn("I am from warning message");
	log.error("I am from error message");
	log.fatal("I am from Fatal message");
		
	}
	
	public void cal()
	{
		System.out.println("I am logging it for testing github");
	}
	

}
