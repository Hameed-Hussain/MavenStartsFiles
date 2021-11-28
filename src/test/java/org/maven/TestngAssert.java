package org.maven;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.File;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
public class TestngAssert {

	 @Test
     private void tc01() {
           String s = "selenium";
           SoftAssert sa = new SoftAssert();
            sa.assertEquals(s, "java");
            sa.assertAll();
           System.out.println(s);
	}
     @Test
     private void tc02() {
		System.out.println("Frameworks");
	}
	
}