package org.maven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



 
public class ExcelToFacebook {

	
	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\Admin\\eclipse-workspace\\MavenStarts\\ExcelFile\\Hameed.xlsx");
		FileInputStream fl = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fl);
		Sheet sheetAt = w.getSheetAt(0);
		
		for (int i = 0; i < sheetAt.getPhysicalNumberOfRows(); i++) {
			Row row = sheetAt.getRow(i);
			
			for (int j = 0; j <row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				String stringCellValue = cell.getStringCellValue();
				System.out.println(stringCellValue);
				
				
				
				
				
			}
		}
		
		
		
		
		
		
		
	
}

     
	
	

}