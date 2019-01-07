package com.automationtraining.basetest;

import java.util.Properties;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.automationtraining.ExtentReportListener.ReportGenerator;
import com.automationtraining.abstractclasses.Driverclass;
import com.automationtraining.browserfactory.BrowserFactory;
import com.automationtraining.constant.ConstantFile;
import com.automationtraining.emailreport.ReportbyEmail;
import com.automationtraining.pageobject.Form101Page;
import com.automationtraining.pageobject.Form101verification;
import com.automationtraining.utilities.ExcelUtilities;
import com.automationtraining.utilities.Log;
import com.automationtraining.utilities.TestUtils;
import com.automationtraining.pageobject.Loginpages;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/**
 * @author Sindhuja Ethiraj
 *
 */
public class BaseTest extends ExcelUtilities  {
	protected Loginpages Loginpages;
	protected String url;
	protected String sfurl;
	protected String usertype;
	protected String browser;
	protected Form101Page page101; 
	protected Form101verification page102;
	protected ReportbyEmail email;
	public  WebDriver driver;
	protected ReportGenerator reporter;
	//protected loginPages loginPages;
	private Properties properties;
	private final String propertyFilePath= ConstantFile.propertyFilePath;

	@BeforeSuite
	public void beforeSuite() throws Exception {
		ExcelUtilities.openstream();
	}
	@BeforeMethod
	@Parameters({"browser","env","userType"})
	public void browserSetup(String browser,String env,@Optional("userType")String userType) throws Exception {

		Log.startLog("Test is Starting");

		url=TestUtils.getStringFromPropertyFile(env);
		driver=BrowserFactory.getNewdriver(browser);

		driver.navigate().to(url);
		Log.info("Browser Initialized");
		driver.manage().window().maximize();
		Loginpages= new Loginpages(driver);
		Log.info("Opening the browser");

	}

	@AfterMethod(alwaysRun = true)   
	public void tearDown(ITestResult result) throws Exception 
	{ 
		String methodName = result.getMethod().getMethodName();              
		if (result.getStatus() == ITestResult.FAILURE) {   
			String res = result.getThrowable().getMessage();   
			Exception e = new Exception();        
			StackTraceElement[] trace = new StackTraceElement[] {    
					new StackTraceElement(Driverclass.classname,methodName,res,Driverclass.lineno) 
			};          
			e.setStackTrace(trace);       
			reporter.logScreenshot(driver, methodName, res, e);  
		}         
		else if(result.getStatus() == ITestResult.SKIP) {       
			String res = result.getThrowable().getMessage();     
			try {           
				reporter.logSkipTest(driver, methodName, res);        
			} catch (Exception e) {              

			}         } 


	} 


	@AfterSuite
	public void browserClose() throws Exception  {
		reporter.flush();
		ExcelUtilities.closeStream();
		Log.endLog("Test is ending");

	}


}
