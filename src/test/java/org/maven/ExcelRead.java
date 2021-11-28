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

public class ExcelRead {
public static void main(String[] args) throws IOException {
	
	File f = new File("C:\\Users\\Admin\\eclipse-workspace\\MavenStarts\\ExcelFile\\Data Driven.xlsx");
	FileInputStream fis = new FileInputStream(f);
	
	Workbook wb = new XSSFWorkbook(fis);
	Sheet sh = wb.getSheet("PAGE_1");
	
	for (int i = 0; i < sh.getPhysicalNumberOfRows(); i++) {
		Row row = sh.getRow(i);
	for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
			Cell cell = row.getCell(j);
			int cellType = cell.getCellType();
			
			if (cellType==1) {
				String value = cell.getStringCellValue();
				System.out.println(value);
			}
			else {
				double cellValue = cell.getNumericCellValue();
				long l = (long)cellValue;
				System.out.println(l);
			}
		}
	}
	
	
}
}
