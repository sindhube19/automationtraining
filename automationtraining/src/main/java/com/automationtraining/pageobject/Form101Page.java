package com.automationtraining.pageobject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.automationtraining.abstractclasses.Driverclass;
import com.automationtraining.basetest.BaseTest;
import com.automationtraining.utilities.ExcelUtilities;
import com.automationtraining.utilities.SeleniumUtils;

/**
 * @author Sindhuja Ethiraj
 *
 */
public class Form101Page extends BaseTest {

	/**
	 * @param driver
	 */
	/*public Form101Page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
*/
	/******************************Employee*******************************************/
	
	
	
	
	@FindBy(how=How.XPATH, using=".//label[contains(text(),'LAST NAME')]/following::input[1]")
	static
	WebElement lastname1; 
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
	static
	WebElement bodyinjuredkeytab;
	@FindBy(how=How.XPATH, using=".//a[text()='Part of Body Injured List']/preceding::span[1]/a/img")
	static
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
	static
	WebElement harmedemployeekeytab;
	@FindBy(how=How.XPATH, using=".//a[text()='Nature of Injury List']/preceding::span[1]/a/img")
	static
	WebElement natureofinjury;
	@FindBy(how=How.XPATH, using=".//a[text()='Cause of Injury List']/preceding::span[1]/a/img")
	static
	WebElement causeofinjury;

	@FindBy(how=How.XPATH, using=".//label[contains(text(),' INCIDENT OCCURRED')]/following::textarea[1]")
	static
	WebElement employeebeforeincidentoccured;
	@FindBy(how=How.XPATH, using=".//div[@class='bodyDiv brdPalette brandPrimaryBrd']/table/tbody/tr/td/form/div[2]/div[@class='editPage']/div/div/div[4]/div[2]/table/tbody/tr[6]/th[1]/label[' WAS WORKER IN YOUR EMPLOY WHEN INJURED?']/following::select[1]")
	static
	WebElement workerinemployee;
	@FindBy(how=How.XPATH, using=".//div[@class='bodyDiv brdPalette brandPrimaryBrd']/table/tbody/tr/td/form/div[2]/div[@class='editPage']/div/div/div[4]/div[2]/table/tbody/tr[6]/th[2]/label['DATE OF LAST HIRE']/following::input[1]")
	static


	WebElement datehire;
	@FindBy(how=How.XPATH, using=".//label[contains(text(),'ACTUAL GROSS EARNINGS OF EMPLOYEE FOR THE 30 CALENDAR DAYS PRECEEDING INJURY')]/following::input[1]")
	static
	WebElement grossearings;
	@FindBy(how=How.XPATH, using="//*[@id=\"j_id0:j_id5:j_id9:j_id242\"]/div/table/tbody/tr[2]/td/input")
	static
	WebElement agree;

	@FindBy(how=How.XPATH, using=".//label[contains(text(),'SUBMITTER EMAIL ADDRESS')]/following::input[1]")
	static
	WebElement submittermail;

	@FindBy(how=How.XPATH, using="//*[@id=\"j_id0:j_id5:j_id9\"]/div[1]/div[15]/input")
	static
	WebElement submit;

	@FindBy(how=How.XPATH, using=".//p[text()=' Thank you for your submission!']")
	static
	WebElement verifySuccess;

	public static void formFilling(String methodName, String tcName) throws Exception {
		
/******************************EMPLOYEE DETAILS *******************************************************/		
		Form101Page getElementValues = PageFactory.initElements(driver,Form101Page.class);
		
		lastname1.sendKeys(ExcelUtilities.readExcel(methodName, tcName, "lastname"));
		
		
		//getElementValues.lastname1.sendKeys(ExcelUtilities.readExcel(methodName, tcName, "firstname"));
		//getElementValues.lastname1.sendKeys(ExcelUtilities.readExcel(methodName, tcName, "firstname")); 
		
		firstname.sendKeys(ExcelUtilities.readExcel(methodName, tcName, "firstname")); 
		socialsecuritynumber.sendKeys(ExcelUtilities.readExcel(methodName, tcName, "socialsecuritynumber"));
		dob.sendKeys(ExcelUtilities.readExcel(methodName, tcName, "employeedob"));
		homeaddress.sendKeys(ExcelUtilities.readExcel(methodName, tcName, "homeaddress"));
		city.sendKeys(ExcelUtilities.readExcel(methodName, tcName, "city"));
		state.sendKeys(ExcelUtilities.readExcel(methodName, tcName, "state"));
		zipcode.sendKeys(ExcelUtilities.readExcel(methodName, tcName, "employeezipcode"));
		telephone.sendKeys(ExcelUtilities.readExcel(methodName, tcName, "telephone"));
		gender.sendKeys(ExcelUtilities.readExcel(methodName, tcName, "sex"));
		maritalstatus.sendKeys(ExcelUtilities.readExcel(methodName, tcName, "marital status"));
		
/******************************EMPLOYER DETAILS********************************************************/	
		employername.sendKeys(ExcelUtilities.readExcel(methodName, tcName, "employername")); 
		feinnumber.sendKeys(ExcelUtilities.readExcel(methodName, tcName, "fiennumber"));
		officeaddress.sendKeys(ExcelUtilities.readExcel(methodName, tcName, "officeaddress"));
		employercity.sendKeys(ExcelUtilities.readExcel(methodName, tcName, "employercity"));
		employerstate.sendKeys(ExcelUtilities.readExcel(methodName, tcName, "employerstate"));
		employerzipcode.sendKeys(ExcelUtilities.readExcel(methodName, tcName, "employerzipcode"));
		employertelephone.sendKeys(ExcelUtilities.readExcel(methodName, tcName, "employertelephone"));

/******************************ACCIDENT DETAILS********************************************************/	
		DATEOFINJURY.sendKeys(ExcelUtilities.readExcel(methodName, tcName, "dateofinjury"));
		Notified.sendKeys(ExcelUtilities.readExcel(methodName, tcName, "Notified"));
		afterinjury.sendKeys(ExcelUtilities.readExcel(methodName, tcName, "afterinjury"));
		employeeoccupation.sendKeys(ExcelUtilities.readExcel(methodName, tcName, "employeeoccupation"));
		employeepremises.sendKeys(ExcelUtilities.readExcel(methodName, tcName, "employeepremesis"));
		wastheinjuryorillness.sendKeys(ExcelUtilities.readExcel(methodName, tcName, "wastheinjuryorillness"));
		bodyinjured.sendKeys(ExcelUtilities.readExcel(methodName, tcName, "bodyinjured"));
		bodyinjuredkeytab.sendKeys(Keys.TAB);
		lookuppartofbodyinjured.click();
		SeleniumUtils.lookupWindowhandler("head", driver);
		fatal.sendKeys(ExcelUtilities.readExcel(methodName, tcName, "fatal"));
		employeeemergency.sendKeys(ExcelUtilities.readExcel(methodName, tcName, "employeeemergency"));
		treatedovernight.sendKeys(ExcelUtilities.readExcel(methodName, tcName, "treatedovernight"));
		claimdoubted.sendKeys(ExcelUtilities.readExcel(methodName, tcName, "claimdoubted"));
		
/*****************************CAUSE OF ACCIDENT	*******************************************************/
		whathappend.sendKeys(ExcelUtilities.readExcel(methodName, tcName, "whathappend"));
		harmedemployee.sendKeys(ExcelUtilities.readExcel(methodName, tcName, "harmedemployee"));
		harmedemployeekeytab.sendKeys(Keys.TAB);
		natureofinjury.click();
		SeleniumUtils.lookupWindowhandler("Multiple Injuries", driver);
		causeofinjury.click();
		SeleniumUtils.lookupWindowhandler("Motor Vehicle", driver);
		employeebeforeincidentoccured.sendKeys(ExcelUtilities.readExcel(methodName, tcName, "incidentoccured"));
		workerinemployee.sendKeys(ExcelUtilities.readExcel(methodName, tcName, "employwheninjured"));
		datehire.sendKeys(ExcelUtilities.readExcel(methodName, tcName, "datehire"));
		grossearings.sendKeys(ExcelUtilities.readExcel(methodName, tcName, "grossearnings"));
		submittermail.sendKeys(ExcelUtilities.readExcel(methodName, tcName, "submitteremail"));
		agree.click();
		submit.click();
		SeleniumUtils.highLightelements(verifySuccess, driver);


	}

}



