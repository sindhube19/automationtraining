package com.automationtraining.pageobject;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
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

import com.automationtraining.utilities.SeleniumUtils;
import com.automationtraining.utilities.Utilities;

/**
 * @author Sindhuja Ethiraj
 *
 */
public class Form101Page extends BaseTest {
	
/******************************Employee*******************************************/
	
		@FindBy(how=How.ID, using="j_id0:j_id5:j_id9:j_id14:j_id15:last")
		WebElement lastname; 
		@FindBy(how=How.ID, using="j_id0:j_id5:j_id9:j_id14:j_id18:first")
		WebElement firstname;
		@FindBy(how=How.ID, using="j_id0:j_id5:j_id9:j_id14:j_id23:social")
		
		WebElement socialsecuritynumber;
		@FindBy(how=How.ID, using="j_id0:j_id5:j_id9:j_id14:j_id26:birth")
	    WebElement dob;
		@FindBy(how=How.ID, using="j_id0:j_id5:j_id9:j_id14:j_id29:home")
		WebElement homeaddress;
		@FindBy(how=How.ID, using="j_id0:j_id5:j_id9:j_id14:j_id32:CITY")
		WebElement city;
		@FindBy(how=How.ID, using="j_id0:j_id5:j_id9:j_id14:j_id35:STATE")
		WebElement state;
		@FindBy(how=How.ID, using="j_id0:j_id5:j_id9:j_id14:j_id38:ZIPCODE")
		WebElement zipcode;
		@FindBy(how=How.ID, using="j_id0:j_id5:j_id9:j_id14:j_id41:TELEPHONE")
		WebElement telephone;
		@FindBy(how=How.ID, using="j_id0:j_id5:j_id9:j_id14:j_id44:SEX")
		WebElement gender;
		@FindBy(how=How.ID, using="j_id0:j_id5:j_id9:j_id14:j_id44:SEX")
		WebElement keytab;
		@FindBy(how=How.ID, using="j_id0:j_id5:j_id9:j_id14:j_id46:MARITALSTATUS")
		WebElement maritalstatus;
		@FindBy(how=How.ID, using="j_id0:j_id5:j_id9:j_id14:j_id46:MARITALSTATUS")
		WebElement maritalkeytab;
		
/*******************Employer Details***************************************************/
		
		@FindBy(how=How.ID, using="j_id0:j_id5:j_id9:j_id48:j_id49:EMPLOYERNAME")
		WebElement employername;
		@FindBy(how=How.ID, using="j_id0:j_id5:j_id9:j_id48:j_id52:FEINNUMBER")
		WebElement feinnumber;
		@FindBy(how=How.ID, using="j_id0:j_id5:j_id9:j_id48:j_id57:officeadd")
		WebElement officeaddress;
		@FindBy(how=How.ID, using="j_id0:j_id5:j_id9:j_id48:j_id60:officecity")
		WebElement employercity;
		@FindBy(how=How.ID, using="j_id0:j_id5:j_id9:j_id48:j_id63:officstate")
		WebElement employerstate;
		@FindBy(how=How.ID, using="j_id0:j_id5:j_id9:j_id48:j_id66:officzip")
		WebElement employerzipcode;
		@FindBy(how=How.ID, using="j_id0:j_id5:j_id9:j_id48:j_id69:telephone")
		WebElement employertelephone;
		
/********************Accident Details*************************************************/
		
		@FindBy(how=How.ID, using="j_id0:j_id5:j_id9:j_id72:j_id73:doi")
		WebElement DATEOFINJURY;
		@FindBy(how=How.ID, using="j_id0:j_id5:j_id9:j_id72:j_id76:empnotif")
		WebElement Notified;
		@FindBy(how=How.ID, using="j_id0:j_id5:j_id9:j_id72:j_id81:lastday")
		WebElement afterinjury;
		@FindBy(how=How.ID, using="j_id0:j_id5:j_id9:j_id72:j_id84:0")
		WebElement hasemployeereturnedhome;
		@FindBy(how=How.ID, using="j_id0:j_id5:j_id9:j_id72:j_id88:empcontri")
		WebElement employeeoccupation;
		@FindBy(how=How.ID, using="j_id0:j_id5:j_id9:j_id72:j_id96:empconpre")
		WebElement employeepremises;
		@FindBy(how=How.ID, using="j_id0:j_id5:j_id9:j_id72:j_id109:injurill")
		WebElement wastheinjuryorillness;
		@FindBy(how=How.ID, using="j_id0:j_id5:j_id9:j_id72:j_id112:partofbody")
		WebElement bodyinjured;
		@FindBy(how=How.ID, using="j_id0:j_id5:j_id9:j_id72:j_id112:partofbody")
		WebElement bodyinjuredkeytab;
		@FindBy(how=How.ID, using="j_id0:j_id5:j_id9:j_id72:j_id114:partofbodyinjury_lkwgt")
		WebElement lookuppartofbodyinjured;
		@FindBy(how=How.ID, using="j_id0:j_id5:j_id9:j_id72:j_id121:fatal")
		WebElement fatal;
		@FindBy(how=How.ID, using="j_id0:j_id5:j_id9:j_id72:j_id126:empemergency")
		WebElement employeeemergency;
		@FindBy(how=How.ID, using="j_id0:j_id5:j_id9:j_id72:j_id139:overnight")
		WebElement treatedovernight;
		@FindBy(how=How.ID, using="j_id0:j_id5:j_id9:j_id72:j_id152")
		WebElement claimdoubted;
		
/**********************Cause of accident*********************************/
		
		@FindBy(how=How.ID, using="j_id0:j_id5:j_id9:j_id155:j_id156:what")
		WebElement whathappend;
		@FindBy(how=How.ID, using="j_id0:j_id5:j_id9:j_id155:j_id159:whatsus")
		WebElement harmedemployee;
		@FindBy(how=How.ID, using="j_id0:j_id5:j_id9:j_id155:j_id159:whatsus")
		WebElement harmedemployeekeytab;
		@FindBy(how=How.ID, using="j_id0:j_id5:j_id9:j_id155:j_id162:nature_lkwgt")
		WebElement natureofinjury;
		@FindBy(how=How.ID, using="j_id0:j_id5:j_id9:j_id155:j_id167:cause_lkwgt")
		WebElement causeofinjury;
		
		@FindBy(how=How.ID, using="j_id0:j_id5:j_id9:j_id155:j_id172:empdoing")
		WebElement employeebeforeincidentoccured;
        @FindBy(how=How.XPATH, using="//*[@id=\"j_id0:j_id5:j_id9:j_id155:j_id177:workemp\"]")
		WebElement workerinemployee;
        @FindBy(how=How.ID, using="j_id0:j_id5:j_id9:j_id155:j_id179:datehire")
		
		WebElement datehire;
        @FindBy(how=How.ID, using="j_id0:j_id5:j_id9:j_id181:j_id200:datehire")
		WebElement grossearings;
        @FindBy(how=How.NAME, using="j_id0:j_id5:j_id9:j_id247")
		WebElement agree;

        @FindBy(how=How.ID, using="j_id0:j_id5:j_id9:j_id227:j_id228:subemail")
		WebElement submittermail;
        
        @FindBy(how=How.XPATH, using="//*[@id=\"j_id0:j_id5:j_id9:j_id11:bottom\"]/input")
		WebElement submit;
      
        @FindBy(how=How.XPATH, using="//*[@id=\"j_id0:j_id2:j_id6\"]/div/table/tbody/tr[2]/td")
        WebElement content;

        @FindBy(how=How.XPATH, using="//*[@id=\"j_id0:j_id2:j_id3\"]/div/table/tbody/tr/td/p")
        WebElement contentcolor;
        
       

        
		public static void login(WebDriver driver) throws InvalidFormatException, IOException, InterruptedException {
			//File fs = new File("C:\\Users\\MSTEMP194\\Desktop\\Automation\\automationinputs.xlsx");
			File fs = new File("C:\\Users\\MSTEMP194\\Desktop\\Automation\\automation.xlsx");
			
		    FileInputStream in = new FileInputStream(fs);
			XSSFWorkbook wb = new XSSFWorkbook(in);
			XSSFSheet xworksheet = wb.getSheet("Sheet1");
            String lastname = xworksheet.getRow(1).getCell(0).getStringCellValue();
			String firstname = xworksheet.getRow(1).getCell(1).getStringCellValue();
	        String homehomeaddress = xworksheet.getRow(1).getCell(2).getStringCellValue();
	        String employeecity = xworksheet.getRow(1).getCell(3).getStringCellValue();
	        String employeestate = xworksheet.getRow(1).getCell(4).getStringCellValue();
            String employeegender = xworksheet.getRow(1).getCell(5).getStringCellValue();
		    String employemaritalstatus = xworksheet.getRow(1).getCell(6).getStringCellValue();
		    String employername = xworksheet.getRow(1).getCell(7).getStringCellValue();
            String employerofficeaddress = xworksheet.getRow(1).getCell(8).getStringCellValue();
		    String employercity = xworksheet.getRow(1).getCell(9).getStringCellValue();
		    String employerstate = xworksheet.getRow(1).getCell(10).getStringCellValue();
		    String employeeoccupation = xworksheet.getRow(1).getCell(11).getStringCellValue();
		    String employeepremesis = xworksheet.getRow(1).getCell(12).getStringCellValue();
		    String injuryorillness = xworksheet.getRow(1).getCell(13).getStringCellValue();
		    String partofbody = xworksheet.getRow(1).getCell(14).getStringCellValue();
		    String fatal = xworksheet.getRow(1).getCell(15).getStringCellValue();
		    String treatedinemergencyroom = xworksheet.getRow(1).getCell(16).getStringCellValue();
		    String treatedovernight = xworksheet.getRow(1).getCell(17).getStringCellValue();
		    String claimdoubted = xworksheet.getRow(1).getCell(18).getStringCellValue();
		    String whathappend = xworksheet.getRow(1).getCell(19).getStringCellValue();
		    String harmedemployee = xworksheet.getRow(1).getCell(20).getStringCellValue();
		    String incidentoccured = xworksheet.getRow(1).getCell(21).getStringCellValue();
		    String employwheninjured = xworksheet.getRow(1).getCell(22).getStringCellValue();
			String socialsecuritynumber = xworksheet.getRow(1).getCell(23).getStringCellValue();
			String employeedob = xworksheet.getRow(1).getCell(24).toString();
			String employeezipcode = xworksheet.getRow(1).getCell(25).toString();
			String employeetelephone = xworksheet.getRow(1).getCell(26).getStringCellValue();
			String employerzipcode = xworksheet.getRow(1).getCell(27).toString();
			String employertelephone =  xworksheet.getRow(1).getCell(28).getStringCellValue();
			String grossearnings = xworksheet.getRow(1).getCell(29).toString();
			String fiennumber = xworksheet.getRow(1).getCell(30).toString();
			String dateofinjury = xworksheet.getRow(1).getCell(31).toString();
			String notified = xworksheet.getRow(1).getCell(32).toString();
			String afterinjury = xworksheet.getRow(1).getCell(33).toString();
			String datehire = xworksheet.getRow(1).getCell(34).toString();
			String submitteremail  = xworksheet.getRow(1).getCell(35).toString();
		    Form101Page sign = PageFactory.initElements(driver,  Form101Page.class);
		    /********Entering employee lastname*******************/
	    	sign.lastname.sendKeys(lastname);
	    	 /********Entering employee firstname*******************/
			sign.firstname.sendKeys(firstname);
			 /********Entering employee socialsecuritynumber*******************/
			sign.socialsecuritynumber.sendKeys(socialsecuritynumber);
			 /********Entering employee date of birth*******************/
			sign.dob.sendKeys(employeedob);
			sign.keytab.sendKeys(Keys.TAB);
			 /********Entering employee home address*******************/
			sign.homeaddress.sendKeys(homehomeaddress);
			 /********Entering employee city*******************/
			sign.city.sendKeys(employeecity);
			 /********Entering employee state*******************/
			sign.state.sendKeys(employeestate);
			 /********Entering employee zipcode*******************/
			sign.zipcode.sendKeys(employeezipcode);
			 /********Entering employee telephone*******************/
			sign.telephone.sendKeys(employeetelephone);
			 /********Entering employee gender*******************/
			sign.gender.sendKeys(employeegender);
			 /********Entering employee maritalstatus*******************/
			sign.maritalstatus.sendKeys(employemaritalstatus);
			
/*******************************Employer Details******************************/
			
			/****************Entering employer Name********************/
			sign.employername.sendKeys(employername);
			/****************Entering employer FIEN number***********/
			sign.feinnumber.sendKeys(fiennumber);
			/****************Entering employer office address***********/
			sign.officeaddress.sendKeys(employerofficeaddress);
			/****************Entering employer city***********/
			sign.employercity.sendKeys(employercity);
			/****************Entering employer state***********/
			sign.employerstate.sendKeys(employerstate);
			/****************Entering employer zipcode***********/
			sign.employerzipcode.sendKeys(employerzipcode);
			/****************Entering employer telephone***********/
			sign.employertelephone.sendKeys(employertelephone);
			
/********************************Accident Details**********************/
			/****************Entering employee date of injury***********/
			sign.DATEOFINJURY.sendKeys(dateofinjury);
			/****************Entering employee injury notified date***********/
			sign.Notified.sendKeys(notified);
			/****************Entering employee after injury date***********/
			sign.afterinjury.sendKeys(afterinjury);
			/****************Entering employee occupation***********/
			sign.employeeoccupation.sendKeys(employeeoccupation);
			/****************Entering employee premises***********/
			sign.employeepremises.sendKeys(employeepremesis);
			/****************Entering illness or injury info of an employee***********/
			sign.wastheinjuryorillness.sendKeys(injuryorillness);
			/****************Entering employee part of body injured***********/
			sign.bodyinjured.sendKeys(partofbody);
			sign.keytab.sendKeys(Keys.TAB);
			/****************Selecting employee part of body injured table***********/
			sign.lookuppartofbodyinjured.click();
		    SeleniumUtils.lookupWindowhandler();
		    /****************Entering employee fatal***********/
			sign.fatal.sendKeys(fatal);
			/****************Entering employee treated in emergency room info***********/
            sign.employeeemergency.sendKeys(treatedinemergencyroom);
            /****************Entering employee has treated overnight***********/
			sign.treatedovernight.sendKeys(treatedovernight);
			/****************Entering employee claimdoubted***********/
			sign.claimdoubted.sendKeys(claimdoubted);
			
/******************************Causeofaccident************************/		
			
			/****************Entering wat happened to employee***********/	
			sign.whathappend.sendKeys(whathappend);
			/****************Entering is employee harmed***********/
			sign.harmedemployee.sendKeys(harmedemployee);
			/****************Entering wheather he/she is an employee before injury occured***********/
			sign.employeebeforeincidentoccured.sendKeys(incidentoccured);
			/****************Entering wheather he/she is an employee when injury occured***********/
			sign.workerinemployee.sendKeys(employwheninjured);
			/****************Entering nature of injury***********/
			   sign.natureofinjury.click();
				SeleniumUtils.natureofInjury();
				sign.keytab.sendKeys(Keys.TAB);
			/****************Entering employee cause of injury***********/
				sign.causeofinjury.click();
				SeleniumUtils.causeofInjury();
			/****************Entering employee hired date***********/
				sign.datehire.sendKeys(datehire);
				/****************Entering employee gross earnings***********/
				sign.grossearings.sendKeys(grossearnings);
				/****************Entering employee email**********/
				sign.submittermail.sendKeys(submitteremail);
				/****************Clicking agree**********/
				sign.agree.click();
				/****************Clicking submit button**********/
				 sign.submit.click();
			
				 JavascriptExecutor js = (JavascriptExecutor) driver;
			        //use executeScript() method and pass the arguments 
			        //Here i pass values based on css style. Yellow background color with solid red color border. 
			 js.executeScript("arguments[0].setAttribute('style', 'background: green; border: 2px solid red;');", sign.contentcolor);
			 js.executeScript("arguments[0].setAttribute('style', 'background: green; border: 2px solid red;');", sign.content);
				 				 
		}
}
			   
			
		 