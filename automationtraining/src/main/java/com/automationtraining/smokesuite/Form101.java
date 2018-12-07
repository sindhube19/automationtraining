package com.automationtraining.smokesuite;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
//import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.automationtraining.ExtentReportListener.ExtentReportsClass;
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
		//System.out.println("methodname"+methodName);
		String className = this.getClass().getSimpleName();
	//	System.out.println("classname"+className);
		String tcName = "TCAT_101";
		//System.out.println("tcname"+tcName);
		String Author="Sindhuja"; 
	    Form101Page.formFilling(methodName,tcName);
	    ExtentReportsClass.loginTest();
	   
		
		
  
	}
}

