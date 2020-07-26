package b_PropertyFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class A_PropertyFile {

	public static void main(String[] args) throws IOException {
		
		/*
		 * File input/output stream for files
		 * Image input/output stream for images
		 * Buffer input/output stream for read or write
		 */
		
		// To help with search a specific key and pick the value 
		File f= new File("/Users/Personal/Documents/Eclipse Workspace/Automation/2.4.FileHandling/File/Property/A_PropertyFile.properties");
		FileInputStream fis = new FileInputStream(f);
		Properties prop = new Properties();
		//there is no connection b/w fis and prop //2 diff package file->i.o and prop->util
		prop.load(fis);
		//prop.getProperty("username");
		System.out.println(prop.getProperty("username"));
	}
}
