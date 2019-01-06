/**
 * 
 */
package com.automationtraining.pageobject;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.automationtraining.ExtentReportListener.ReportGenerator;
import com.automationtraining.abstractclasses.Driverclass;
import com.automationtraining.utilities.ExcelUtilities;
import com.automationtraining.utilities.Log;

/**
 * @author Sindhuja Ethiraj
 *
 * 03-Jan-2019
 */
public class Form101verification extends Driverclass {



	/**
	 * @param driver
	 */
	public Form101verification(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


	@FindBy(how=How.XPATH, using=".//a[text()='Part of Body Injured List']")
	public WebElement partofbodyinjured; 


	@FindBy(how=How.XPATH, using=".//a[text()='Nature of Injury List']")
	public WebElement natureofinjury; 

	@FindBy(how=How.XPATH, using=".//a[text()='Cause of Injury List']")
	public WebElement causeofinjury;


	String parentWindow = driver.getWindowHandle();
	public void formverification() throws Exception {

		partofbodyinjured.click();
		Log.info("Selecting the part of body injured");
		assertTrue(driver.getTitle().contains("INDUSTRIAL INJURY"));
		Log.info("Title Verified");
		driver.switchTo().defaultContent();

		natureofinjury.click();
		assertTrue(driver.getTitle().contains("INDUSTRIAL INJURY"));
		Log.info("Nature of injury title verified");
		driver.switchTo().defaultContent();
		causeofinjury.click();
		assertTrue(driver.getTitle().contains("INDUSTRIAL INJURY"));
		Log.info("Cause of injury title verified");

	}


}



