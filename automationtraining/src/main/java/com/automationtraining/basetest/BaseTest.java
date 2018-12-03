package com.automationtraining.basetest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.automationtraining.browserfactory.BrowserFactory;
import com.automationtraining.utilities.ExcelUtilities;
/**
 * @author Sindhuja Ethiraj
 *
 */
public class BaseTest extends BrowserFactory {
	@BeforeTest
	public void browserSetup() throws Exception {
		driver=BrowserFactory.getNewdriver();
		driver.manage().window().maximize();
		
		driver.get("https://qadevpro2-azicawc-webforms.cs32.force.com/forms/Webform101_VF");
		//ExcelUtilities.setExcelFileSheet("automation");
	}
	
  /* @AfterTest
      public void browserClose() {
	   driver=BrowserFactory.closeDriver();
   }*/

	

}
