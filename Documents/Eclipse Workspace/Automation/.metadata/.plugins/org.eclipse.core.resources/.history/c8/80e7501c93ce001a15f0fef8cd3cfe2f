package c_ExcelFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class B_ExcelFile {

	public static void main(String[] args) throws IOException {
		
		// create a excel file and copy the file path
		File f = new File("/Users/Personal/Documents/Eclipse Workspace/Automation/2.4.FileHandling/File/Excel/B_ExcelFile.xlsx");
		FileInputStream fis = new FileInputStream(f);
		//to goto workbook
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		//to go sheet by two ways name and index of sheet
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		//already Filled with 3*3
		//get the row count
		int row = sheet.getLastRowNum();
		//get column count
		int cell = sheet.getRow(0).getLastCellNum(); // when row and column meets its cell
		System.out.println(row); //2=>length calculate => row as 0,1,2
		System.out.println(cell); //3=>length calculate => cell 1,2,3
	}

}
