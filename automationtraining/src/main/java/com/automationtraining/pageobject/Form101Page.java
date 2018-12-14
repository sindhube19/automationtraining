package com.automationtraining.pageobject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.automationtraining.ExtentReportListener.ReportGenerator;
import com.automationtraining.abstractclasses.Driverclass;
import com.automationtraining.basetest.BaseTest;
import com.automationtraining.utilities.ExcelUtilities;
import com.automationtraining.utilities.SeleniumUtils;

/**
 * @author Sindhuja Ethiraj
 *
 */
public class Form101Page extends Driverclass {

	/**
	 * @param driver
	 */
	public Form101Page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	/******************************Employee*******************************************/
	
	
	
	
	@FindBy(how=How.XPATH, using=".//label[contains(text(),'LAST NAME')]/following::input[1]")
	public WebElement lastname1; 
	@FindBy(how=How.XPATH, using=".//label[contains(text(),'FIRST')]/following::input[1]")
	public
	WebElement firstname;
	@FindBy(how=How.XPATH, using=".//label[contains(text(),'SOCIAL SECURITY NUMBER')]/following::input[1]")
	public

	WebElement socialsecuritynumber;
	@FindBy(how=How.XPATH, using=".//label[contains(text(),'BIRTH DATE')]/following::input[1]")
	public
	WebElement dob;
	@FindBy(how=How.XPATH, using=".//label[contains(text(),'HOME ADDRESS(NUMBER AND STREET')]/following::input[1]")
	public
	WebElement homeaddress;
	@FindBy(how=How.XPATH, using=".//label[contains(text(),'CITY')]/following::input[1]")
	public
	WebElement city;
	@FindBy(how=How.XPATH, using=".//label[contains(text(),'STATE')]/following::input[1]")
	public
	WebElement state;
	@FindBy(how=How.XPATH, using=".//label[contains(text(),'ZIP CODE')]/following::input[1]")
	public
	WebElement zipcode;
	@FindBy(how=How.XPATH, using=".//label[contains(text(),'TELEPHONE')]/following::input[1]")
	public
	WebElement telephone;
	@FindBy(how=How.XPATH, using=".//label[contains(text(),'SEX')]/following::select[1]")
	public
	WebElement gender;
	@FindBy(how=How.XPATH, using=".//label[contains(text(),'SEX')]/following::select[1]")
	WebElement keytab;
	@FindBy(how=How.XPATH, using=".//label[contains(text(),'MARITAL STATUS')]/following::select[1]")
	public
	WebElement maritalstatus;
	@FindBy(how=How.XPATH, using=".//label[contains(text(),'MARITAL STATUS')]/following::select[1]")
	WebElement maritalkeytab;

	/*******************Employer Details***************************************************/

	@FindBy(how=How.XPATH, using=".//div[@class='bodyDiv brdPalette brandPrimaryBrd']/table/tbody/tr/td/form/div[2]/div[@class='editPage']/div/div/div[2]/div[@class='pbSubsection']/table/tbody/tr/th/label[contains(text(),'EMPLOYER')]/following::input[1]")
	public
	WebElement employername;
	@FindBy(how=How.XPATH, using=".//label[contains(text(),'FEIN NUMBER' )]/following::input[1]")
	public
	WebElement feinnumber;
	@FindBy(how=How.XPATH, using=".//label[contains(text(),'OFFICE ADDRESS(NUMBER & STREET' )]/following::input[1]")
	public
	WebElement officeaddress;
	@FindBy(how=How.XPATH, using=".//div[@class='bodyDiv brdPalette brandPrimaryBrd']/table/tbody/tr/td/form/div[2]/div[@class='editPage']/div/div/div[2]/div[@class='pbSubsection']/table/tbody/tr/th/label[contains(text(),'CITY')]/following::input[1]")
	public
	WebElement employercity;
	@FindBy(how=How.XPATH, using=".//div[@class='bodyDiv brdPalette brandPrimaryBrd']/table/tbody/tr/td/form/div[2]/div[@class='editPage']/div/div/div[2]/div[@class='pbSubsection']/table/tbody/tr/th/label[contains(text(),'STATE')]/following::input[1]")
	public
	WebElement employerstate;
	@FindBy(how=How.XPATH, using=".//div[@class='bodyDiv brdPalette brandPrimaryBrd']/table/tbody/tr/td/form/div[2]/div[@class='editPage']/div/div/div[2]/div[@class='pbSubsection']/table/tbody/tr/th/label[contains(text(),'ZIP CODE')]/following::input[1]")
	public
	WebElement employerzipcode;
	@FindBy(how=How.XPATH, using=".//div[@class='bodyDiv brdPalette brandPrimaryBrd']/table/tbody/tr/td/form/div[2]/div[@class='editPage']/div/div/div[2]/div[@class='pbSubsection']/table/tbody/tr/th/label[contains(text(),'TELEPHONE')]/following::input[1]")
	public
	WebElement employertelephone;

	/********************Accident Details*************************************************/

	@FindBy(how=How.XPATH, using=".//div[@class='bodyDiv brdPalette brandPrimaryBrd']/table/tbody/tr/td/form/div[2]/div[@class='editPage']/div/div/div[3]/.//label[contains(text(),'DATE OF INJURY OR ILLNESS')]/following::input[1]")
	public
	WebElement DATEOFINJURY;
	@FindBy(how=How.XPATH, using=".//div[@class='bodyDiv brdPalette brandPrimaryBrd']/table/tbody/tr/td/form/div[2]/div[@class='editPage']/div/div/div[3]/.//label[contains(text(),'DATE EMPLOYER NOTIFIED OF INJURY')]/following::input[1]")
	public
	WebElement Notified;
	@FindBy(how=How.XPATH, using=".//div[@class='bodyDiv brdPalette brandPrimaryBrd']/table/tbody/tr/td/form/div[2]/div[@class='editPage']/div/div/div[3]/.//label[contains(text(),'LAST DAY OF WORK AFTER INJURY')]/following::input[1]")
	public
	WebElement afterinjury;
	@FindBy(how=How.XPATH, using=".//div[@class='bodyDiv brdPalette brandPrimaryBrd']/table/tbody/tr/td/form/div[2]/div[@class='editPage']/div/div/div[3]/.//label[contains(text(),'HAS EMPLOYEE RETURNED TO WORK?')]/following::input[1]")
	WebElement hasemployeereturnedhome;
	@FindBy(how=How.XPATH, using=".//div[@class='bodyDiv brdPalette brandPrimaryBrd']/table/tbody/tr/td/form/div[2]/div[@class='editPage']/div/div/div[3]/.//label[contains(text(),'OCCUPATION')]/following::input[1]")
	public
	WebElement employeeoccupation;
	@FindBy(how=How.XPATH, using=".//div[@class='bodyDiv brdPalette brandPrimaryBrd']/table/tbody/tr/td/form/div[2]/div[@class='editPage']/div/div/div[3]/.//label[contains(text(),'EMPLOYER PREMISES')]/following::select[1]")
	public
	WebElement employeepremises;
	@FindBy(how=How.XPATH, using=".//div[@class='bodyDiv brdPalette brandPrimaryBrd']/table/tbody/tr/td/form/div[2]/div[@class='editPage']/div/div/div[3]/div['pbSubsection']/table/tbody/tr[15]/th/span/label[' WHAT WAS THE INJURY OR ILLNESS']/following::textarea[1]")
	public
	WebElement wastheinjuryorillness;
	@FindBy(how=How.XPATH, using=".//label[contains(text(),'PART OF BODY INJURED')]/following::input[1]")
	public
	WebElement bodyinjured;
	@FindBy(how=How.XPATH, using=".//label[contains(text(),'PART OF BODY INJURED')]/following::input[1]")
	public
	WebElement bodyinjuredkeytab;
	@FindBy(how=How.XPATH, using=".//a[text()='Part of Body Injured List']/preceding::span[1]/a/img")
	public
	WebElement lookuppartofbodyinjured;
	@FindBy(how=How.XPATH, using=".//label[contains(text(),'FATAL')]/following::select[1]")
	public
	WebElement fatal;
	@FindBy(how=How.XPATH, using=".//label[contains(text(),'WAS EMPLOYEE TREATED IN AN EMERGENCY                                              ROOM?')]/following::select[1]")
	public
	WebElement employeeemergency;
	@FindBy(how=How.XPATH, using=".//label[contains(text(),'WAS EMPLOYEE HOSPITALIZED OVERNIGHT AS                                              AN IN-PATIENT?')]/following::select[1]")
	public
	WebElement treatedovernight;
	@FindBy(how=How.XPATH, using=".//label[contains(text(),'IS VALIDITY OF CLAIM DOUBTED')]/following::select[1]")
	public
	WebElement claimdoubted;



	/**********************Cause of accident*********************************/

	@FindBy(how=How.XPATH, using=".//div[@class='bodyDiv brdPalette brandPrimaryBrd']/table/tbody/tr/td/form/div[2]/div[@class='editPage']/div/div/div[4]/div[2]/table/tbody/tr/th/span/label[contains(text(),'WHAT HAPPENED')]/following::textarea[1]")
	public
	WebElement whathappend;
	@FindBy(how=How.XPATH, using=".//div[@class='bodyDiv brdPalette brandPrimaryBrd']/table/tbody/tr/td/form/div[2]/div[@class='editPage']/div/div/div[4]/div[2]/table/tbody/tr/th/span/label[contains(text(),'WHAT OBJECT OR SUBSTANCE DIRECTLY HARMED THE EMPLOYEE')]/following::textarea[1]")
	public
	WebElement harmedemployee;
	@FindBy(how=How.XPATH, using=".//div[@class='bodyDiv brdPalette brandPrimaryBrd']/table/tbody/tr/td/form/div[2]/div[@class='editPage']/div/div/div[4]/div[2]/table/tbody/tr/th/span/label[contains(text(),'WHAT OBJECT OR SUBSTANCE DIRECTLY HARMED THE EMPLOYEE')]/following::textarea[1]")
	public
	WebElement harmedemployeekeytab;
	@FindBy(how=How.XPATH, using=".//a[text()='Nature of Injury List']/preceding::span[1]/a/img")
	public
	WebElement natureofinjury;
	@FindBy(how=How.XPATH, using=".//a[text()='Cause of Injury List']/preceding::span[1]/a/img")
	public
	WebElement causeofinjury;

	@FindBy(how=How.XPATH, using=".//label[contains(text(),' INCIDENT OCCURRED')]/following::textarea[1]")
	public
	WebElement employeebeforeincidentoccured;
	@FindBy(how=How.XPATH, using=".//div[@class='bodyDiv brdPalette brandPrimaryBrd']/table/tbody/tr/td/form/div[2]/div[@class='editPage']/div/div/div[4]/div[2]/table/tbody/tr[6]/th[1]/label[' WAS WORKER IN YOUR EMPLOY WHEN INJURED?']/following::select[1]")
	public
	WebElement workerinemployee;
	@FindBy(how=How.XPATH, using=".//div[@class='bodyDiv brdPalette brandPrimaryBrd']/table/tbody/tr/td/form/div[2]/div[@class='editPage']/div/div/div[4]/div[2]/table/tbody/tr[6]/th[2]/label['DATE OF LAST HIRE']/following::input[1]")
	public


	WebElement datehire;
	@FindBy(how=How.XPATH, using=".//label[contains(text(),'ACTUAL GROSS EARNINGS OF EMPLOYEE FOR THE 30 CALENDAR DAYS PRECEEDING INJURY')]/following::input[1]")
	public
	WebElement grossearings;
	@FindBy(how=How.XPATH, using="//*[@id=\"j_id0:j_id5:j_id9:j_id242\"]/div/table/tbody/tr[2]/td/input")
	public
	WebElement agree;

	@FindBy(how=How.XPATH, using=".//label[contains(text(),'SUBMITTER EMAIL ADDRESS')]/following::input[1]")
	public
	WebElement submittermail;

	@FindBy(how=How.XPATH, using="//*[@id=\"j_id0:j_id5:j_id9\"]/div[1]/div[15]/input")
	public
	WebElement submit;

	@FindBy(how=How.XPATH, using=".//p[text()=' Thank you for your submission!']")
	public
	WebElement verifySuccess;

	
	public void formFilling(String methodName, String tcName,ReportGenerator generator) throws Exception {
		
/******************************EMPLOYEE DETAILS *******************************************************/		
		generator.childReport("Entering the LastName");
	    lastname1.sendKeys(ExcelUtilities.readExcel(methodName, tcName, "lastname"));
		generator.childReport("Entering the Firstname");
		firstname.sendKeys(ExcelUtilities.readExcel(methodName, tcName, "firstname")); 
		generator.childReport("Entering the socialsecuritynumber");
		socialsecuritynumber.sendKeys(ExcelUtilities.readExcel(methodName, tcName, "socialsecuritynumber"));
		generator.childReport("Entering the employee date of birth");
		dob.sendKeys(ExcelUtilities.readExcel(methodName, tcName, "employeedob"));
		generator.childReport("Entering the Employee home address");
		homeaddress.sendKeys(ExcelUtilities.readExcel(methodName, tcName, "homeaddress"));
		generator.childReport("Entering the Employee City");
		city.sendKeys(ExcelUtilities.readExcel(methodName, tcName, "city"));
		generator.childReport("Entering the Employee State");
		state.sendKeys(ExcelUtilities.readExcel(methodName, tcName, "state"));
		generator.childReport("Entering the Employee Zipcode");
		zipcode.sendKeys(ExcelUtilities.readExcel(methodName, tcName, "employeezipcode"));
		generator.childReport("Entering the Employee telephone");
		telephone.sendKeys(ExcelUtilities.readExcel(methodName, tcName, "telephone"));
		generator.childReport("Entering the Employee gender");
		gender.sendKeys(ExcelUtilities.readExcel(methodName, tcName, "sex"));
		generator.childReport("Entering the Employee maritalstatus");
		maritalstatus.sendKeys(ExcelUtilities.readExcel(methodName, tcName, "marital status"));
		
/******************************EMPLOYER DETAILS********************************************************/	
		generator.childReport("Entering the Employer Name");
		employername.sendKeys(ExcelUtilities.readExcel(methodName, tcName, "employername")); 
		generator.childReport("Entering the Employer FIEN Number");
		feinnumber.sendKeys(ExcelUtilities.readExcel(methodName, tcName, "fiennumber"));
		generator.childReport("Entering the Employer office address");
		officeaddress.sendKeys(ExcelUtilities.readExcel(methodName, tcName, "officeaddress"));
		generator.childReport("Entering the Employer City");
		employercity.sendKeys(ExcelUtilities.readExcel(methodName, tcName, "employercity"));
		generator.childReport("Entering the Employer State");
		employerstate.sendKeys(ExcelUtilities.readExcel(methodName, tcName, "employerstate"));
		generator.childReport("Entering the Employer Zipcode");
		employerzipcode.sendKeys(ExcelUtilities.readExcel(methodName, tcName, "employerzipcode"));
		generator.childReport("Entering the Employer telephone");
		employertelephone.sendKeys(ExcelUtilities.readExcel(methodName, tcName, "employertelephone"));

/******************************ACCIDENT DETAILS********************************************************/	
		generator.childReport("Entering the Date of Injury");
		DATEOFINJURY.sendKeys(ExcelUtilities.readExcel(methodName, tcName, "dateofinjury"));
		generator.childReport("Entering the Date notified");
		Notified.sendKeys(ExcelUtilities.readExcel(methodName, tcName, "Notified"));
		generator.childReport("Entering the Date of after injury");
		afterinjury.sendKeys(ExcelUtilities.readExcel(methodName, tcName, "afterinjury"));
		generator.childReport("Entering the Employee occupation");
		employeeoccupation.sendKeys(ExcelUtilities.readExcel(methodName, tcName, "employeeoccupation"));
		generator.childReport("Entering the Employee premesis");
		employeepremises.sendKeys(ExcelUtilities.readExcel(methodName, tcName, "employeepremesis"));
		generator.childReport("Entering injury or illness");
		wastheinjuryorillness.sendKeys(ExcelUtilities.readExcel(methodName, tcName, "wastheinjuryorillness"));
		generator.childReport("Entering body injured");
		bodyinjured.sendKeys(ExcelUtilities.readExcel(methodName, tcName, "bodyinjured"));
		bodyinjuredkeytab.sendKeys(Keys.TAB);
		lookuppartofbodyinjured.click();
		SeleniumUtils.lookupWindowhandler("head", driver);
		generator.childReport("Entering the fatal detail");
		fatal.sendKeys(ExcelUtilities.readExcel(methodName, tcName, "fatal"));
		generator.childReport("Entering the employee emergency");
		employeeemergency.sendKeys(ExcelUtilities.readExcel(methodName, tcName, "employeeemergency"));
		generator.childReport("Entering was the employee treated overnight");
		treatedovernight.sendKeys(ExcelUtilities.readExcel(methodName, tcName, "treatedovernight"));
		generator.childReport("Entering claim doubted");
		claimdoubted.sendKeys(ExcelUtilities.readExcel(methodName, tcName, "claimdoubted"));
		
/*****************************CAUSE OF ACCIDENT	*******************************************************/
		generator.childReport("Entering the detail of what happened");
		whathappend.sendKeys(ExcelUtilities.readExcel(methodName, tcName, "whathappend"));
		generator.childReport("Entering the info harm happened to emplyee");
		harmedemployee.sendKeys(ExcelUtilities.readExcel(methodName, tcName, "harmedemployee"));
		harmedemployeekeytab.sendKeys(Keys.TAB);
		natureofinjury.click();
		SeleniumUtils.lookupWindowhandler("Multiple Injuries", driver);
		causeofinjury.click();
		SeleniumUtils.lookupWindowhandler("Motor Vehicle", driver);
		generator.childReport("Entering incident occured");
		employeebeforeincidentoccured.sendKeys(ExcelUtilities.readExcel(methodName, tcName, "incidentoccured"));
		generator.childReport("Entering details of when employee got injured");
		workerinemployee.sendKeys(ExcelUtilities.readExcel(methodName, tcName, "employwheninjured"));
		generator.childReport("Entering employee hiring date");
		datehire.sendKeys(ExcelUtilities.readExcel(methodName, tcName, "datehire"));
		generator.childReport("Entering employee's gross earnings");
		grossearings.sendKeys(ExcelUtilities.readExcel(methodName, tcName, "grossearnings"));
		generator.childReport("Entering employee email");
		submittermail.sendKeys(ExcelUtilities.readExcel(methodName, tcName, "submitteremail"));
		generator.childReport("Accepting the agree");
		agree.click();
		generator.childReport("Submitting the button");
		submit.click();
		generator.childReport("Verifying the success message");
		SeleniumUtils.highLightelements(verifySuccess, driver);


	}
	public void validatingtheForm101() {
		// need to do for failed test case
	}

}



