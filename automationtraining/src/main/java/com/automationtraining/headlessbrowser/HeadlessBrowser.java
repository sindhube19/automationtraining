/**
 * 
 */
package com.automationtraining.headlessbrowser;

import java.io.File;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;	
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

import com.automationtraining.constant.ConstantFile;					
/**
 * @author Sindhuja Ethiraj
 *
 * 07-Jan-2019
 */
public class HeadlessBrowser {
	
	
	                public static WebDriver headLess() {      
				
        	        File file = new File(ConstantFile.headless);				
                    System.setProperty("phantomjs.binary.path", file.getAbsolutePath());		
                    WebDriver driver = new PhantomJSDriver();
                    return driver;
	                }
           			
	         }		
	

