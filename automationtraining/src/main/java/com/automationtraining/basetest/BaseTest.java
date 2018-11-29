package com.automationtraining.basetest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
/**
 * @author Sindhuja Ethiraj
 *
 */
public class BaseTest {
	public static WebDriver driver;
	
	@BeforeMethod
	public void browser()
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/MSTEMP194/Desktop/Automation/chromedriver.exe");
		driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://qadevpro2-azicawc-webforms.cs32.force.com/forms/Webform101_VF");

}
	/*@AfterMethod
	public void browserclose()
	{
		driver.close();
	}*/
}
