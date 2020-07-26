package c_ExcelFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class C_ExcelSingleRead {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("/Users/Personal/Documents/Eclipse Workspace/Automation/2.4.FileHandling/File/Excel/C_ExcelSingleRead.xlsx");
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Home");
		int row = sheet.getLastRowNum();
		int cell = sheet.getRow(0).getLastCellNum();
		System.out.println(row); 
		System.out.println(cell);
		String data =sheet.getRow(1).getCell(1).getStringCellValue();
		System.out.println(data);
		// Shows b2 because for read we start from 0 on both row and column
	}

}
