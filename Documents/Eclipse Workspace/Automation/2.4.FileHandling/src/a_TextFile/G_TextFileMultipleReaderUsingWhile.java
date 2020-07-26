package a_TextFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class G_TextFileMultipleReaderUsingWhile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f= new File("/Users/Personal/Documents/Eclipse Workspace/Automation/2.4.FileHandling/File/TXT/G_TextFileMultipleReaderUsingWhile.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		//br.readLine();//to read the line
		//x=br.readLine();//show error to declaration
		String x="";// declaration
		//x=br.readLine();//stored in x
		//(x=br.readLine())!=null // Checking it has value i.e, goto last line or not
		while((x=br.readLine())!=null)
		{
			System.out.println(x);
		}
	}

}
