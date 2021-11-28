package org.maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNgParallel1 {

	@Test
	private void tc01() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    System.out.println("1"+Thread.currentThread().getId());
	}
	@Test
	private void tc02() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.instagram.com/");
	    System.out.println("2"+Thread.currentThread().getId());
	}
	
}
