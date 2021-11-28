package org.maven;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class ReRun11 implements IRetryAnalyzer {

	public boolean retry(ITestResult arg0) {
		int min = 1;
		int max = 5;
		if (min<max) {
			min++;
			return true;
		}
		
		return false;
	}

}
