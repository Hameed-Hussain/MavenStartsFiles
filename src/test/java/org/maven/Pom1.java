package org.maven;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Pom1 extends BaseClass {
 
	public Pom1() {
		PageFactory.initElements(driver, this);
	}
	@FindAll({@FindBy(id="email") , @FindBy(xpath="//input[@type='jjjj']")})
	private WebElement username;
	public WebElement getUsername() {
		return username;
	}
	
	
	
	
	
}
