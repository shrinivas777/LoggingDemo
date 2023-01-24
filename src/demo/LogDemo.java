package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogDemo {

	public static Logger log;
	
	public static void main(String[] args) {
		log =LogManager.getLogger(LogDemo.class);
				
		log.info("This is info message");
		log.error("This is error message");
		log.debug("This is debug message");
		log.warn("This is warn message");
		log.fatal("This is fatal message");

	}

}
