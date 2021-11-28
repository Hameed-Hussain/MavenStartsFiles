package org.maven;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestNgBaseClass extends BaseClass {

	@Test(priority= 10)
	private void tc01() {

		windowSwitchto();
		
	}
	@Test(priority= -10)
	private void tc02() {
		setDriver();
		navigateTo("https://www.amazon.in/");
	}
	
	@Test(priority= 0)
	private void tc03() {

		WebElement text = locators("xpath", "//*[@id=\"twotabsearchtextbox\"]");
		sendKkeys(text, "samsung tab");
		WebElement tab = inspect("(//span[@class='a-size-medium a-color-base a-text-normal'])[3]");
		buttonCl(tab);
	}
	
}
