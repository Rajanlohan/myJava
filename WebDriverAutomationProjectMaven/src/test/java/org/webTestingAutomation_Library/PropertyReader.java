package org.webTestingAutomation_Library;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
	
	public static String applicationConfig(String key) throws IOException
	{
		File f = new File("./ApplicationConfig_File/ApplicationConfig.properties");
		FileReader fr = new FileReader(f);
		
		Properties pro = new Properties();
		pro.load(fr);
		return pro.get(key).toString();
		
	}

	
	public static String locatorConfig(String key) throws IOException
	{
		File f = new File("./ElementLocator_File/LocatorConfig.properties");
		FileReader fr = new FileReader(f);
		
		Properties pro = new Properties();
		pro.load(fr);
		return pro.get(key).toString();
		
	}
}
