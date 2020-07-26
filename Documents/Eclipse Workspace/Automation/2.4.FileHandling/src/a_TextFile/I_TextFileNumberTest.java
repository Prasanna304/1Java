package a_TextFile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class I_TextFileNumberTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("/Users/Personal/Documents/Eclipse Workspace/Automation/2.4.FileHandling/File/TXT/I_TextFileNumberTest.txt");
		if(!f.exists()) {
			f.createNewFile();
		}
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		int i=1;
		while(i<=10) {
			bw.write(i+"");//only i print special charecter so to convert it into sting i+""
			bw.newLine();
			i++;
		}
		bw.close();
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String x="";
		while((x=br.readLine())!=null)
		{
			System.out.println(x);
		}
	}

}
