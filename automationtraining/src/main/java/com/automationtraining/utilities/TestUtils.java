/**
 * 
 */
package com.automationtraining.utilities;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.automationtraining.constant.ConstantFile;

/**
 * @author Sindhuja Ethiraj
 *
 * 12-Dec-2018
 */
public class TestUtils {

	protected static final Properties prop=new Properties();
	protected static File file;
	protected static FileInputStream fileInput;
	protected static String userType;
	static {
	try {
		fileInput = new FileInputStream(ConstantFile.propertyFilePath);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		prop.load(fileInput);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
public static String getStringFromPropertyFile(String key) {
	return prop.getProperty(key);
	
}

 
public static Integer getIntegerFromPropertyFile(String key){
		return new Integer(prop.getProperty(key));
	}
	
	public static String getUserType(){
		return userType;
	}

	public static void setUserType(String urlString){
		userType =urlString;
	} 
 


}
