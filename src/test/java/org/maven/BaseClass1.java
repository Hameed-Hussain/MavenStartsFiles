package org.maven;

import java.awt.AWTException;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.WebElement;

public class BaseClass1 extends BaseClass {

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		
		setDriver();
		launch("https://www.facebook.com/");
		WebElement user = locators("name", "email");
		sendK(user, "hhhh@gmil.com");
		title();
		currentUrl();
		navigateTo("https://www.amazon.in/");
		WebElement text = locators("xpath", "//*[@id=\"twotabsearchtextbox\"]");
		sendKkeys(text, "samsung tab");
		WebElement tab = inspect("(//span[@class='a-size-medium a-color-base a-text-normal'])[3]");
		buttonCl(tab);
		windowSwitchto();
		windowDefault();
		
		
}}