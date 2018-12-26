/**
 * 
 */
package com.automationtraining.RegressionSuite;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.automationtraining.ExtentReportListener.ReportGenerator;
import com.automationtraining.basetest.BaseTest;
import com.automationtraining.browserfactory.BrowserFactory;
import com.automationtraining.utilities.Log;
import com.automationtraining.utilities.SeleniumUtils;
import com.automationtraining.utilities.TestUtils;

/**
 * @author Sindhuja Ethiraj
 *
 * 20-Dec-2018
 */
public class Form101Verification extends BaseTest{

	@Test
	@Parameters({"sflogin","userType"}) 


	public void formFilling101(String sflogin,String userType) throws Exception{
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		String className = this.getClass().getSimpleName();
		String tcName = "TCAT_101";
		String Author="Sindhuja"; 
		reporter= new ReportGenerator(className,Author);
		page101=Loginpages.formUrl101();
		page101.formFilling(methodName,tcName,reporter);
		String Url2 = TestUtils.getStringFromPropertyFile(sflogin);
		String user =TestUtils.getStringFromPropertyFile(userType+".username");
		String pwd = TestUtils.getStringFromPropertyFile(userType+".password"); 
		SeleniumUtils.switchToNewTab(driver, Url2); 
		page101.formverification(methodName,tcName,reporter);
		
	}
}


