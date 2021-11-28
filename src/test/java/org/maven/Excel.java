package org.maven;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Excel {
	public static void main(String[] args) throws IOException {
	
     WebDriverManager.chromedriver().setup();
     WebDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://www.amazon.in/");
     
     WebElement srch = driver.findElement(By.id("twotabsearchtextbox"));
     srch.sendKeys("samsung tab",Keys.ENTER);
     List<WebElement> list = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
      File f = new File("G:\\excel\\java.xlsx");
      FileOutputStream fl = new FileOutputStream(f);
      Workbook w = new XSSFWorkbook();
      Sheet createSheet = w.createSheet();
 
     for (int i = 0; i < list.size(); i++) {
		WebElement webElement = list.get(i);
		String text = webElement.getText();
		System.out.println(text);
		
		 Row createRow = createSheet.createRow(i);
	     Cell createCell = createRow.createCell(0);
	     createCell.setCellValue(text);
	}
     w.write(fl);
    
     
     
     
     
     
     
     
     
}
}
