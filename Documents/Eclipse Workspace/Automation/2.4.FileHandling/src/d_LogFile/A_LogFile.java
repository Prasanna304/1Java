/*
 * log4j in email and download 
 * Lib -> paste all except property file 
 * Build path
 * Create a log file
 * Copy and paste the property file in the folder
 * open and change the file path as "logfile -> path"
 */

package d_LogFile;

import org.apache.log4j.PropertyConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class A_LogFile {

	public static Logger log = LoggerFactory.getLogger(A_LogFile.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PropertyConfigurator.configure("/Users/Personal/Documents/Eclipse Workspace/Automation/2.4.FileHandling/File/Log/log4j.properties");
		log.info("Info 1");
		log.error("Error 1");
	}

}
