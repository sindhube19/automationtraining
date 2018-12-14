package com.automationtraining.basetest;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
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
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.automationtraining.ExtentReportListener.ReportGenerator;
import com.automationtraining.browserfactory.BrowserFactory;
import com.automationtraining.constant.ConstantFile;
import com.automationtraining.pageobject.Form101Page;

import com.automationtraining.utilities.ExcelUtilities;
import com.automationtraining.utilities.TestUtils;
import com.automationtraining.pageobject.Loginpages;
/**
 * @author Sindhuja Ethiraj
 *
 */
public class BaseTest extends ExcelUtilities  {
	protected Loginpages Loginpages;
	protected String url;
	protected Form101Page page101; 
	public  WebDriver driver;
	protected ReportGenerator reporter;
	//protected loginPages loginPages;
	 private Properties properties;
	 private final String propertyFilePath= ConstantFile.propertyFilePath;
	
	@BeforeTest
	@Parameters("env")
	public void browserSetup(String env) throws Exception {
		
	    ExcelUtilities.openstream();
		url=TestUtils.getStringFromPropertyFile(env);
	
		 driver=BrowserFactory.getNewdriver();
		 driver.navigate().to(url);
		driver.manage().window().maximize();
		Loginpages= new Loginpages(driver);


			
	}
	
  @AfterTest
      public void browserClose() throws Exception  {
	 BrowserFactory.closeDriver();
	ExcelUtilities.closeStream();
	 reporter.flush();
   }



	

}
