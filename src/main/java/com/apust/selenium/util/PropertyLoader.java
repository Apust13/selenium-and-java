package com.apust.selenium.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/*
 * Class that extracts properties from the prop file.
 * 
 * @author Sebastiano Armeli-Battana
 */
public class PropertyLoader {

	private static final String PROP_FILE = "/application.properties";
        
        private PropertyLoader() {}

	public static String loadProperty(String name) {
//		Properties props = new Properties();
//		
//		try {
//			props.load(PropertyLoader.class.getClassLoader().getResourceAsStream(PROP_FILE));
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//
//		String value = "";
//
//		if (name != null) {
//			value = props.getProperty(name);
//		}
//		return value;
		Properties properties = new Properties();
		Thread currentThread = Thread.currentThread();
		ClassLoader contextClassLoader = currentThread.getContextClassLoader();
		InputStream propertiesStream = contextClassLoader.getResourceAsStream(PROP_FILE);
		if (propertiesStream != null) {
		  try {
			properties.load(propertiesStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  // TODO close the stream
		} else {
		  // Properties file not found!
		}
		
		String value = "";

				if (name != null) {
					value = properties.getProperty(name);
			}
				return value;

		
	}
}