package com.nagp.Utils.Logs;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.nagp.Context.Constants;
//import com.nagp.Pages.BasePage;

public class Logs{

	public static  Logger logger;

	public  static Logger logSetup() {
	logger = Logger.getLogger("Logger_file");
	PropertyConfigurator.configure(Constants.LOG_PROPERTIES_PATH);
	return logger;
	}

}
