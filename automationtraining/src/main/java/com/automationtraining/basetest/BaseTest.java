package com.automationtraining.basetest;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.automationtraining.ExtentReportListener.ReportGenerator;
import com.automationtraining.abstractclasses.Driverclass;
import com.automationtraining.browserfactory.BrowserFactory;
import com.automationtraining.constant.ConstantFile;
import com.automationtraining.pageobject.Form101Page;

import com.automationtraining.utilities.ExcelUtilities;
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
	protected Form101Page page101; 
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
	@Parameters({"env","userType","sflogin"})
	public void browserSetup(String env,@Optional("sflogin")String userType, String sflogin) throws Exception {

		ExcelUtilities.openstream();
		url=TestUtils.getStringFromPropertyFile(env);
        
		driver=BrowserFactory.getNewdriver();
		driver.navigate().to(url);
		driver.manage().window().maximize();
		Loginpages= new Loginpages(driver);
		
	}
	/*@BeforeMethod(dependsOnMethods="browserSetup")
	@Parameters({"sflogin","userType"})
	public void browserSignin(String sflogin,@Optional("userType")String userType) throws Exception  {
sfurl=TestUtils.getStringFromPropertyFile(sflogin);
        
		driver=BrowserFactory.getNewdriver();
		driver.navigate().to(sfurl);
		driver.manage().window().maximize();
		usertype=TestUtils.getStringFromPropertyFile(userType);
		Loginpages= new Loginpages(driver);
		
	
	}*/
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
		//BrowserFactory.closeDriver();

	}






}
