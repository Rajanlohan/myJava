package demojava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;	
import java.util.Properties;

public class PropertiesFile {



	public static void main(String[] args) throws Exception {
		
		Properties p = new Properties();
//		OutputStream os = new FileOutputStream("dataConfig.properties");
//		
//		p.setProperty("url", "localhost:3306\\myname");
//		p.setProperty("username", "RAJAN");
//	    p.setProperty("password", "112233");
	    
//	    p.store(os, null);
		
        InputStream is = new FileInputStream("dataConfig.properties");
        p.load(is);
        
//        System.out.println(p.getProperty("username"));
//        System.out.println(p.getProperty("url"));
//        System.out.println(p.getProperty("password"));
        
        p.list(System.out);
	}

}
