package com.automationtraining.pageobject;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.automationtraining.basetest.Basetest;
import com.automationtraining.browserfactory.Browserfactory;

import com.automationtraining.utilities.SeleniumUtils;
import com.automationtraining.utilities.Utilities;

/**
 * @author Sindhuja Ethiraj
 *
 */
public class Form101Page extends Basetest {
	
/******************************Employee*******************************************/
	
		@FindBy(how=How.ID, using="j_id0:j_id5:j_id9:j_id14:j_id15:last")
		WebElement lastname; 
		@FindBy(how=How.ID, using="j_id0:j_id5:j_id9:j_id14:j_id18:first")
		WebElement firstname;
		@FindBy(how=How.ID, using="j_id0:j_id5:j_id9:j_id14:j_id23:social")
		static
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
		static
		WebElement datehire;
        @FindBy(how=How.ID, using="j_id0:j_id5:j_id9:j_id181:j_id200:datehire")
		WebElement grossearings;
        @FindBy(how=How.ID, using="j_id0:j_id5:j_id9:j_id227:j_id228:subemail")
		WebElement submittermail;
        @FindBy(how=How.XPATH, using="//*[@id=\"j_id0:j_id5:j_id9:j_id11:bottom\"]/input")
		WebElement submit;
      
     
		public static void login(WebDriver driver) throws InvalidFormatException, IOException, InterruptedException {
			File fs = new File("C:\\Users\\MSTEMP194\\Desktop\\Automation\\automationinputs.xlsx");
		    FileInputStream in = new FileInputStream(fs);
			XSSFWorkbook wb = new XSSFWorkbook(in);
			XSSFSheet xworksheet = wb.getSheet("Sheet1");
			  Form101Page sign = PageFactory.initElements(driver,  Form101Page.class);  
			
		   /*** Entering employee lastname ***/ 
			String lastname = xworksheet.getRow(1).getCell(0).getStringCellValue();
			
			/*** Entering employee firstname ***/ 
	        String firstname = xworksheet.getRow(1).getCell(1).getStringCellValue();
	       /* 
	        double socialsecuritynumber = xworksheet.getRow(1).getCell(2).getNumericCellValue();
	        String s1 = String.valueOf(socialsecuritynumber);
	        System.out.println(s1);*/
	        /*** Entering employee social security number ***/ 
	        socialsecuritynumber.setCellType(CellType.NUMERIC);
	        
	        /*** Entering employee date of birth ***/ 
	        String dob = xworksheet.getRow(1).getCell(3).getStringCellValue();
	        
	        /*** Entering employee Homeaddress ***/ 
	        String homehomeaddress = xworksheet.getRow(1).getCell(4).getStringCellValue();
	        
	        /*** Entering employee city ***/ 
	        String employeecity = xworksheet.getRow(1).getCell(5).getStringCellValue();
	        
	        /*** Entering employee state ***/ 
	        String employeestate = xworksheet.getRow(1).getCell(6).getStringCellValue();
	        
	        /*** Entering employee zipcode ***/ 
	        String employeezipcode = xworksheet.getRow(1).getCell(7).getStringCellValue();
	        String zip = String.valueOf(employeezipcode);
	        //System.out.println(zip);
	        
	        /*** Entering employee telephone ***/ 
		    String employeetelephone = xworksheet.getRow(1).getCell(8).getStringCellValue();
		    String tlphne = String.valueOf(employeetelephone);
	        
		    /*** Entering employee gender ***/ 
		    String employeegender = xworksheet.getRow(1).getCell(9).getStringCellValue();
		    
		    /*** Entering employee maritalstatus ***/ 
		    String employemaritalstatus = xworksheet.getRow(1).getCell(10).getStringCellValue();
	    	sign.lastname.sendKeys(lastname);
			sign.firstname.sendKeys(firstname);
			sign.dob.sendKeys(dob);
			sign.homeaddress.sendKeys(homehomeaddress);
			sign.city.sendKeys(employeecity);
			sign.state.sendKeys(employeestate);
			sign.zipcode.sendKeys(employeezipcode);
			sign.telephone.sendKeys(employeetelephone);
		 /*  
		   
		  
		    
		   
		   
		    
		    
*//****************************************Employer Details*******************************************************//*		
            /*** Entering employer name ***/   
		    String employername = xworksheet.getRow(1).getCell(11).getStringCellValue();
		    
		    /*** Entering employer fien number ***/ 
		    String employerfiennumber = xworksheet.getRow(1).getCell(12).getStringCellValue();
		    
		    /*** Entering employer office address ***/ 
		    String employerofficeaddr = xworksheet.getRow(1).getCell(13).getStringCellValue();
		    
		    /*** Entering employer city ***/ 
		    String employercity = xworksheet.getRow(1).getCell(14).getStringCellValue();
		    
		    /*** Entering employer state ***/ 
		    String employerstate = xworksheet.getRow(1).getCell(15).getStringCellValue();
		    
		    /*** Entering employer zipcode ***/ 
		    String employerzipcode = xworksheet.getRow(1).getCell(16).getStringCellValue();
		    
		    /*** Entering employer telephone ***/ 
		    String employertelephone = xworksheet.getRow(1).getCell(17).getStringCellValue();
		 
		    
//***************************************Accident Details*********************************************************//*
		    /*** Entering employer date of injury ***/ 
		    String dateofinjury = xworksheet.getRow(1).getCell(18).getStringCellValue();
		    
		    /*** Entering employer notified date ***/ 
		    String notified = xworksheet.getRow(1).getCell(19).getStringCellValue();
		    String afterinjury = xworksheet.getRow(1).getCell(20).getStringCellValue();
		    String occupation = xworksheet.getRow(1).getCell(21).getStringCellValue();
		    String wastheinjuryorillness = xworksheet.getRow(1).getCell(22).getStringCellValue();
		    
//**************************************Cause of injury*********************************************************//*
		    String wathappend = xworksheet.getRow(1).getCell(23).getStringCellValue();
		    String harmedemployee = xworksheet.getRow(1).getCell(24).getStringCellValue();
		    String employeebeforeincidentoccured = xworksheet.getRow(1).getCell(25).getStringCellValue();
		    String dob1 = xworksheet.getRow(1).getCell(26).getStringCellValue();
		    String grossearings = xworksheet.getRow(1).getCell(27).getStringCellValue();
		    String submittermail = xworksheet.getRow(1).getCell(28).getStringCellValue();
//***************************Employee Details****************************************//*		    
		    Form101Page sign = PageFactory.initElements(driver,  Form101Page.class);  
			sign.lastname.sendKeys(lastname);
			sign.firstname.sendKeys(firstname);
			sign.socialsecuritynumber.sendKeys(socialsecuritynumber);
            sign.dob.sendKeys(dob);
			sign.dob.sendKeys(Keys.TAB);
			sign.homeaddress.sendKeys(homehomeaddress);
			sign.city.sendKeys(employeecity);
			sign.state.sendKeys(employeestate);
			sign.zipcode.sendKeys(employeezipcode);
			sign.telephone.sendKeys(employeetelephone);
			sign.keytab.sendKeys(Keys.TAB);
			Select gender = new Select(sign.gender);
			gender.selectByIndex(1);
			sign.gender.sendKeys(Keys.TAB);
            Select marital = new Select(sign.maritalstatus);
			marital.selectByIndex(1);
			sign.keytab.sendKeys(Keys.TAB);
			
*//***********************************Employer Details*****************************************//*			
		
			sign.employername.sendKeys(employername);
			sign.feinnumber.sendKeys(employerfiennumber);
			sign.officeaddress.sendKeys(employerofficeaddr);
			sign.employercity.sendKeys(employercity);
			sign.employerstate.sendKeys(employerstate);
			sign.employerzipcode.sendKeys(employerzipcode);
			sign.employertelephone.sendKeys(employertelephone);
			
*//***********************************Accident Details******************************************//*
			
			sign.DATEOFINJURY.sendKeys(dateofinjury);
			sign.Notified.sendKeys("25082006");
			sign.Notified.sendKeys(Keys.TAB);
			sign.afterinjury.sendKeys(afterinjury);
			sign.afterinjury.sendKeys(Keys.TAB);
			sign.hasemployeereturnedhome.click();
			sign.employeeoccupation.sendKeys(occupation);
		    Select employeepremises = new Select(sign.employeepremises);
		    employeepremises.selectByIndex(2);
		    sign.wastheinjuryorillness.sendKeys(wastheinjuryorillness);
		    sign.bodyinjured.sendKeys("injury");
		    sign.bodyinjuredkeytab.sendKeys(Keys.TAB);
		   //part of injury table 
		    sign.lookuppartofbodyinjured.click();
		    SeleniumUtils.lookupwindowhandler();
		    
		    Select fatal = new Select(sign.fatal);
		    fatal.selectByIndex(1);
		    
		    Select employeeemergency = new Select(sign.employeeemergency);
		    employeeemergency.selectByIndex(2);
		    
		    Select treatedovernight = new Select(sign.treatedovernight);
		    treatedovernight.selectByIndex(2);
		    Select claimdoubted = new Select(sign.claimdoubted);
		    claimdoubted.selectByIndex(2);
		    
*//****************************** cause of accident ************************//*
		    
		    sign.whathappend.sendKeys(wathappend);
		    sign.harmedemployee.sendKeys(harmedemployee);
		   // sign.harmedemployeekeytab.sendKeys(Keys.TAB);
		    //nature of injury
		    sign.natureofinjury.click();
		SeleniumUtils.natureofinjury();
		Thread.sleep(1000);
		sign.causeofinjury.click();
		SeleniumUtils.causeofinjury();
		 sign.employeebeforeincidentoccured.sendKeys(employeebeforeincidentoccured);
		    Select workerinemployee = new Select(sign.workerinemployee);
		    workerinemployee.selectByIndex(2);
		    sign.workerinemployee.sendKeys(Keys.TAB);
		    sign.datehire.sendKeys(dob1);
		    sign.grossearings.sendKeys(grossearings);
		    sign.submittermail.sendKeys(submittermail);
		    sign.submit.click();
		    */
		}



		
		
}
