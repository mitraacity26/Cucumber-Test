package org.automation.testingworld.utility;

import java.io.FileInputStream;

import java.util.Properties;

public class Utility {
	
	public static Object fetchPropertyValue(String key) throws Exception
	{
		
		FileInputStream file=new FileInputStream("./Config/config.properties");
		Properties property=new Properties();
		property.load(file);
		return property.get(key);
		
	}
	
	public static Object fetchOR(String key) throws Exception
	{
		
		FileInputStream file=new FileInputStream("./Config/ElementRepository.properties");
		Properties property=new Properties();
		property.load(file);
		return property.get(key);
		
	}

}
