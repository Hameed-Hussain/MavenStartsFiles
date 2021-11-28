package org.maven;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class testNgDataProvider extends BaseClass {

	@Test(dataProvider="facebook" )
	public void testing(String s, String s1) throws InterruptedException {
      setDriver();
      launch("https://www.facebook.com/");
      WebElement srch = inspect1("email");
      sendK(srch, s);
      WebElement pppp = inspect1("pass");
      sendKkeys(pppp, s1);
      quit();
     
	}
	
	@DataProvider(name ="facebook")
	public Object[][] initiate() throws IOException {
		Object[][] initiate = Pra123.initiate();
		return initiate;
	}

	
		
			
	
	
		
				
		

	}

	

	
	
	
