/**
 * 
 */
package com.automationtraining.headlessbrowser;
import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

import com.automationtraining.constant.ConstantFile;	

/**
 * @author Sindhuja Ethiraj
 *
 * 08-Jan-2019
 */
public class HeadLessBrowser {

				
			public static void main(String[] args) {
	        	        File file = new File(ConstantFile.headless);				
	                    System.setProperty("phantomjs.binary.path", file.getAbsolutePath());		
	                    WebDriver driver = new PhantomJSDriver();	
	                    driver.get("http://www.google.com");         
	                    WebElement element = driver.findElement(By.name("q"));	
	                    element.sendKeys("Guru99");					
	                    element.submit();         			
	                    System.out.println("Page title is: " + driver.getTitle());		
	                    driver.quit();			
	           }		
	}

