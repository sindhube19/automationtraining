package com.automationtraining.pageobject;
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

	@FindBy(how=How.XPATH, using=".//div[@class='full forcePageBlock forceRecordLayout']/div[2]/div/div[@class='slds-form slds-form_stacked ']/div[7]/div/div/div[2]/span")
	public
	WebElement city_form;

	@FindBy(how=How.XPATH, using=".//div[@class='full forcePageBlock forceRecordLayout']/div[2]/div/div[@class='slds-form slds-form_stacked ']/div[8]/div/div/div[2]/span")
	public
	WebElement state_form;

	@FindBy(how=How.XPATH, using=".//div[@class='full forcePageBlock forceRecordLayout']/div[2]/div/div[@class='slds-form slds-form_stacked ']/div[9]//div/div/div[2]/span")
	public
	WebElement zipcode_form;

	@FindBy(how=How.XPATH, using=".//div[@class='full forcePageBlock forceRecordLayout']/div[2]/div/div[@class='slds-form slds-form_stacked ']/div[10]/div/div/div[2]/span")
	public
	WebElement telephone_form;

	@FindBy(how=How.XPATH, using=".//span[contains(text(),'Sex')]/following::span[1]")
	public
	WebElement gender_form;

	@FindBy(how=How.XPATH, using=".//span[contains(text(),'Marital Status')]/following::span[1]")
	public
	WebElement maritalstatus_form;

	/********Employer Lightning form *************/

	@FindBy(how=How.XPATH, using=".//div[3][@class='test-id__section slds-section  slds-is-open full forcePageBlockSection forcePageBlockSectionView']/div/div/div[1]/div[1]/div/div[2]/span")
	public
	WebElement employername_form;

	@FindBy(how=How.XPATH, using=".//div[3][@class='test-id__section slds-section  slds-is-open full forcePageBlockSection forcePageBlockSectionView']/div/div/div[2]/div[1]/div/div[2]/span")
	public
	WebElement fiennumber_form;

	@FindBy(how=How.XPATH, using=".//div[3][@class='test-id__section slds-section  slds-is-open full forcePageBlockSection forcePageBlockSectionView']/div/div/div[4]/div[1]/div/div[2]/span")
	public
	WebElement officeaddress_form;

	@FindBy(how=How.XPATH, using=".//div[3][@class='test-id__section slds-section  slds-is-open full forcePageBlockSection forcePageBlockSectionView']/div/div/div[5]/div[1]/div/div[2]/span")
	public
	WebElement employercity_form;

	@FindBy(how=How.XPATH, using=".//div[3][@class='test-id__section slds-section  slds-is-open full forcePageBlockSection forcePageBlockSectionView']/div/div/div[6]/div[1]/div/div[2]/span")
	public
	WebElement employerstate_form;

	@FindBy(how=How.XPATH, using=".//div[3][@class='test-id__section slds-section  slds-is-open full forcePageBlockSection forcePageBlockSectionView']/div/div/div[7]/div[1]/div/div[2]/span")
	public
	WebElement employerzipcode_form;

	@FindBy(how=How.XPATH, using=".//div[3][@class='test-id__section slds-section  slds-is-open full forcePageBlockSection forcePageBlockSectionView']/div/div/div[8]/div[1]/div/div[2]/span")
	public
	WebElement employertelephone_form;


	@FindBy(how=How.XPATH, using=".//div[4][@class='test-id__section slds-section  slds-is-open full forcePageBlockSection forcePageBlockSectionView']/div/div/div[5]/div[1]/div/div[2]/span")
	public
	WebElement jobtitle_form;

	@FindBy(how=How.XPATH, using=".//div[4][@class='test-id__section slds-section  slds-is-open full forcePageBlockSection forcePageBlockSectionView']/div/div/div[8]/div[1]/div/div[2]/span")
	public
	WebElement premises_form;

	@FindBy(how=How.XPATH, using=".//div[4][@class='test-id__section slds-section  slds-is-open full forcePageBlockSection forcePageBlockSectionView']/div/div/div[8]/div[1]/div/div[2]/span")
	public
	WebElement injury_form;

	@FindBy(how=How.XPATH, using=".//div[4][@class='test-id__section slds-section  slds-is-open full forcePageBlockSection forcePageBlockSectionView']/div/div/div[15]/div[1]/div/div[2]/span")
	public
	WebElement partofbody_form;

	@FindBy(how=How.XPATH, using=".//div[4][@class='test-id__section slds-section  slds-is-open full forcePageBlockSection forcePageBlockSectionView']/div/div/div[16]/div[1]/div/div[2]/span")
	public
	WebElement fatal_form;

	@FindBy(how=How.XPATH, using=".//div[4][@class='test-id__section slds-section  slds-is-open full forcePageBlockSection forcePageBlockSectionView']/div/div/div[17]/div[1]/div/div[2]/span")
	public
	WebElement emptreatedinemgroom_form;

	@FindBy(how=How.XPATH, using=".//div[4][@class='test-id__section slds-section  slds-is-open full forcePageBlockSection forcePageBlockSectionView']/div/div/div[23]/div[1]/div/div[2]/span")
	public
	WebElement hospitalizedovernight_form;

	@FindBy(how=How.XPATH, using=".//div[4][@class='test-id__section slds-section  slds-is-open full forcePageBlockSection forcePageBlockSectionView']/div/div/div[29]/div[1]/div/div[2]/span")
	public
	WebElement claimdoubted_form;

	@FindBy(how=How.XPATH, using=".//div[5][@class='test-id__section slds-section  slds-is-open full forcePageBlockSection forcePageBlockSectionView']/div/div/div[1]/div/div/div[2]/span")
	public
	WebElement whathappened_form;

	@FindBy(how=How.XPATH, using=".//div[5][@class='test-id__section slds-section  slds-is-open full forcePageBlockSection forcePageBlockSectionView']/div/div/div[2]/div/div/div[2]/span")
	public
	WebElement harmedemployee_form;

	@FindBy(how=How.XPATH, using=".//div[5][@class='test-id__section slds-section  slds-is-open full forcePageBlockSection forcePageBlockSectionView']/div/div/div[4]/div/div/div[2]/span")
	public
	WebElement employeebeforeaccident_form;

	@FindBy(how=How.XPATH, using=".//div[5][@class='test-id__section slds-section  slds-is-open full forcePageBlockSection forcePageBlockSectionView']/div/div/div[6]/div/div/div[2]/span")
	public
	WebElement employeewheninjured_form;

	/**************************Employee Error Message*********************************/
	@FindBy(how=How.XPATH, using=".//*[@class='pbSubsection']/table/tbody/tr[1]/td[1]/div[1]/div[2]")
	public
	WebElement error_lastname;

	@FindBy(how=How.XPATH, using=".//*[@class='pbSubsection']/table/tbody/tr[2]/td/div/div[2]")
	public
	WebElement error_firstname;

	@FindBy(how=How.XPATH, using=".//*[@class='pbSubsection']/table/tbody/tr[4]/td/div/div[2]")
	public
	WebElement error_socialsecuritynumber;

	@FindBy(how=How.XPATH, using=".//*[@class='pbSubsection']/table/tbody/tr[5]/td/div/div[2]")
	public
	WebElement error_dob;

	@FindBy(how=How.XPATH, using=".//*[@class='pbSubsection']/table/tbody/tr[6]/td/div/div[2]")
	public
	WebElement error_homeaddress;

	@FindBy(how=How.XPATH, using=".//*[@class='pbSubsection']/table/tbody/tr[7]/td/div/div[2]")
	public
	WebElement error_city;

	@FindBy(how=How.XPATH, using=".//*[@class='pbSubsection']/table/tbody/tr[8]/td/div/div[2]")
	public
	WebElement error_state;


	@FindBy(how=How.XPATH, using=".//*[@class='pbSubsection']/table/tbody/tr[9]/td/div/div[2]")
	public
	WebElement error_zipcode;


	@FindBy(how=How.XPATH, using=".//*[@class='pbSubsection']/table/tbody/tr[10]/td/div/div[2]")
	public
	WebElement error_telephone;
	@FindBy(how=How.XPATH, using=".//*[@class='pbSubsection']/table/tbody/tr[11]/td/div/div[2]")
	public
	WebElement error_gender;


	/**************************Employee Error Message*********************************/
	@FindBy(how=How.XPATH, using=".//div[@class='bodyDiv brdPalette brandPrimaryBrd']/table/tbody/tr/td/form/div[2]/div[@class='editPage']/div/div/div[2]/div[@class='pbSubsection']/table/tbody/tr/th/label[contains(text(),'EMPLOYER')]/following::strong[1]")
	public
	WebElement error_employername;

	@FindBy(how=How.XPATH, using=".//div[@class='bodyDiv brdPalette brandPrimaryBrd']/table/tbody/tr/td/form/div[2]/div[@class='editPage']/div/div/div[2]/div[@class='pbSubsection']/table/tbody/tr/th/label[contains(text(),'EMPLOYER')]/following::strong[2]")
	public
	WebElement error_feinnumber;

	@FindBy(how=How.XPATH, using=".//div[@class='bodyDiv brdPalette brandPrimaryBrd']/table/tbody/tr/td/form/div[2]/div[@class='editPage']/div/div/div[2]/div[@class='pbSubsection']/table/tbody/tr/th/label[contains(text(),'EMPLOYER')]/following::strong[3]")
	public
	WebElement error_officeaddress;

	@FindBy(how=How.XPATH, using=".//div[@class='bodyDiv brdPalette brandPrimaryBrd']/table/tbody/tr/td/form/div[2]/div[@class='editPage']/div/div/div[2]/div[@class='pbSubsection']/table/tbody/tr/th/label[contains(text(),'EMPLOYER')]/following::strong[4]")
	public
	WebElement error_employercity;

	@FindBy(how=How.XPATH, using=".//div[@class='bodyDiv brdPalette brandPrimaryBrd']/table/tbody/tr/td/form/div[2]/div[@class='editPage']/div/div/div[2]/div[@class='pbSubsection']/table/tbody/tr/th/label[contains(text(),'EMPLOYER')]/following::strong[5]")
	public
	WebElement error_employerstate;

	@FindBy(how=How.XPATH, using=".//div[@class='bodyDiv brdPalette brandPrimaryBrd']/table/tbody/tr/td/form/div[2]/div[@class='editPage']/div/div/div[2]/div[@class='pbSubsection']/table/tbody/tr/th/label[contains(text(),'EMPLOYER')]/following::strong[6]")
	public
	WebElement error_employerzipcode;

	@FindBy(how=How.XPATH, using=".//div[@class='bodyDiv brdPalette brandPrimaryBrd']/table/tbody/tr/td/form/div[2]/div[@class='editPage']/div/div/div[2]/div[@class='pbSubsection']/table/tbody/tr/th/label[contains(text(),'EMPLOYER')]/following::strong[7]")
	public
	WebElement error_employertelephone;


	/******************************Accident Details*************************************/

	@FindBy(how=How.XPATH, using=".//div[@class='bodyDiv brdPalette brandPrimaryBrd']/table/tbody/tr/td/form/div[2]/div[@class='editPage']/div/div/div[2]/div[@class='pbSubsection']/table/tbody/tr/th/label[contains(text(),'EMPLOYER')]/following::strong[8]")
	public
	WebElement error_dateofinjury;

	@FindBy(how=How.XPATH, using=".//div[@class='bodyDiv brdPalette brandPrimaryBrd']/table/tbody/tr/td/form/div[2]/div[@class='editPage']/div/div/div[2]/div[@class='pbSubsection']/table/tbody/tr/th/label[contains(text(),'EMPLOYER')]/following::strong[9]")
	public
	WebElement 	error_Notified;

	@FindBy(how=How.XPATH, using=".//div[@class='bodyDiv brdPalette brandPrimaryBrd']/table/tbody/tr/td/form/div[2]/div[@class='editPage']/div/div/div[2]/div[@class='pbSubsection']/table/tbody/tr/th/label[contains(text(),'EMPLOYER')]/following::strong[10]")
	public
	WebElement 	error_afterinjury;

	@FindBy(how=How.XPATH, using=".//div[@class='bodyDiv brdPalette brandPrimaryBrd']/table/tbody/tr/td/form/div[2]/div[@class='editPage']/div/div/div[2]/div[@class='pbSubsection']/table/tbody/tr/th/label[contains(text(),'EMPLOYER')]/following::strong[11]")
	public
	WebElement 	error_employeeoccupation;


	@FindBy(how=How.XPATH, using=".//div[@class='bodyDiv brdPalette brandPrimaryBrd']/table/tbody/tr/td/form/div[2]/div[@class='editPage']/div/div/div[2]/div[@class='pbSubsection']/table/tbody/tr/th/label[contains(text(),'EMPLOYER')]/following::strong[12]")
	public
	WebElement 	error_employeepremesis;

	@FindBy(how=How.XPATH, using=".//div[@class='bodyDiv brdPalette brandPrimaryBrd']/table/tbody/tr/td/form/div[2]/div[@class='editPage']/div/div/div[2]/div[@class='pbSubsection']/table/tbody/tr/th/label[contains(text(),'EMPLOYER')]/following::strong[13]")
	public
	WebElement 	error_injuryorillness;

	@FindBy(how=How.XPATH, using=".//div[@class='bodyDiv brdPalette brandPrimaryBrd']/table/tbody/tr/td/form/div[2]/div[@class='editPage']/div/div/div[2]/div[@class='pbSubsection']/table/tbody/tr/th/label[contains(text(),'EMPLOYER')]/following::strong[14]")
	public
	WebElement 	error_bodyinjured;

	@FindBy(how=How.XPATH, using=".//div[@class='bodyDiv brdPalette brandPrimaryBrd']/table/tbody/tr/td/form/div[2]/div[@class='editPage']/div/div/div[2]/div[@class='pbSubsection']/table/tbody/tr/th/label[contains(text(),'EMPLOYER')]/following::strong[15]")
	public
	WebElement 	error_partofbodyinjured;
	@FindBy(how=How.XPATH, using=".//div[@class='bodyDiv brdPalette brandPrimaryBrd']/table/tbody/tr/td/form/div[2]/div[@class='editPage']/div/div/div[2]/div[@class='pbSubsection']/table/tbody/tr/th/label[contains(text(),'EMPLOYER')]/following::strong[16]")
	public
	WebElement 	error_fatal;

	@FindBy(how=How.XPATH, using=".//div[@class='bodyDiv brdPalette brandPrimaryBrd']/table/tbody/tr/td/form/div[2]/div[@class='editPage']/div/div/div[2]/div[@class='pbSubsection']/table/tbody/tr/th/label[contains(text(),'EMPLOYER')]/following::strong[17]")
	public
	WebElement 	error_employeeemergency;

	@FindBy(how=How.XPATH, using=".//div[@class='bodyDiv brdPalette brandPrimaryBrd']/table/tbody/tr/td/form/div[2]/div[@class='editPage']/div/div/div[2]/div[@class='pbSubsection']/table/tbody/tr/th/label[contains(text(),'EMPLOYER')]/following::strong[18]")
	public
	WebElement 	error_treatedovernight;

	@FindBy(how=How.XPATH, using=".//div[@class='bodyDiv brdPalette brandPrimaryBrd']/table/tbody/tr/td/form/div[2]/div[@class='editPage']/div/div/div[2]/div[@class='pbSubsection']/table/tbody/tr/th/label[contains(text(),'EMPLOYER')]/following::strong[19]")
	public
	WebElement 	error_claimdoubted;

	/**********************************Cause of incident**********************************/

	@FindBy(how=How.XPATH, using=".//div[@class='bodyDiv brdPalette brandPrimaryBrd']/table/tbody/tr/td/form/div[2]/div[@class='editPage']/div/div/div[2]/div[@class='pbSubsection']/table/tbody/tr/th/label[contains(text(),'EMPLOYER')]/following::strong[20]")
	public
	WebElement 	error_whathappend;
	@FindBy(how=How.XPATH, using=".//div[@class='bodyDiv brdPalette brandPrimaryBrd']/table/tbody/tr/td/form/div[2]/div[@class='editPage']/div/div/div[2]/div[@class='pbSubsection']/table/tbody/tr/th/label[contains(text(),'EMPLOYER')]/following::strong[21]")
	public
	WebElement 	error_harmedemployee;
	@FindBy(how=How.XPATH, using=".//div[@class='bodyDiv brdPalette brandPrimaryBrd']/table/tbody/tr/td/form/div[2]/div[@class='editPage']/div/div/div[2]/div[@class='pbSubsection']/table/tbody/tr/th/label[contains(text(),'EMPLOYER')]/following::strong[22]")
	public
	WebElement 	error_employeebeforeincidentoccured;
	@FindBy(how=How.XPATH, using=".//div[@class='bodyDiv brdPalette brandPrimaryBrd']/table/tbody/tr/td/form/div[2]/div[@class='editPage']/div/div/div[2]/div[@class='pbSubsection']/table/tbody/tr/th/label[contains(text(),'EMPLOYER')]/following::strong[23]")
	public
	WebElement 	error_workerinemployee;
	@FindBy(how=How.XPATH, using=".//div[@class='bodyDiv brdPalette brandPrimaryBrd']/table/tbody/tr/td/form/div[2]/div[@class='editPage']/div/div/div[2]/div[@class='pbSubsection']/table/tbody/tr/th/label[contains(text(),'EMPLOYER')]/following::strong[24]")
	public
	WebElement 	error_datehire;
	@FindBy(how=How.XPATH, using=".//div[@class='bodyDiv brdPalette brandPrimaryBrd']/table/tbody/tr/td/form/div[2]/div[@class='editPage']/div/div/div[2]/div[@class='pbSubsection']/table/tbody/tr/th/label[contains(text(),'EMPLOYER')]/following::strong[25]")
	public
	WebElement 	error_grossearings;
	@FindBy(how=How.XPATH, using=".//div[@class='bodyDiv brdPalette brandPrimaryBrd']/table/tbody/tr/td/form/div[2]/div[@class='editPage']/div/div/div[2]/div[@class='pbSubsection']/table/tbody/tr/th/label[contains(text(),'EMPLOYER')]/following::strong[26]")
	public
	WebElement 	error_submittermail;


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
		String state = state_form.getText();
		String zipcode = zipcode_form.getText();
		String telephone = telephone_form.getText();
		String gender = gender_form.getText();
		String maritalstatus = maritalstatus_form.getText();
		Thread.sleep(10000);

		/***************Highlighting Last Name****************************/

		SeleniumUtils.highLightelements(lastname_form, driver);

		/***************Highlighting First Name****************************/

		SeleniumUtils.highLightelements(firstname_form, driver);

		/***************Highlighting Social security number****************************/

		SeleniumUtils.highLightelements(socialsecurity_form, driver);


		/***************Highlighting Date of birth****************************/

		SeleniumUtils.highLightelements(datofbirth_form, driver);


		/***********************Highlighting Home Address************************************/

		SeleniumUtils.highLightelements(homeaddress_form, driver);

		/************************Highlighting City*****************/

		SeleniumUtils.highLightelements(city_form, driver);

		/*******************Highlighting State*********************/

		SeleniumUtils.highLightelements(state_form, driver);

		/*******************Highlighting Zipcode*********************/

		SeleniumUtils.highLightelements(zipcode_form, driver);


		/******************* Highlighting telephone*********************/

		SeleniumUtils.highLightelements(telephone_form, driver);

		/*******************Highlighting gender*********************/

		SeleniumUtils.highLightelements(gender_form, driver);

		/*******************Highlighting marital Status*********************/

		SeleniumUtils.highLightelements(maritalstatus_form, driver);

		/**************************Employer Details*******************************/
		String Employername = employername_form.getText();
		String fiennumber = fiennumber_form.getText();
		String officeaddress = officeaddress_form.getText();
		String emplyercity = employercity_form.getText();
		String employerstate = employerstate_form.getText();
		String employerzipcode = employerzipcode_form.getText();
		String employertelephone = employertelephone_form.getText();

		/******************Highlighting Employer name***************************/

		SeleniumUtils.highLightelements(employername_form, driver);

		/********************Highlighting FIEN Number***************************/

		SeleniumUtils.highLightelements(fiennumber_form, driver);

		/********************Highlighting Office address***************************/

		SeleniumUtils.highLightelements(officeaddress_form, driver);

		/********************Highlighting City***************************/

		SeleniumUtils.highLightelements(employercity_form, driver);

		/********************Highlighting State***************************/

		SeleniumUtils.highLightelements(employerstate_form, driver);

		/*******************Highlighting Zipcode***************************/

		SeleniumUtils.highLightelements(employerzipcode_form, driver);


		/********************Highlighting Telephone***************************/

		SeleniumUtils.highLightelements(employertelephone_form, driver);

		/***********************Accident Information**********************/
		String employeejobtitle = jobtitle_form.getText();
		String employeepremises = premises_form.getText();
		String injury = injury_form.getText();
		String partofbodyinjured = partofbody_form.getText();
		String fatal = fatal_form.getText();
		String treatedinemergencyroom = emptreatedinemgroom_form.getText();
		String hospitalizedovernight = hospitalizedovernight_form.getText();
		String claimdoubted = claimdoubted_form.getText();

		/********************Highlighting Employee job title***************************/

		SeleniumUtils.highLightelements(jobtitle_form, driver);

		/********************Highlighting Employee premises***************************/

		SeleniumUtils.highLightelements(premises_form, driver);

		/********************Highlighting was illnessororinjury***************************/

		SeleniumUtils.highLightelements(injury_form, driver);

		/********************Highlighting partofbodyinjured***************************/

		SeleniumUtils.highLightelements(partofbody_form, driver);

		/********************Highlighting fatal***************************/

		SeleniumUtils.highLightelements(fatal_form, driver);

		/********************Highlighting employeeemergency***************************/

		SeleniumUtils.highLightelements(emptreatedinemgroom_form, driver);

		/********************Highlighting treatedovernight***************************/

		SeleniumUtils.highLightelements(hospitalizedovernight_form, driver);

		/********************Highlighting employee claim doubted***************************/

		SeleniumUtils.highLightelements(claimdoubted_form, driver);

		/*********************Cause of accident************************/
		String whathappend = whathappened_form.getText();
		System.out.println("whathappend"+whathappend);
		String harmedemployee = harmedemployee_form.getText();
		System.out.println("harmedemployee"+harmedemployee);
		String employeebeforeaccident = employeebeforeaccident_form.getText();
		System.out.println("employeebeforeaccident"+employeebeforeaccident);
		String employeewheninjured = employeewheninjured_form.getText();
		System.out.println("employeewheninjured"+employeewheninjured);

		/********************Highlighting whathappened***************************/

		SeleniumUtils.highLightelements(whathappened_form, driver);


		/********************harmedemployee***************************/

		SeleniumUtils.highLightelements(harmedemployee_form, driver);

		/********************employeewheninjured***************************/

		SeleniumUtils.highLightelements(employeebeforeaccident_form, driver);

		/********************employeewheninjured***************************/

		SeleniumUtils.highLightelements(employeewheninjured_form, driver);


	}

	public void formvalidation() {

		/*******************************Employee Details*******************************/
		lastname1.sendKeys("");
		Log.info("Entering lastname as null");
		firstname.sendKeys("");
		Log.info("Entering first as null");
		socialsecuritynumber.sendKeys("");
		Log.info("Entering socialsecuritynumber as null");
		dob.sendKeys("");
		Log.info("Entering dob as null");
		homeaddress.sendKeys("");
		Log.info("Entering homeaddress as null");
		city.sendKeys("");
		Log.info("Entering city as null");
		state.sendKeys("");
		Log.info("Entering state as null");
		zipcode.sendKeys("");
		Log.info("Entering zipcode as null");
		telephone.sendKeys("");
		Log.info("Entering telephone as null");
		gender.sendKeys("");
		Log.info("Entering gender as null");


		/******************************Employer Details********************************/
		employername.sendKeys("");
		Log.info("Entering emplyer name as null");
		feinnumber.sendKeys("");
		Log.info("Entering feinnumber as null");
		officeaddress.sendKeys("");
		Log.info("Entering officeaddress as null");
		employercity.sendKeys("");
		Log.info("Entering employercity as null");
		employerstate.sendKeys("");
		Log.info("Entering employerstate as null");
		employerzipcode.sendKeys("");
		Log.info("Entering employerzipcode as null");
		employertelephone.sendKeys("");
		Log.info("Entering employertelephone as null");

		/**********************************Accident Details******************************/
		DATEOFINJURY.sendKeys("");
		SeleniumUtils.FailedhighLightelements(DATEOFINJURY,driver);
		Notified.sendKeys("");
		SeleniumUtils.FailedhighLightelements(Notified,driver);
		afterinjury.sendKeys("");
		SeleniumUtils.FailedhighLightelements(afterinjury,driver);
		employeeoccupation.sendKeys("");
		SeleniumUtils.FailedhighLightelements(employeeoccupation,driver);
		employeepremises.sendKeys("");
		SeleniumUtils.FailedhighLightelements(employeepremises,driver);
		wastheinjuryorillness.sendKeys("");
		SeleniumUtils.FailedhighLightelements(wastheinjuryorillness,driver);
		bodyinjured.sendKeys("");
		Log.info("Entering bodyinjured as null");
		SeleniumUtils.FailedhighLightelements(bodyinjured,driver);
		fatal.sendKeys("");
		SeleniumUtils.FailedhighLightelements(fatal,driver);
		employeeemergency.sendKeys("");
		SeleniumUtils.FailedhighLightelements(employeeemergency,driver);
		treatedovernight.sendKeys("");
		SeleniumUtils.FailedhighLightelements(treatedovernight,driver);
		claimdoubted.sendKeys("");
		SeleniumUtils.FailedhighLightelements(claimdoubted,driver);
		Notified.sendKeys("");
		SeleniumUtils.FailedhighLightelements(Notified,driver);

		/*********************************Cause of accident*********************************/
		whathappend.sendKeys("");
		SeleniumUtils.FailedhighLightelements(whathappend,driver);
		harmedemployee.sendKeys("");
		SeleniumUtils.FailedhighLightelements(harmedemployee,driver);

		employeebeforeincidentoccured.sendKeys("");
		SeleniumUtils.FailedhighLightelements(employeebeforeincidentoccured,driver);
		workerinemployee.sendKeys("");
		SeleniumUtils.FailedhighLightelements(workerinemployee,driver);
		datehire.sendKeys("");
		SeleniumUtils.FailedhighLightelements(datehire,driver);
		grossearings.sendKeys("");
		SeleniumUtils.FailedhighLightelements(grossearings,driver);
		agree.sendKeys("");
		SeleniumUtils.FailedhighLightelements(agree,driver);
		submittermail.sendKeys("");
		SeleniumUtils.FailedhighLightelements(submittermail,driver);
		submit.click();
		SeleniumUtils.FailedhighLightelements(submit,driver);

		/*********************Employee Details************************************/

		SeleniumUtils.FailedhighLightelements(error_lastname,driver);
		SeleniumUtils.FailedhighLightelements(error_firstname,driver);
		SeleniumUtils.FailedhighLightelements(error_socialsecuritynumber,driver);
		SeleniumUtils.FailedhighLightelements(error_dob,driver);
		SeleniumUtils.FailedhighLightelements(error_homeaddress,driver);
		SeleniumUtils.FailedhighLightelements(error_city,driver);
		SeleniumUtils.FailedhighLightelements(error_state,driver);
		SeleniumUtils.FailedhighLightelements(error_zipcode,driver);
		SeleniumUtils.FailedhighLightelements(error_telephone,driver);
		SeleniumUtils.FailedhighLightelements(error_gender,driver);

		/******************************Employer Details********************************/

		SeleniumUtils.FailedhighLightelements(error_employername,driver);
		SeleniumUtils.FailedhighLightelements(error_feinnumber,driver);
		SeleniumUtils.FailedhighLightelements(error_officeaddress,driver);
		SeleniumUtils.FailedhighLightelements(error_employercity,driver);
		SeleniumUtils.FailedhighLightelements(error_employerstate,driver);
		SeleniumUtils.FailedhighLightelements(error_employerzipcode,driver);
		SeleniumUtils.FailedhighLightelements(error_employertelephone,driver);

		/**********************************Accident Details******************************/

		SeleniumUtils.FailedhighLightelements(error_dateofinjury,driver);
		SeleniumUtils.FailedhighLightelements(error_Notified,driver);
		SeleniumUtils.FailedhighLightelements(error_afterinjury,driver);
		SeleniumUtils.FailedhighLightelements(error_employeeoccupation,driver);
		SeleniumUtils.FailedhighLightelements(error_employeepremesis,driver);
		SeleniumUtils.FailedhighLightelements(error_injuryorillness,driver);
		SeleniumUtils.FailedhighLightelements(error_bodyinjured,driver);
		SeleniumUtils.FailedhighLightelements(error_partofbodyinjured,driver);
		SeleniumUtils.FailedhighLightelements(error_fatal,driver);
		SeleniumUtils.FailedhighLightelements(error_employeeemergency,driver);
		SeleniumUtils.FailedhighLightelements(error_treatedovernight,driver);
		SeleniumUtils.FailedhighLightelements(error_claimdoubted,driver);


		/*********************************Cause of accident*********************************/
		SeleniumUtils.FailedhighLightelements(error_whathappend,driver);
		SeleniumUtils.FailedhighLightelements(error_harmedemployee,driver);
		SeleniumUtils.FailedhighLightelements(error_employeebeforeincidentoccured,driver);
		SeleniumUtils.FailedhighLightelements(error_workerinemployee,driver);
		SeleniumUtils.FailedhighLightelements(error_datehire,driver);
		SeleniumUtils.FailedhighLightelements(error_grossearings,driver);
		SeleniumUtils.FailedhighLightelements(agree,driver);
		SeleniumUtils.FailedhighLightelements(error_submittermail,driver);


	}
}
