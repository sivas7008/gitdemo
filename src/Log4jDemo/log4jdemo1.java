package Log4jDemo;

import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

public class log4jdemo1 {

	@Test
	public void loggindemo()
	{
		
		Logger log = Logger.getLogger(log4jdemo1.class);
		
				
	log.debug("I am from debug");
	log.warn("I am from warning");
log.error("I am from Error");
log.fatal("I am from Fatal");
		log.info("I am done");
		
		
	}
	
	
}
