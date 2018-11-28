package com.automationtraining.smokesuite;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
//import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.automationtraining.basetest.Basetest;
import com.automationtraining.pageobject.Form101Page;



/**
 * @author Sindhuja Ethiraj
 *
 */
public class Form101 extends Basetest {
	@Test
	public static void actions() throws InterruptedException, InvalidFormatException, IOException
	{
		Form101Page.login(driver);
	
		
  
	}
}

