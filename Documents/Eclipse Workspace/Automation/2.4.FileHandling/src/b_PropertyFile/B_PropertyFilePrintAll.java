package b_PropertyFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class B_PropertyFilePrintAll {

	public static void main(String[] args) throws IOException {
		
		File f= new File("/Users/Personal/Documents/Eclipse Workspace/Automation/2.4.FileHandling/File/Property/B_PropertyFilePrintAll.properties");
		FileInputStream fis = new FileInputStream(f);
		Properties prop = new Properties();
		prop.load(fis);
		// Enumurator is similar to hashtable change value into property (object id)
		Enumeration e = prop.keys();
		while(e.hasMoreElements()) {
			String key = (String) e.nextElement();
			System.out.println(key+"---"+prop.get(key));
		}
	}

}
