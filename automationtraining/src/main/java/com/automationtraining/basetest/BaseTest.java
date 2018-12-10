package com.automationtraining.basetest;

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
  
  @AfterSuite

  public void tearDown(){
	  WebElement Toemail =  Form101Page.submittermail;

      sendPDFReportByGMail("sindhube19.data@gmail.com", "password", Toemail, "PDF Report", "");

      }



  /**
 * @param from
 * @param pass
 * @param toemail
 * @param subject
 * @param body
 */
private void sendPDFReportByGMail(String from, String pass, WebElement toemail, String subject, String body) {
	// TODO Auto-generated method stub
	
}


	

}
