/**
 * 
 */
package com.automationtraining.ExtentReportListener;

import java.io.File;

import org.yaml.snakeyaml.scanner.Constant;

import com.automationtraining.constant.ConstantFile;
import com.aventstack.extentreports.AnalysisStrategy;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

/**
 * @author Sindhuja Ethiraj
 *
 * 14-Dec-2018
 */
public class ExtentReportFactory {
	private static ExtentHtmlReporter htmlReporter;
	   
    private static ExtentReports reporter;
        
    public static synchronized ExtentReports getReporter() {
       
        String workspace =     ((new File(".").getAbsolutePath()).replace("\\", "/")).replace(".", "");
        String fileName= workspace+"src/test/resources/extent_config.xml";
        File file = new File(fileName);
           if (reporter == null) {
               htmlReporter = new ExtentHtmlReporter(ConstantFile.REPORTPATH);
               htmlReporter.loadXMLConfig(file);
               reporter = new ExtentReports();
               reporter.attachReporter(htmlReporter);
               reporter.setSystemInfo("Author", "MST QA Automation");
            reporter.setSystemInfo("User Name", "Automation");
            reporter.setSystemInfo("Environment", "Dev");
            reporter.setSystemInfo("Selenium Version", "3.4.0");
            reporter.setAnalysisStrategy(AnalysisStrategy.CLASS);
                
           }
           return reporter;
    }

}
