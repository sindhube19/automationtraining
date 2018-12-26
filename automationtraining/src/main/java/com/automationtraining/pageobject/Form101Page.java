package com.automationtraining.pageobject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


import com.automationtraining.ExtentReportListener.ReportGenerator;
import com.automationtraining.abstractclasses.Driverclass;
import com.automationtraining.utilities.ExcelUtilities;
import com.automationtraining.utilities.Log;
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

	@FindBy(how=How.XPATH, using=".//label[contains(text(),'Username')]/following::input[1]")
	public
	WebElement lightningusername;

	@FindBy(how=How.XPATH, using=".//label[contains(text(),'Password')]/following::input[1]")
	public
	WebElement lightningpassword;
	@FindBy(how=How.XPATH, using=".//form/input[2]")
	public
	WebElement loginbutton;

	@FindBy(how=How.XPATH, using=".//*[@id=\"oneHeader\"]/div[3]/one-appnav/div/div/div/nav")
	public
	WebElement menuiconclick;

	@FindBy(how=How.XPATH, using=".//div[@class='slds-section slds-is-open oneAppLauncherItemList']/div[2]/ul/li/a[@title='101']")
	public
	WebElement clickdata;

	@FindBy(how=How.XPATH, using=".//div[@class='slds-form-element__control slds-grow slds-input-has-icon slds-input-has-icon_left-right']/input")
	public
	WebElement search;

	@FindBy(how=How.XPATH, using=".//table/tbody/tr[1]/th/span/a")
	public
	WebElement tabledata;

	@FindBy(how=How.XPATH, using=".//span[contains(text(),'Last Name')]/following::span[1]")
	public
	WebElement lastname_form;

	@FindBy(how=How.XPATH, using=".//span[contains(text(),'First Name')]/following::span[1]")
	public
	WebElement firstname_form;

	@FindBy(how=How.XPATH, using=".//span[contains(text(),'Social Security Number')]/following::span[2]")
	public
	WebElement socialsecurity_form;

	@FindBy(how=How.XPATH, using=".//span[contains(text(),'Date of Birth')]/following::span[1]")
	public
	WebElement datofbirth_form;

	@FindBy(how=How.XPATH, using=".//span[contains(text(),'Home Address')]/following::span[1]")
	public
	WebElement homeaddress_form;
	
	@FindBy(how=How.XPATH, using=".//span[contains(text(),'Home Address')]/following::span[1]")
	public
	WebElement
	city_form;
	public void formFilling(String methodName, String tcName,ReportGenerator generator) throws Exception {

		/******************************EMPLOYEE DETAILS *******************************************************/		
		generator.childReport("Entering the LastName");
		lastname1.sendKeys(ExcelUtilities.readExcel(methodName, tcName, "lastname"));
		Log.info("Entering the Lastname");

		generator.childReport("Entering the Firstname");
		firstname.sendKeys(ExcelUtilities.readExcel(methodName, tcName, "firstname")); 
		Log.info("FirstName is Entered Successfully");

		generator.childReport("Entering the socialsecuritynumber");
		socialsecuritynumber.sendKeys(ExcelUtilities.readExcel(methodName, tcName, "socialsecuritynumber"));
		Log.info("socialsecuritynumber is Entered Successfully");

		generator.childReport("Entering the employee date of birth");
		dob.sendKeys(ExcelUtilities.readExcel(methodName, tcName, "employeedob"));
		Log.info("employee date of birth is Entered Successfully");

		generator.childReport("Entering the Employee home address");
		homeaddress.sendKeys(ExcelUtilities.readExcel(methodName, tcName, "homeaddress"));
		Log.info("Employee home address is Entered Successfully");

		generator.childReport("Entering the Employee City");
		city.sendKeys(ExcelUtilities.readExcel(methodName, tcName, "city"));
		Log.info("Employee City is Entered Successfully");

		generator.childReport("Entering the Employee State");
		state.sendKeys(ExcelUtilities.readExcel(methodName, tcName, "state"));
		Log.info("Employee State is Entered Successfully");

		generator.childReport("Entering the Employee Zipcode");
		zipcode.sendKeys(ExcelUtilities.readExcel(methodName, tcName, "employeezipcode"));
		Log.info("Employee Zipcode is Entered Successfully");

		generator.childReport("Entering the Employee telephone");
		telephone.sendKeys(ExcelUtilities.readExcel(methodName, tcName, "telephone"));
		Log.info("Employee telephone is Entered Successfully");

		generator.childReport("Entering the Employee gender");
		gender.sendKeys(ExcelUtilities.readExcel(methodName, tcName, "sex"));
		Log.info("Employee gender is Entered Successfully");

		generator.childReport("Entering the Employee maritalstatus");
		maritalstatus.sendKeys(ExcelUtilities.readExcel(methodName, tcName, "marital status"));

		/******************************EMPLOYER DETAILS********************************************************/	
		generator.childReport("Entering the Employer Name");
		employername.sendKeys(ExcelUtilities.readExcel(methodName, tcName, "employername")); 
		Log.info("Employer Name is Entered Successfully");

		generator.childReport("Entering the Employer FIEN Number");
		feinnumber.sendKeys(ExcelUtilities.readExcel(methodName, tcName, "fiennumber"));
		Log.info("Employer FIEN Number is Entered Successfully");

		generator.childReport("Entering the Employer office address");
		officeaddress.sendKeys(ExcelUtilities.readExcel(methodName, tcName, "officeaddress"));
		Log.info("Employer office address is Entered Successfully");

		generator.childReport("Entering the Employer City");
		employercity.sendKeys(ExcelUtilities.readExcel(methodName, tcName, "employercity"));
		Log.info("Employer City is Entered Successfully");

		generator.childReport("Entering the Employer State");
		employerstate.sendKeys(ExcelUtilities.readExcel(methodName, tcName, "employerstate"));
		Log.info("Employer State is Entered Successfully");

		generator.childReport("Entering the Employer Zipcode");
		employerzipcode.sendKeys(ExcelUtilities.readExcel(methodName, tcName, "employerzipcode"));
		Log.info("Employer Zipcode is Entered Successfully");

		generator.childReport("Entering the Employer telephone");
		employertelephone.sendKeys(ExcelUtilities.readExcel(methodName, tcName, "employertelephone"));
		Log.info("Employer telephone is Entered Successfully");

		/******************************ACCIDENT DETAILS********************************************************/	
		generator.childReport("Entering the Date of Injury");
		DATEOFINJURY.sendKeys(ExcelUtilities.readExcel(methodName, tcName, "dateofinjury"));
		Log.info("Employer Date of Injury is Entered Successfully");

		generator.childReport("Entering the Date notified");
		Notified.sendKeys(ExcelUtilities.readExcel(methodName, tcName, "Notified"));
		Log.info("Employer Date notified is Entered Successfully");

		generator.childReport("Entering the Date of after injury");
		afterinjury.sendKeys(ExcelUtilities.readExcel(methodName, tcName, "afterinjury"));
		Log.info("Employer Date of after injury is Entered Successfully");

		generator.childReport("Entering the Employee occupation");
		employeeoccupation.sendKeys(ExcelUtilities.readExcel(methodName, tcName, "employeeoccupation"));
		Log.info("Employee occupation is Entered Successfully");

		generator.childReport("Entering the Employee premesis");
		employeepremises.sendKeys(ExcelUtilities.readExcel(methodName, tcName, "employeepremesis"));
		Log.info("Employee premesis is Entered Successfully");

		generator.childReport("Entering injury or illness");
		wastheinjuryorillness.sendKeys(ExcelUtilities.readExcel(methodName, tcName, "wastheinjuryorillness"));
		Log.info("Employee injury or illness is Entered Successfully");

		generator.childReport("Entering body injured");
		bodyinjured.sendKeys(ExcelUtilities.readExcel(methodName, tcName, "bodyinjured"));
		Log.info("Employee body injured is Entered Successfully");

		bodyinjuredkeytab.sendKeys(Keys.TAB);
		Log.info("Employee lookuppartofbodyinjured is Entered Successfully");

		lookuppartofbodyinjured.click();
		SeleniumUtils.lookupWindowhandler("head", driver);

		generator.childReport("Entering the fatal detail");
		fatal.sendKeys(ExcelUtilities.readExcel(methodName, tcName, "fatal"));
		Log.info("Employee fatal detail is Entered Successfully");

		generator.childReport("Entering the employee emergency");
		Log.info("employee emergency is Entered Successfully");
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
	public void formverification(String methodName, String tcName,ReportGenerator generator) throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Log.info("Loging into the Lightning Successfully");
		lightningusername.sendKeys("divya.k@mstsolutions.com");


		lightningpassword.sendKeys("123welcome");
		loginbutton.click();
		Thread.sleep(20000);

		menuiconclick.click();
		Thread.sleep(20000);

		clickdata.click();
		Thread.sleep(20000);

		Log.info("Entering value in search box");
		search.sendKeys("ethiraj");
		search.sendKeys(Keys.ENTER);
		Thread.sleep(10000);

		Log.info("selecting table data");
		tabledata.click();
		Thread.sleep(10000);

		String lastname = lastname_form.getText();
		String firstname = firstname_form.getText();
		String socialsecurity = socialsecurity_form.getText();
		String dob = datofbirth_form.getText();
		String homeaddress = homeaddress_form.getText();
		String city = city_form.getText();
		Thread.sleep(10000);
		/***************Last Name****************************/
		if(lastname.equals(ExcelUtilities.readExcel(methodName, tcName, "lastname"))) {

			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", lastname_form);
		}
		/***************First Name****************************/
		if(firstname.equals(ExcelUtilities.readExcel(methodName, tcName, "firstname"))) {

			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", firstname_form);
		}
		/***************Social security number****************************/
		if(socialsecurity.equals(ExcelUtilities.readExcel(methodName, tcName, "socialsecuritynumber"))) {

			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", socialsecurity_form);
		}
		/***************Date of birth****************************/

		if(dob.equals(ExcelUtilities.readExcel(methodName, tcName, "employeedob"))) {

			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", datofbirth_form);
		}

		/***********************Home Address************************************/
		if(homeaddress.equals(ExcelUtilities.readExcel(methodName, tcName, "homeaddress"))) {

			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", homeaddress_form);
		}
		
		/************************City*****************/
		if(city.equals(ExcelUtilities.readExcel(methodName, tcName, "homeaddress"))) {

			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", city_form);
		}




	}

}


