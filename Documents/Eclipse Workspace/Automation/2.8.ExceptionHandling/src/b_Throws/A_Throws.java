/*
 * Throw Throws and Throwable
 * Throw will create error
 * Throws will inform the error
 * Throwable will handle the error
 */

package b_Throws;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class A_Throws {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Step 5:
		fileHandling();//step 6 shows error mouseover will add filenot found
						//Step 9 shows error mouseover will add IOException
	}
		//Step 1:
		public static void fileHandling() throws IOException {//step 4: Add filenot found
															  //afer step 8 it changed into ioexception
		//Step 2:
		File f = new File("");
		//Step 3: Shows error in new FileInputStream(f); mouseover will add 4
		FileInputStream fis = new FileInputStream(f);
		//step 7:
		Properties prop = new Properties();
		prop.load(fis);//step 8:shows error mouseover will add IOException
		
		//throws inform error whereever the function calls 
		
	}
	}
