package com.automationtraining.listeners;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.annotations.ITestAnnotation;
import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
/**
 * @author Sindhuja Ethiraj
 *
 * 17-Dec-2018
 */
public class RetryListener implements IAnnotationTransformer {

	@SuppressWarnings("rawtypes")
	//@Override
	public void transform(ITestAnnotation testannotation, Class testClass, Constructor testConstructor, Method testMethod) {
		IRetryAnalyzer retry = testannotation.getRetryAnalyzer();

		if (retry == null) {
			testannotation.setRetryAnalyzer(Retry.class);
		}
	}
}
