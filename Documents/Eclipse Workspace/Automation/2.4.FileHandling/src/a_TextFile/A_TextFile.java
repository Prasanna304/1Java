package a_TextFile;

import java.io.File;
import java.io.IOException;

public class A_TextFile {

	public static void main(String[] args) throws IOException {
		
		// Project -> right click -> new folder -> right click -> properties -> copy location
		File f = new File("/Users/Personal/Documents/Eclipse Workspace/Automation/2.4.FileHandling/File/TXT/A_TextFile.txt");
		// For windows
		// File f = new File("F:\\Automation\\WorkSpace\\FileHandlingTest\\TestFolder\\Test.txt");	
		// doesn't have input file name so give it in location itself
		f.createNewFile();
		// shows error -> mouse over -> says throws exception -> Add exception IO Exception
		// Why IO -> File not found exception handles already because file is created but if empty it will handle 

	}

}
