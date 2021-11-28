package org.maven;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestngStarts {

	
	@AfterClass
	private void tc01() {
		System.out.println("AC : 1");
	}
	@AfterMethod
	private void tc02() {
		System.out.println("AM : 2");
	}
	
	@BeforeClass
	private void tc03() {
		System.out.println("BC : 1");
	}
	@Test
	private void tc04() {
		System.out.println("T : 0");
	}
	@BeforeMethod
	private void tc05() {
		System.out.println("BM : 2");
	}
	@Test
	private void tc06() {
		System.out.println("TT : 00");
	}
	
	
	
	
	
	
	
	
	
}
