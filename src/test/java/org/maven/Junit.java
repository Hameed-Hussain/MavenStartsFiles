package org.maven;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class Junit extends BaseClass {
	
	@BeforeClass
	public static void tc01() {
		setDriver();
		launch("https://www.facebook.com/");
	}
     @Before
	public void tc11() {
    Date d = new Date();
    System.out.println(d);
}
     @Test
	public void tc21() {
WebElement inspect2 = inspect("//*[@id=\"email\"]");
sendK(inspect2, "hhhhhhhhh");
attributeGet(inspect2);
WebElement inspect3 = inspect("//*[@id=\"pass\"]");
sendK(inspect3, "gggggggggg");
attributeGet(inspect3);
WebElement inspect1 = inspect("//*[@name=\"login\"]");
buttonCl(inspect1);
     }
     @After
	public void tc31() {
    	 Date f = new Date();
    	 System.out.println(f);
	}
     @AfterClass
	public static void tc41() {
		 
	}
    
	
	
	
}
