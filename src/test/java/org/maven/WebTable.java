package org.maven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {
public static void main(String[] args) {
	 WebDriverManager.chromedriver().setup();
     WebDriver driver = new ChromeDriver();
     driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
 	
 	driver.manage().window().maximize();
 	
 
 	List<WebElement> row = driver.findElements(By.tagName("tr"));
	int size = row.size();
	System.out.println(size);
	
	for (int i = 5; i < row.size(); i++) {
		WebElement y = row.get(i);
		String text = y.getText();
     
     
     
	}
     
}}

