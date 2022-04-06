package edu.baylor.ecs.si;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.zip.CheckedOutputStream;

public class Timer {
	
	private static Logger logger = Logger.getLogger(Timer.class.getName());

	
	static {
		try {
			InputStream configFile = Timer.class.getClassLoader().getResourceAsStream("logger.properties");
			LogManager.getLogManager().readConfiguration(configFile);
			configFile.close();
		} catch (IOException ex) {
			System.out.println("WARNING: Could not open configuration file");
		    System.out.println("WARNING: Logging not configured (console output only)");
		}
		logger.info("starting the app");
	
	}
	
	/*
	 * Just sleep
	 */
	private static void method(long time) throws InterruptedException {
		Thread.sleep(time);
	}
	
	public static long timeMe(long timeToWait) throws TimerException {
		//Long timeNow = System.currentTimeMillis();
		Long timeNow =  System.currentTimeMillis();
		try {
		  if (timeToWait < 0) {
			  throw new TimerException("Cannot be less than zero");
			  
		  }
	     
		  method(timeToWait);
			
		} catch (InterruptedException e) {
			logger.severe("InterruptedException rised");
			throw new TimerException("Sleep exception", e);
		} finally {
			logger.info("Calling took: "+ (System.currentTimeMillis() - timeNow));
			logger.info("* should take: "+ timeToWait);
		}
		return timeNow;
	}
}
