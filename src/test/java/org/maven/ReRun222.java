package org.maven;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

public class ReRun222 implements IAnnotationTransformer {

	public void transform(ITestAnnotation aa, Class arg1, Constructor arg2, Method arg3) {

		IRetryAnalyzer retryAnalyzer = aa.getRetryAnalyzer();
		
		if (retryAnalyzer==null) {
			aa.setRetryAnalyzer(ReRun11.class);
		}
	}

}
