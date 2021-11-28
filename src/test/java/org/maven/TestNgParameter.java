package org.maven;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgParameter extends BaseClass {

	
	@BeforeClass
	private void tc01() {
		setDriver();
		launch("https://www.facebook.com/");
	}
	
	@Parameters({ "username" })
	@Test
	private void tc02(@Optional("ghghghhg@hhhh") String s) {
		
		WebElement user = inspect1("email");
		sendK(user, s);
		
		
	}
	
	@Parameters({ "passWord" })
	@Test
	private void tc03( String s1) {
		WebElement pss = inspect1("pass");
		sendK(pss, s1);
		 
	}
	@AfterClass
	private void tc04() {
 
		WebElement btn = inspect2("login");
		buttonCl(btn);
	}
}
