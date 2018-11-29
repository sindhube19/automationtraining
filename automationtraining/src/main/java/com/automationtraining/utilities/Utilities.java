
package com.automationtraining.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.automationtraining.browserfactory.BrowserFactory;




public class Utilities extends BrowserFactory {
	@FindBy(how=How.ID, using="username")
	WebElement username;
	@FindBy(how=How.ID, using="password")
	WebElement password;
	@FindBy(how=How.XPATH, using="//*[@id=\"Login\"]")
	WebElement login;
	
public static void login(WebDriver driver) throws InvalidFormatException, IOException {
	driver.get("http://login.salesforce.com");
	File fs = new File("C:\\Users\\MSTEMP194\\Desktop\\automation training\\salesforcelogin.xlsx");
    FileInputStream in = new FileInputStream(fs);
	XSSFWorkbook wb = new XSSFWorkbook(in);
	XSSFSheet xworksheet = wb.getSheet("Sheet1");
	String username = xworksheet.getRow(1).getCell(0).getStringCellValue();
    String password = xworksheet.getRow(1).getCell(1).getStringCellValue();
    Utilities sign = PageFactory.initElements(driver,  Utilities.class);
	sign.username.sendKeys(username);
	sign.password.sendKeys(password);
	sign.login.click();
}
	}
