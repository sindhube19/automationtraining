
package com.automationtraining.browserfactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.automationtraining.constant.ConstantFile;
/**
 * @author Sindhuja Ethiraj
 *
 */
public class BrowserFactory {
	public static WebDriver driver;


public static WebDriver getNewdriver() {

System.setProperty("webdriver.chrome.driver", ConstantFile.driverchrome);
return driver = new ChromeDriver();
}

public static WebDriver closeDriver() {
	driver.close();
	return null;
	
}
}
