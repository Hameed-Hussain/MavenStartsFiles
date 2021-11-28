package org.maven;
import org.testng.annotations.Test;
public class Testngday2Priorty {
	
	@Test(priority = -25 , invocationCount = 1)
	private void tc01() {
		System.out.println("T : 0");
	}
	@Test(priority = 15 , invocationCount = 1)
	private void tc02() {
		System.out.println("T : 1");
	}
	@Test(priority = -5 , invocationCount = 2 , enabled = false)
	private void tc03() {
		System.out.println("T : 2");
	}
	@Test(priority = 25 , invocationCount = 12)
	private void tc04() {
		System.out.println("T : 3");
	}
	@Test(priority = 5 , invocationCount = 22 , enabled = false)
	private void tc05() {
		System.out.println("T : 4");
	}
	@Test(priority = -15 , invocationCount = 100 , enabled = false)
	private void tc06() {
		System.out.println("T : 5");
	}
}
