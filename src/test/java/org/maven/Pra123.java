package org.maven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Pra123 {
	
	public static Object[][] initiate() throws IOException {
		
	
		
		
		File f = new File("C:\\Users\\Admin\\eclipse-workspace\\MavenStarts\\ExcelFile\\Hameed.xlsx");
		FileInputStream fi = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fi);
		Sheet sheet = w.getSheet("Hameed1");
		int row = sheet.getPhysicalNumberOfRows();
		Row row2 = sheet.getRow(0);
		short lastCellNum = row2.getLastCellNum();
		
	    Object data[][]= new Object[row-1][lastCellNum];
	    for (int i = 0; i < row-1; i++) {
	    	Row row3 = sheet.getRow(i+1);
	    	for (int j = 0; j < lastCellNum; j++) {
	    		Cell cell = row3.getCell(j);
	    		data[i][j]=cell.toString();
				
			}
	    	
			
		}
			return data;
	


	}
}
