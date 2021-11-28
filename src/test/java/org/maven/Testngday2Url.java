package org.maven;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testngday2Url extends BaseClass {
     @BeforeClass
	private void driverSet() {
		setDriver();
	}
	@BeforeMethod
	private void urlLaunch() {
     launch("https://adactinhotelapp.com/");
	}
	@Test
	private void locatorfind() {
    WebElement inspect1 = inspect1("username");
    sendK(inspect1, "hhussain");
    WebElement inspect12 = inspect1("password");
    sendK(inspect12, "hhussain");
	}
	@AfterClass
	private void click() {
     WebElement element = inspect1("login");
     buttonCl(element);
	}
}
