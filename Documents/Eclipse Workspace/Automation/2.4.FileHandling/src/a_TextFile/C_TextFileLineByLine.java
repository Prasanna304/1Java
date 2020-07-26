package a_TextFile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class C_TextFileLineByLine {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("/Users/Personal/Documents/Eclipse Workspace/Automation/2.4.FileHandling/File/TXT/C_TextFileLineByLine.txt");
		if(!f.exists()) {
			f.createNewFile();
		}
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("Hi a");
		bw.newLine(); // to create new line
		bw.write("Hi b");
		bw.newLine();
		bw.write("Hi c");
		bw.newLine();
		bw.write("Hi d");
		bw.newLine();
		bw.close();
	}

}