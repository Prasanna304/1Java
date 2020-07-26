package c_ExcelFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class J_ExcelTableCreation {

	public static void main(String[] args) throws IOException {
		File f = new File("/Users/Personal/Documents/Eclipse Workspace/Automation/2.4.FileHandling/File/Excel/J_ExcelTableCreation.xlsx");
		FileOutputStream fos = new FileOutputStream(f);
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Sheet1"); 
		
		Object[][] bookData = {
                {"Head First Java", "Kathy Serria", 79},
                {"Effective Java", "Joshua Bloch", 36},
                {"Clean Code", "Robert martin", 42},
                {"Thinking in Java", "Bruce Eckel", 35},
        };
		int rowCount = 0;
		
		for(Object[] aBook : bookData) {
			XSSFRow row = sheet.createRow(rowCount++);
			int columnCount = 0;
			for (Object field : aBook) {
				XSSFCell cell = row.createCell(columnCount++);
                if (field instanceof String) {
                    cell.setCellValue((String) field);
                } else if (field instanceof Integer) {
                    cell.setCellValue((Integer) field);
                }
			}
		}
		workbook.write(fos);
		fos.close();
			
			
			
		/*	
			
		for(int i=0;i<=100;i++) {
		XSSFRow row = sheet.createRow(i);
		XSSFCell cell = row.createCell(0);
		cell.setCellValue(i);
		}
		workbook.write(fos);
		fos.close();	
		*/
	}

}
