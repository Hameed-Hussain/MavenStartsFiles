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

public class PracticeExcel {
	
	public static Object [][] provider() throws IOException {
		
		File f = new File("C:\\Users\\Admin\\eclipse-workspace\\MavenStarts\\ExcelFile\\Hameed.xlsx");
		FileInputStream fi = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fi);
		Sheet sheet = w.getSheet("Hameed1");
	    Object [][]data = new Object[sheet.getPhysicalNumberOfRows()][sheet.getRow(0).getPhysicalNumberOfCells()];
			
	
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i+1);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
			data [i][j]	=cell.toString();
				
			}
			
		}
		return data;
		
		
	}


}
