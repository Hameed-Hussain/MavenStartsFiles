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
import org.testng.annotations.DataProvider;

public class TestngDataProvider2 {

	
	
	@DataProvider(name = "data")
	public static Object[][] xcel() throws IOException {
		File f = new File("C:\\Users\\Admin\\eclipse-workspace\\MavenStarts\\ExcelFile\\DataP.xlsx");
		FileInputStream fl = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fl);
		Sheet sheet = w.getSheet("Sheet1");
		Object[][] o = new Object[sheet.getPhysicalNumberOfRows()][sheet.getRow(0).getPhysicalNumberOfCells()];
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				
				o[i][j] = cell.toString();
		
			}	
			}
		return o;
		
	}
}
