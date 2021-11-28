package org.maven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Exceldate {
  
	@Test
	private void dateRead() throws IOException {
		// TODO Auto-generated method stub

	File f = new File("C:\\Users\\Admin\\eclipse-workspace\\MavenStarts\\ExcelFile\\Data Driven.xlsx");
	FileInputStream fls = new FileInputStream(f);
	Workbook w = new XSSFWorkbook(fls);
	Sheet sheet = w.getSheet("PAGE_1");
	for (int i = 0; i < sheet.getPhysicalNumberOfRows() ; i++) {
		Row row = sheet.getRow(i);
		
		for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
		Cell cell = row.getCell(j);
		int cellType = cell.getCellType();
		
		if (cellType==1) {
			String stringCellValue = cell.getStringCellValue();
			System.out.println(stringCellValue);
		}
		else if (DateUtil.isCellDateFormatted(cell)) {
			Date dateCellValue = cell.getDateCellValue();
			
			SimpleDateFormat a = new SimpleDateFormat("dd/MM/YYYY");
			String format = a.format(dateCellValue);
			System.out.println(format);
		}
		else {
			double value = cell.getNumericCellValue();
			long l = (long) value;
			System.out.println(l);
		}
		
		}
	}
	
}
}