package com.automationtraining.smokesuite;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
//import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.automationtraining.ExtentReportListener.ReportGenerator;
import com.automationtraining.basetest.BaseTest;
import com.automationtraining.pageobject.Form101Page;
import com.automationtraining.utilities.ExcelUtilities;




/**
 * @author Sindhuja Ethiraj
 *
 */
public class Form101 extends BaseTest{
	@Test
	public void formFilling101() throws Exception
	{
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();

		String className = this.getClass().getSimpleName();

		String tcName = "TCAT_101";

		String Author="Sindhuja"; 
		reporter= new ReportGenerator(className,Author);
page101=Loginpages.formUrl101();
		page101.formFilling(methodName,tcName,reporter);
		//    ExtentReportsClass.loginTest();




	}
}

