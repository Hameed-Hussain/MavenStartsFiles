package org.maven;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNgAssert1 {

	 @Test
     private void tc01() {
           String s = "selenium";
           
           s.contains("yy");
            
           assertFalse(true);
           System.out.println(s);
	}
     @Test
     private void tc02() {
		System.out.println("Frameworks");
	}
}
