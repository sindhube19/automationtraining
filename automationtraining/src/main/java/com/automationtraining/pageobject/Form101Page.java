package com.automationtraining.pageobject;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.automationtraining.basetest.BaseTest;
import com.automationtraining.browserfactory.BrowserFactory;
import com.automationtraining.utilities.ExcelUtilities;
import com.automationtraining.utilities.SeleniumUtils;


/**
 * @author Sindhuja Ethiraj
 *
 */
public class Form101Page extends BaseTest {

	/******************************Employee*******************************************/

	@FindBy(how=How.XPATH, using=".//label[contains(text(),'LAST NAME')]/following::input[1]")
	static
	WebElement lastname; 
	@FindBy(how=How.XPATH, using=".//label[contains(text(),'FIRST')]/following::input[1]")
	static
	WebElement firstname;
	@FindBy(how=How.XPATH, using=".//label[contains(text(),'SOCIAL SECURITY NUMBER')]/following::input[1]")
	static

	WebElement socialsecuritynumber;
	@FindBy(how=How.XPATH, using=".//label[contains(text(),'BIRTH DATE')]/following::input[1]")
	static
	WebElement dob;
	@FindBy(how=How.XPATH, using=".//label[contains(text(),'HOME ADDRESS(NUMBER AND STREET')]/following::input[1]")
	static
	WebElement homeaddress;
	@FindBy(how=How.XPATH, using=".//label[contains(text(),'CITY')]/following::input[1]")
	static
	WebElement city;
	@FindBy(how=How.XPATH, using=".//label[contains(text(),'STATE')]/following::input[1]")
	static
	WebElement state;
	@FindBy(how=How.XPATH, using=".//label[contains(text(),'ZIP CODE')]/following::input[1]")
	static
	WebElement zipcode;
	@FindBy(how=How.XPATH, using=".//label[contains(text(),'TELEPHONE')]/following::input[1]")
	static
	WebElement telephone;
	@FindBy(how=How.XPATH, using=".//label[contains(text(),'SEX')]/following::select[1]")
	static
	WebElement gender;
	@FindBy(how=How.XPATH, using=".//label[contains(text(),'SEX')]/following::select[1]")
	WebElement keytab;
	@FindBy(how=How.XPATH, using=".//label[contains(text(),'MARITAL STATUS')]/following::select[1]")
	static
	WebElement maritalstatus;
	@FindBy(how=How.XPATH, using=".//label[contains(text(),'MARITAL STATUS')]/following::select[1]")
	WebElement maritalkeytab;

	/*******************Employer Details***************************************************/

	@FindBy(how=How.XPATH, using=".//div[@class='bodyDiv brdPalette brandPrimaryBrd']/table/tbody/tr/td/form/div[2]/div[@class='editPage']/div/div/div[2]/div[@class='pbSubsection']/table/tbody/tr/th/label[contains(text(),'EMPLOYER')]/following::input[1]")
	static
	WebElement employername;
	@FindBy(how=How.XPATH, using=".//label[contains(text(),'FEIN NUMBER' )]/following::input[1]")
	static
	WebElement feinnumber;
	@FindBy(how=How.XPATH, using=".//label[contains(text(),'OFFICE ADDRESS(NUMBER & STREET' )]/following::input[1]")
	static
	WebElement officeaddress;
	@FindBy(how=How.XPATH, using=".//div[@class='bodyDiv brdPalette brandPrimaryBrd']/table/tbody/tr/td/form/div[2]/div[@class='editPage']/div/div/div[2]/div[@class='pbSubsection']/table/tbody/tr/th/label[contains(text(),'CITY')]/following::input[1]")
	static
	WebElement employercity;
	@FindBy(how=How.XPATH, using=".//div[@class='bodyDiv brdPalette brandPrimaryBrd']/table/tbody/tr/td/form/div[2]/div[@class='editPage']/div/div/div[2]/div[@class='pbSubsection']/table/tbody/tr/th/label[contains(text(),'STATE')]/following::input[1]")
	static
	WebElement employerstate;
	@FindBy(how=How.XPATH, using=".//div[@class='bodyDiv brdPalette brandPrimaryBrd']/table/tbody/tr/td/form/div[2]/div[@class='editPage']/div/div/div[2]/div[@class='pbSubsection']/table/tbody/tr/th/label[contains(text(),'ZIP CODE')]/following::input[1]")
	static
	WebElement employerzipcode;
	@FindBy(how=How.XPATH, using=".//div[@class='bodyDiv brdPalette brandPrimaryBrd']/table/tbody/tr/td/form/div[2]/div[@class='editPage']/div/div/div[2]/div[@class='pbSubsection']/table/tbody/tr/th/label[contains(text(),'TELEPHONE')]/following::input[1]")
	static
	WebElement employertelephone;

	/********************Accident Details*************************************************/

	@FindBy(how=How.XPATH, using=".//div[@class='bodyDiv brdPalette brandPrimaryBrd']/table/tbody/tr/td/form/div[2]/div[@class='editPage']/div/div/div[3]/.//label[contains(text(),'DATE OF INJURY OR ILLNESS')]/following::input[1]")
	static
	WebElement DATEOFINJURY;
	@FindBy(how=How.XPATH, using=".//div[@class='bodyDiv brdPalette brandPrimaryBrd']/table/tbody/tr/td/form/div[2]/div[@class='editPage']/div/div/div[3]/.//label[contains(text(),'DATE EMPLOYER NOTIFIED OF INJURY')]/following::input[1]")
	static
	WebElement Notified;
	@FindBy(how=How.XPATH, using=".//div[@class='bodyDiv brdPalette brandPrimaryBrd']/table/tbody/tr/td/form/div[2]/div[@class='editPage']/div/div/div[3]/.//label[contains(text(),'LAST DAY OF WORK AFTER INJURY')]/following::input[1]")
	static
	WebElement afterinjury;
	@FindBy(how=How.XPATH, using=".//div[@class='bodyDiv brdPalette brandPrimaryBrd']/table/tbody/tr/td/form/div[2]/div[@class='editPage']/div/div/div[3]/.//label[contains(text(),'HAS EMPLOYEE RETURNED TO WORK?')]/following::input[1]")
	WebElement hasemployeereturnedhome;
	@FindBy(how=How.XPATH, using=".//div[@class='bodyDiv brdPalette brandPrimaryBrd']/table/tbody/tr/td/form/div[2]/div[@class='editPage']/div/div/div[3]/.//label[contains(text(),'OCCUPATION')]/following::input[1]")
	static
	WebElement employeeoccupation;
	@FindBy(how=How.XPATH, using=".//div[@class='bodyDiv brdPalette brandPrimaryBrd']/table/tbody/tr/td/form/div[2]/div[@class='editPage']/div/div/div[3]/.//label[contains(text(),'EMPLOYER PREMISES')]/following::select[1]")
	static
	WebElement employeepremises;
	@FindBy(how=How.XPATH, using=".//div[@class='bodyDiv brdPalette brandPrimaryBrd']/table/tbody/tr/td/form/div[2]/div[@class='editPage']/div/div/div[3]/div['pbSubsection']/table/tbody/tr[15]/th/span/label[' WHAT WAS THE INJURY OR ILLNESS']/following::textarea[1]")
	static
	WebElement wastheinjuryorillness;
	@FindBy(how=How.XPATH, using=".//label[contains(text(),'PART OF BODY INJURED')]/following::input[1]")
	static
	WebElement bodyinjured;
	@FindBy(how=How.XPATH, using=".//label[contains(text(),'PART OF BODY INJURED')]/following::input[1]")
	WebElement bodyinjuredkeytab;
	@FindBy(how=How.XPATH, using=".//a[text()='Part of Body Injured List']/preceding::span[1]/a/img")
	WebElement lookuppartofbodyinjured;
	@FindBy(how=How.XPATH, using=".//label[contains(text(),'FATAL')]/following::select[1]")
	static
	WebElement fatal;
	@FindBy(how=How.XPATH, using=".//label[contains(text(),'WAS EMPLOYEE TREATED IN AN EMERGENCY                                              ROOM?')]/following::select[1]")
	static
	WebElement employeeemergency;
	@FindBy(how=How.XPATH, using=".//label[contains(text(),'WAS EMPLOYEE HOSPITALIZED OVERNIGHT AS                                              AN IN-PATIENT?')]/following::select[1]")
	static
	WebElement treatedovernight;
	@FindBy(how=How.XPATH, using=".//label[contains(text(),'IS VALIDITY OF CLAIM DOUBTED')]/following::select[1]")
	static
	WebElement claimdoubted;



	/**********************Cause of accident*********************************/

	@FindBy(how=How.XPATH, using=".//div[@class='bodyDiv brdPalette brandPrimaryBrd']/table/tbody/tr/td/form/div[2]/div[@class='editPage']/div/div/div[4]/div[2]/table/tbody/tr/th/span/label[contains(text(),'WHAT HAPPENED')]/following::textarea[1]")
	static
	WebElement whathappend;
	@FindBy(how=How.XPATH, using=".//div[@class='bodyDiv brdPalette brandPrimaryBrd']/table/tbody/tr/td/form/div[2]/div[@class='editPage']/div/div/div[4]/div[2]/table/tbody/tr/th/span/label[contains(text(),'WHAT OBJECT OR SUBSTANCE DIRECTLY HARMED THE EMPLOYEE')]/following::textarea[1]")
	static
	WebElement harmedemployee;
	@FindBy(how=How.XPATH, using=".//div[@class='bodyDiv brdPalette brandPrimaryBrd']/table/tbody/tr/td/form/div[2]/div[@class='editPage']/div/div/div[4]/div[2]/table/tbody/tr/th/span/label[contains(text(),'WHAT OBJECT OR SUBSTANCE DIRECTLY HARMED THE EMPLOYEE')]/following::textarea[1]")
	WebElement harmedemployeekeytab;
	@FindBy(how=How.XPATH, using=".//a[text()='Nature of Injury List']/preceding::span[1]/a/img")
	WebElement natureofinjury;
	@FindBy(how=How.XPATH, using=".//a[text()='Cause of Injury List']/preceding::span[1]/a/img")
	WebElement causeofinjury;

	@FindBy(how=How.XPATH, using=".//label[contains(text(),' INCIDENT OCCURRED')]/following::textarea[1]")
	WebElement employeebeforeincidentoccured;
	@FindBy(how=How.XPATH, using=".//div[@class='bodyDiv brdPalette brandPrimaryBrd']/table/tbody/tr/td/form/div[2]/div[@class='editPage']/div/div/div[4]/div[2]/table/tbody/tr[6]/th[1]/label[' WAS WORKER IN YOUR EMPLOY WHEN INJURED?']/following::select[1]")
	WebElement workerinemployee;
	@FindBy(how=How.XPATH, using=".//div[@class='bodyDiv brdPalette brandPrimaryBrd']/table/tbody/tr/td/form/div[2]/div[@class='editPage']/div/div/div[4]/div[2]/table/tbody/tr[6]/th[2]/label['DATE OF LAST HIRE']/following::input[1]")


	WebElement datehire;
	@FindBy(how=How.XPATH, using=".//label[contains(text(),'ACTUAL GROSS EARNINGS OF EMPLOYEE FOR THE 30 CALENDAR DAYS PRECEEDING INJURY')]/following::input[1]")
	WebElement grossearings;
	@FindBy(how=How.NAME, using="j_id0:j_id5:j_id9:j_id247")
	WebElement agree;

	@FindBy(how=How.XPATH, using=".//label[contains(text(),'SUBMITTER EMAIL ADDRESS')]/following::input[1]")
	WebElement submittermail;

	@FindBy(how=How.XPATH, using="//*[@id=\"j_id0:j_id5:j_id9:j_id11:bottom\"]/input")
	WebElement submit;

	@FindBy(how=How.XPATH, using=".//p[text()=' Thank you for your submission!']")
	static
	WebElement verifySuccess;

	public static  void formFilling(String methodName,String tcName) throws Exception {
		
/******************************EMPLOYEE DETAILS *******************************************************/		
		lastname.sendKeys(ExcelUtilities.excelData(methodName, tcName, "lastname"));     
		firstname.sendKeys(ExcelUtilities.excelData(methodName, tcName, "firstname")); 
		socialsecuritynumber.sendKeys(ExcelUtilities.excelData(methodName, tcName, "socialsecuritynumber"));
		dob.sendKeys(ExcelUtilities.excelData(methodName, tcName, "employeedob"));
		homeaddress.sendKeys(ExcelUtilities.excelData(methodName, tcName, "homeaddress"));
		city.sendKeys(ExcelUtilities.excelData(methodName, tcName, "city"));
		state.sendKeys(ExcelUtilities.excelData(methodName, tcName, "state"));
		zipcode.sendKeys(ExcelUtilities.excelData(methodName, tcName, "employeezipcode"));
		telephone.sendKeys(ExcelUtilities.excelData(methodName, tcName, "telephone"));
		gender.sendKeys(ExcelUtilities.excelData(methodName, tcName, "sex"));
		maritalstatus.sendKeys(ExcelUtilities.excelData(methodName, tcName, "marital status"));
		
/******************************EMPLOYER DETAILS********************************************************/		
		employername.sendKeys(ExcelUtilities.excelData(methodName, tcName, "employername")); 
		feinnumber.sendKeys(ExcelUtilities.excelData(methodName, tcName, "fiennumber"));
		officeaddress.sendKeys(ExcelUtilities.excelData(methodName, tcName, "officeaddress"));
		employercity.sendKeys(ExcelUtilities.excelData(methodName, tcName, "employercity"));
		employerstate.sendKeys(ExcelUtilities.excelData(methodName, tcName, "employerstate"));
		employerzipcode.sendKeys(ExcelUtilities.excelData(methodName, tcName, "employerzipcode"));
		employertelephone.sendKeys(ExcelUtilities.excelData(methodName, tcName, "employertelephone"));

/******************************ACCIDENT DETAILS********************************************************/	
		DATEOFINJURY.sendKeys(ExcelUtilities.excelData(methodName, tcName, "dateofinjury"));
		Notified.sendKeys(ExcelUtilities.excelData(methodName, tcName, "Notified"));
		afterinjury.sendKeys(ExcelUtilities.excelData(methodName, tcName, "afterinjury"));
		employeeoccupation.sendKeys(ExcelUtilities.excelData(methodName, tcName, "employeeoccupation"));
		employeepremises.sendKeys(ExcelUtilities.excelData(methodName, tcName, "employeepremesis"));
		wastheinjuryorillness.sendKeys(ExcelUtilities.excelData(methodName, tcName, "wastheinjuryorillness"));
		bodyinjured.sendKeys(ExcelUtilities.excelData(methodName, tcName, "bodyinjured"));
		SeleniumUtils.lookupWindowhandler(data, driver);
		fatal.sendKeys(ExcelUtilities.excelData(methodName, tcName, "fatal"));
		employeeemergency.sendKeys(ExcelUtilities.excelData(methodName, tcName, "employeeemergency"));
		treatedovernight.sendKeys(ExcelUtilities.excelData(methodName, tcName, "treatedovernight"));
		claimdoubted.sendKeys(ExcelUtilities.excelData(methodName, tcName, "claimdoubted"));
		
/*****************************CAUSE OF ACCIDENT	*******************************************************/
		whathappend.sendKeys(ExcelUtilities.excelData(methodName, tcName, "whathappend"));
		harmedemployee.sendKeys(ExcelUtilities.excelData(methodName, tcName, "harmedemployee"));
		SeleniumUtils.lookupWindowhandler(data, driver);
		SeleniumUtils.lookupWindowhandler(data, driver);
	}





		

	}



