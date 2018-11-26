package com.automationtraining.basetest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Basetest {
	public static WebDriver driver;
	
	@BeforeMethod
	public void browser()
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/MSTEMP194/Desktop/Automation/chromedriver.exe");
		driver = new ChromeDriver();
       driver.manage().window().maximize();


}
	/*@AfterMethod
	public void browserclose()
	{
		driver.close();
	}*/
}
