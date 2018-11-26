package com.automationtraining.property;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Readprop {

	public static void main(String args[]) throws IOException {
		WebDriver driver = null;
	//how to read proprties file
	Properties prop = new Properties();
	FileInputStream fin = new FileInputStream("C:/Users/MSTEMP194/git/automationtraining/automationtraining/"
			+ "src/main/java/com/automationtraining/property/config.properties");
	prop.load(fin);
	System.out.println(prop.getProperty("browser"));
	String browserName = prop.getProperty("browser");
	System.out.println(browserName);
	if(browserName.equals("chrome"))
	{
	//	System.setProperty("webdriver.chrome.driver", "C:/Users/MSTEMP194/Desktop/Automation/chromedriver.exe");
		 driver = new ChromeDriver();
	}
	else if(browserName.equals("IE")){
		driver = new InternetExplorerDriver();
		
	}
	driver.get(prop.getProperty("url"));
	driver.findElement(By.id(prop.getProperty("username_name"))).sendKeys(prop.getProperty("username"));
	driver.findElement(By.id(prop.getProperty("password_name"))).sendKeys(prop.getProperty("password_name"));;
	driver.findElement(By.id(prop.getProperty("loginbtn_id"))).click();
}

	}
