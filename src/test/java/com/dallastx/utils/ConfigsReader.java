package com.dallastx.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigsReader {
public static Properties prop;
	
	/**
	 * This method will read property file
	 * @param filePath
	 */

	public static void readProperTies(String filePath) {

		try {
			FileInputStream fis = new FileInputStream(filePath);
			prop = new Properties();
			prop.load(fis);
			fis.close();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}
	/**
	 * This method will return value of specified key
	 * @param String key
	 * @return String value
	 */

	public static String getProperty(String key) {

		return prop.getProperty(key);

	}
}
