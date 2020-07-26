package c_ExcelFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class G_UpdateCell {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("/Users/Personal/Documents/Eclipse Workspace/Automation/2.4.FileHandling/File/Excel/G_UpdateCell.xlsx");
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Home");
		int row = sheet.getLastRowNum() + 1;// add 1 because value is 0 1 2 so output is 3
		int cell = sheet.getRow(0).getLastCellNum();
		System.out.println(row);
		System.out.println(cell);

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < cell; j++) {
				if (sheet.getRow(i).getCell(j) != null) {
					if (sheet.getRow(i).getCell(j).getCellType() == Cell.CELL_TYPE_STRING) {
						String data = sheet.getRow(i).getCell(j).getStringCellValue();
						System.out.print(data + " ");
					} else if (sheet.getRow(i).getCell(j).getCellType() == Cell.CELL_TYPE_NUMERIC) {
						int data = (int) sheet.getRow(i).getCell(j).getNumericCellValue();
						System.out.print(data + " ");
					}
				}
			}
			System.out.println("");
		}
		//Write
		FileOutputStream fos = new FileOutputStream(f); //to open a temp file
		sheet.getRow(1).getCell(0).setCellValue("test"); //to write on this cell
		workbook.write(fos); //to save the tempfile into workbook
		fos.close(); //to close the tempfile
		
		System.out.println("");
		System.out.println("After write");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < cell; j++) {
				if (sheet.getRow(i).getCell(j) != null) {
					if (sheet.getRow(i).getCell(j).getCellType() == Cell.CELL_TYPE_STRING) {
						String data = sheet.getRow(i).getCell(j).getStringCellValue();
						System.out.print(data + " ");
					} else if (sheet.getRow(i).getCell(j).getCellType() == Cell.CELL_TYPE_NUMERIC) {
						int data = (int) sheet.getRow(i).getCell(j).getNumericCellValue();
						System.out.print(data + " ");
					}
				}
			}
			System.out.println("");
		}
	}

}
