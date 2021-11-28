package org.maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNgParallel4 {

	@Test
	private void tc01() {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
	    driver.get("https://www.irctc.co.in/");
	    System.out.println("7"+Thread.currentThread().getId());
	}
	@Test
	private void tc02() {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
	    driver.get("https://netbanking.hdfcbank.com/netbanking/");
	    System.out.println("8"+Thread.currentThread().getId());
	}
	
}
