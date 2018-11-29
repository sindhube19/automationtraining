/**
 * 
 *//*
package com.automationtraining.utilities;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.support.PageFactory;

import com.automationtraining.basetest.BaseTest;

*//**
 * @author Sindhuja Ethiraj
 *
 * 29-Nov-2018
 *//*
public class ExcelUtilities extends BaseTest{
	File fs = new File("C:\\Users\\MSTEMP194\\Desktop\\automation training\\salesforcelogin.xlsx");
    FileInputStream in = new FileInputStream(fs);
	XSSFWorkbook wb = new XSSFWorkbook(in);
	XSSFSheet xworksheet = wb.getSheet("Sheet1");
	String username = xworksheet.getRow(1).getCell(0).getStringCellValue();
    String password = xworksheet.getRow(1).getCell(1).getStringCellValue();
    Utilities sign = PageFactory.initElements(driver,  Utilities.class);

}
*/