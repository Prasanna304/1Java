package a_TextFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class F_TextFileMultipleReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f= new File("/Users/Personal/Documents/Eclipse Workspace/Automation/2.4.FileHandling/File/TXT/F_TextFileMultipleReader.txt");
		FileReader fr = new FileReader(f); // Throws filenotfound
		BufferedReader br = new BufferedReader(fr);
		System.out.println(br.readLine()); // throws ioexception
		System.out.println(br.readLine());
		System.out.println(br.readLine());
		System.out.println(br.readLine());
		System.out.println(br.readLine()); // null
		System.out.println(br.readLine());
	}

}