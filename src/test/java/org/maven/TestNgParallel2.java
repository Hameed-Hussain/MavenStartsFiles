package org.maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNgParallel2 {

	@Test
	private void tc01() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.amazon.in/");
	    System.out.println("3"+Thread.currentThread().getId());
	}
	@Test
	private void tc02() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.flipkart.com/");
	    System.out.println("4"+Thread.currentThread().getId());
	}
	
}
