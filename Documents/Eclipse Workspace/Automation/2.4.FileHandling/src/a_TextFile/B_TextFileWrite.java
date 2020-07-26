package a_TextFile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class B_TextFileWrite {

	public static void main(String[] args) throws IOException {
				
		File f = new File("/Users/Personal/Documents/Eclipse Workspace/Automation/2.4.FileHandling/File/TXT/B_TextFileWrite.txt");
		if(!f.exists())	// because if file already exist don't create
			f.createNewFile();
		FileWriter fw = new FileWriter(f);
		//fw.write("vcentry"); // slow for bulk of data
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("Hi a");
		bw.close(); // to close the buffer so that file writer can get from buffer 
	}

}
