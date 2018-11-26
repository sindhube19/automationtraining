package com.automationtraining.pageobject;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.automationtraining.browserfactory.Browserfactory;
import com.automationtraining.utilities.Utilities;

public class Test {
	
		@FindBy(how=How.XPATH, using="//*[@id=\\\"j_id0:j_id5:j_id9:j_id14:j_id15:last\\\"]")
		WebElement lastname;
		@FindBy(how=How.XPATH, using="//*[@id=\\\"j_id0:j_id5:j_id9:j_id14:j_id18:first\\\"]")
		WebElement firstname;
		@FindBy(how=How.XPATH, using="//*[@id=\\\"j_id0:j_id5:j_id9:j_id14:j_id23:social\\\"]")
		WebElement socialsecuritynumber;
		@FindBy(how=How.XPATH, using="//*[@id=\\\"j_id0:j_id5:j_id9:j_id14:j_id26:birth\\\"]")
		static
		WebElement dob;
		@FindBy(how=How.XPATH, using="//*[@id=\\\"j_id0:j_id5:j_id9:j_id14:j_id29:home\\\"]")
		WebElement homeaddress;
		@FindBy(how=How.XPATH, using="//*[@id=\\\"j_id0:j_id5:j_id9:j_id14:j_id32:CITY\\\"]")
		WebElement city;
		@FindBy(how=How.ID, using="j_id0:j_id5:j_id9:j_id14:j_id35:STATE")
		WebElement state;
		@FindBy(how=How.ID, using="j_id0:j_id5:j_id9:j_id14:j_id38:ZIPCODE")
		WebElement zipcode;
		@FindBy(how=How.ID, using="j_id0:j_id5:j_id9:j_id14:j_id41:TELEPHONE")
		WebElement telephone;
		@FindBy(how=How.ID, using="j_id0:j_id5:j_id9:j_id14:j_id44:SEX")
		WebElement gender;
		@FindBy(how=How.ID, using="//*[@id=\\\"j_id0:j_id5:j_id9:j_id14:j_id44:SEX\\\"]")
		WebElement keytab;
		@FindBy(how=How.XPATH, using="//*[@id=\\\"j_id0:j_id5:j_id9:j_id14:j_id46:MARITALSTATUS\\\"]")
		WebElement maritalstatus;
		@FindBy(how=How.XPATH, using="j_id0:j_id5:j_id9:j_id48:j_id49:EMPLOYERNAME")
		WebElement employername;
		@FindBy(how=How.XPATH, using="j_id0:j_id5:j_id9:j_id48:j_id52:FEINNUMBER")
		WebElement feinnumber;
		@FindBy(how=How.ID, using="j_id0:j_id5:j_id9:j_id48:j_id57:officeadd")
		WebElement officeaddress;
		@FindBy(how=How.ID, using="j_id0:j_id5:j_id9:j_id48:j_id60:officecity")
		WebElement employercity;
		@FindBy(how=How.XPATH, using="//*[@id=\\\"j_id0:j_id5:j_id9:j_id48:j_id63:officstate\\\"]")
		WebElement employerstate;
		@FindBy(how=How.XPATH, using="//*[@id=\\\"j_id0:j_id5:j_id9:j_id48:j_id66:officzip\\\"]")
		WebElement employerzipcode;
		@FindBy(how=How.XPATH, using="//*[@id=\\\"j_id0:j_id5:j_id9:j_id48:j_id69:telephone\\\"]")
		WebElement employertelephone;
		@FindBy(how=How.XPATH, using="//*[@id=\\\"j_id0:j_id5:j_id9:j_id72:j_id73:doi\\\"]")
		WebElement DATEOFINJURY;
		@FindBy(how=How.XPATH, using="//*[@id=\\\"j_id0:j_id5:j_id9:j_id72:j_id76:empnotif\\\"]")
		WebElement Notified;
		@FindBy(how=How.XPATH, using="//*[@id=\\\"j_id0:j_id5:j_id9:j_id72:j_id81:lastday\\\"]")
		WebElement afterinjury;
		@FindBy(how=How.ID, using="j_id0:j_id5:j_id9:j_id72:j_id84:0")
		WebElement hasemployeereturnedhome;
		@FindBy(how=How.XPATH, using="//*[@id=\\\"j_id0:j_id5:j_id9:j_id72:j_id88:empcontri\\\"]")
		WebElement employeeoccupation;
		@FindBy(how=How.ID, using="j_id0:j_id5:j_id9:j_id72:j_id96:empconpre")
		WebElement employeepremises;
		@FindBy(how=How.ID, using="j_id0:j_id5:j_id9:j_id72:j_id109:injurill")
		WebElement wastheinjuryorillness;
		@FindBy(how=How.ID, using="j_id0:j_id5:j_id9:j_id72:j_id112:partofbody")
		WebElement bodyinjured;
		@FindBy(how=How.XPATH, using="//*[@id=\\\"j_id0:j_id5:j_id9:j_id72:j_id114:partofbodyinjury_lkwgt\\\"]/img")
		WebElement lookuppartofbodyinjured;
		@FindBy(how=How.ID, using="j_id0:j_id5:j_id9:j_id72:j_id121:fatal")
		WebElement fatal;
		@FindBy(how=How.ID, using="j_id0:j_id5:j_id9:j_id72:j_id126:empemergency")
		WebElement employeeemergency;
		@FindBy(how=How.ID, using="j_id0:j_id5:j_id9:j_id72:j_id139:overnight")
		WebElement treatedovernight;
		@FindBy(how=How.ID, using="j_id0:j_id5:j_id9:j_id72:j_id152")
		WebElement claimdoubted;
		
		
		
		public static void login(WebDriver driver) throws InvalidFormatException, IOException {
			/*driver.get("http://login.salesforce.com");
			File fs = new File("C:\\Users\\MSTEMP194\\Desktop\\automation training\\salesforcelogin.xlsx");
		    FileInputStream in = new FileInputStream(fs);
			XSSFWorkbook wb = new XSSFWorkbook(in);
			XSSFSheet xworksheet = wb.getSheet("Sheet1");
			String username = xworksheet.getRow(1).getCell(0).getStringCellValue();
		    String password = xworksheet.getRow(1).getCell(1).getStringCellValue();*/
		    Test sign = PageFactory.initElements(driver,  Test.class);
			sign.lastname.sendKeys("ethiraj");
			sign.firstname.sendKeys("sindhuja");
			sign.socialsecuritynumber.sendKeys("123456789");
		    sign.dob.sendKeys("01191994");
			sign.dob.sendKeys(Keys.TAB);
			sign.homeaddress.sendKeys("5 Birch Hill Avenue \\r\\n");
			sign.city.sendKeys("Santa Monica");
			sign.state.sendKeys("CA");
			sign.zipcode.sendKeys("90403");
			sign.telephone.sendKeys("9094874306");
			sign.keytab.sendKeys(Keys.TAB);
			sign.maritalstatus.selectByIndex(1);
			sign.employername.sendKeys("Automation");
			sign.feinnumber.sendKeys("98765432123");
			sign.officeaddress.sendKeys("24 Yukon Ave. Avon, IN 46123.");
			sign.employercity.sendKeys("Avon");
			sign.employerstate.sendKeys("IN");
			sign.employerzipcode.sendKeys("46123");
			sign.employertelephone.sendKeys("9876545678");
			sign.DATEOFINJURY.sendKeys("20042000");
			sign.Notified.sendKeys("25082006");
			sign.Notified.sendKeys(Keys.TAB);
			sign.afterinjury.sendKeys("25082006");
			sign.afterinjury.sendKeys(Keys.TAB);
			sign.afterinjury.sendKeys(Keys.TAB);
			sign.hasemployeereturnedhome.click();
			sign.employeeoccupation.sendKeys("46123");
		    sign.employeepremises.selectByVisibleText("Yes");
		    sign.wastheinjuryorillness.sendKeys("injury");
		    sign.bodyinjured.sendKeys("injury");
		    sign.bodyinjured.sendKeys(Keys.TAB);
		    sign.lookuppartofbodyinjured.click();
		    sign.fatal.selectByVisibleText("Yes");
		    sign.employeeemergency.selectByVisibleText("Yes");
            sign.selectByVisibleText("Yes");
            sign.treatedovernight("Yes");
            sign.claim.selectByVisibleText("Yes");
            
		    
		    
		}
		
}
