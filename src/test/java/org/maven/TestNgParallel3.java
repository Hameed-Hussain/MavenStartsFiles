package org.maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNgParallel3 {

	@Test
	private void tc01() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.snapdeal.com/");
	    System.out.println("5"+Thread.currentThread().getId());
	}
	@Test
	private void tc02() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	    driver.get("https://adactinhotelapp.com/");
	    System.out.println("6"+Thread.currentThread().getId());
	}
	
}
