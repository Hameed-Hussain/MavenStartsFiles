package org.maven;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReRun {

	@Test
	private void tc01() {
		System.out.println("test 1");
	}
	
	@Test(retryAnalyzer=ReRun11.class)
	private void tc02() {
		System.out.println("test 2");
		Assert.assertTrue(false);
		System.out.println("test 5");
	}
	
	@Test
	private void tc03() {
		System.out.println("test 3");
	}
}
