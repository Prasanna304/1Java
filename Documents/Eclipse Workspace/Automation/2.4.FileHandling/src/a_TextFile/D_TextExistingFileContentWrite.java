package a_TextFile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class D_TextExistingFileContentWrite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("/Users/Personal/Documents/Eclipse Workspace/Automation/2.4.FileHandling/File/TXT/D_ExistingFileContentWrite.txt");
		if(!f.exists()) {
			f.createNewFile();
		}
		FileWriter fw = new FileWriter(f,true); //to uppend the exitingfile
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("Hi a");
		bw.newLine();
		bw.write("Hi b");
		bw.newLine();
		bw.write("Hi c");
		bw.newLine();
		bw.write("Hi d");
		bw.newLine();
		bw.close();
	}

}
