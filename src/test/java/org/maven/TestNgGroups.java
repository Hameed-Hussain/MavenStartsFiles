package org.maven;

import org.testng.annotations.Test;

public class TestNgGroups {

	
	@Test (groups = "@Smoke")
	private void tn01() {
		System.out.println("Test Day 1");
	}
	@Test (groups = "@Smoke")
 private void tn02() {
		System.out.println("Test Day 2");
	}
	@Test (groups = "@Reg", dependsOnGroups = "@Smoke")
private void tn03() {
		System.out.println("Test Day 3");
}
	@Test (groups = "@Smoke")
private void tn04() {
		System.out.println("Test Day 4");
}
	@Test (groups = "@Sanity")
private void tn05() {
		System.out.println("Test Day 5");
	}
	@Test (groups = "@Smoke")
	
private void tn06() {
		System.out.println("Test Day 6");
}
	@Test (groups = "@Sanity")
private void tn07() {
		System.out.println("Test Day 7");
}
	@Test (groups = "@Smoke")
private void tn08() {
		System.out.println("Test Day 8");
}
	@Test (groups = "@Reg")
private void tn09() {
		System.out.println("Test Day 9");
}
	@Test (groups = "@Smoke")
private void tn10() {
		System.out.println("Test Day 10");
}
}
