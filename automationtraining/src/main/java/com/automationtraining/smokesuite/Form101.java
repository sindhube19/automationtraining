package com.automationtraining.smokesuite;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.automationtraining.ExtentReportListener.ReportGenerator;
import com.automationtraining.basetest.BaseTest;
import com.automationtraining.browserfactory.BrowserFactory;
import com.automationtraining.pageobject.Loginpages;
import com.automationtraining.utilities.TestUtils;




/**
 * @author Sindhuja Ethiraj
 *
 */
public class Form101 extends  BaseTest{


//	@SuppressWarnings("javadoc")
	@Test
	public void formFilling101() throws Exception
	{
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();

		String className = this.getClass().getSimpleName();

		String tcName = "TCAT_101";

		String Author="Sindhuja"; 
		reporter= new ReportGenerator(className,Author);
		page101=Loginpages.formUrl101();
		page101.formFilling(methodName,tcName,reporter);
		 Assert.assertTrue(true);

		//    ExtentReportsClass.loginTest();





	}
	@Test (dependsOnMethods="formFilling101")
	@Parameters("sflogin")
	public void formFillingSignin(String sflogin) throws Exception
	{


		sfurl=TestUtils.getStringFromPropertyFile(sflogin);

		driver=BrowserFactory.getNewdriver();
		driver.navigate().to(sfurl);
		driver.manage().window().maximize();
		Loginpages= new Loginpages(driver);
		page101=Loginpages.formUrl101();
		page101.formSignin();
	}
}


