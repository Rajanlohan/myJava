package arrayString;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {

	public void fetchPropertyData() throws IOException {
	Properties prop = new Properties();
	File f = new File("./ConfigFolder/ApplicationConfig.properties");
	FileReader fr = new FileReader(f);
	prop.load(fr);
	System.out.println(prop.get("Application_URL"));
	
	}
	}
