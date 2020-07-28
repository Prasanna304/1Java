package e_DynamicPath;

import java.io.File;
import java.io.IOException;

public class A_DyanmicPath {

	public static void main(String[] args) throws IOException {
		
		File empty = new File("");
		String emptygetAbsolutePath = empty.getAbsolutePath();
		String emptygetCanonicalPath = empty.getCanonicalPath();
		String emptygetPath = empty.getPath();
		System.out.println("emptygetAbsolutePath--->    "+emptygetAbsolutePath);
		System.out.println("emptygetCanonicalPath--->   "+emptygetCanonicalPath);
		System.out.println("emptygetPath--->            "+emptygetPath);
		System.out.println();
		
		File f = new File("/Driver/geckodriver");
		String getAbsolutePath = f.getAbsolutePath();
		String getCanonicalPath = f.getCanonicalPath();
		String getPath = f.getPath();
		System.out.println("getAbsolutePath--->    "+getAbsolutePath);
		System.out.println("getCanonicalPath--->   "+getCanonicalPath);
		System.out.println("getPath--->            "+getPath);
		System.out.println();
		
		File dynamic = new File("../Driver/geckodriver");
		String dynamicgetAbsolutePath = dynamic.getAbsolutePath();
		String dynamicgetCanonicalPath = dynamic.getCanonicalPath();
		String dynamicgetPath = dynamic.getPath();
		System.out.println("dynamicgetAbsolutePath--->    "+dynamicgetAbsolutePath);
		System.out.println("dynamicgetCanonicalPath--->   "+dynamicgetCanonicalPath);
		System.out.println("dynamicgetPath--->            "+dynamicgetPath);
	}

}
