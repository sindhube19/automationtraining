package com.automationtraining.basetest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.automationtraining.browserfactory.BrowserFactory;
import com.automationtraining.pageobject.Form101Page;

import com.automationtraining.utilities.ExcelUtilities;
/**
 * @author Sindhuja Ethiraj
 *
 */
public class BaseTest  {
	
	protected Form101Page page101; 
	public static WebDriver driver;
	//protected loginPages loginPages;
 
	
	@BeforeTest
	public void browserSetup() throws Exception {
		
	//	ExcelUtilities.openstream();
		 driver=BrowserFactory.getNewdriver();
		driver.manage().window().maximize();
		
		driver.get("https://qadevpro2-azicawc-webforms.cs32.force.com/forms/Webform101_VF");
		//ExcelUtilities.setExcelFileSheet("automation");
		/*loginPages= new loginPages(driver);
		System.out.println("loginPagestest"+loginPages);
*/
			
	}
	
  @AfterTest
      public void browserClose() throws Exception  {
	 BrowserFactory.closeDriver();
   }

	

}
