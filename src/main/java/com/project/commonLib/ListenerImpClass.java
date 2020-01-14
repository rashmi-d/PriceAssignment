package com.project.commonLib;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.openqa.selenium.OutputType;

/**
 * 
 * @author Rashmi
 *
 */



	public class ListenerImpClass implements ITestListener{
		/**
		 * used to take screenshot whenever test is getting failed
		 */
		public String failedTestName;
		 public EventFiringWebDriver eDriver;
			public void onTestFailure(ITestResult result)
			{
			 failedTestName=result.getMethod().getMethodName();
				System.out.println("===FAILED==="+failedTestName);
				eDriver=new EventFiringWebDriver(BaseClass.driver);
				File srcFile=eDriver.getScreenshotAs(OutputType.FILE);
				File destFile=new File("./sceenshot/"+failedTestName+".png");
			    try {
			    	FileUtils.copyFile(srcFile, destFile);
			    }
		catch(IOException e)
		{
			
		}
			}
			@Override
			public void onFinish(ITestContext arg0) {
				// TODO Auto-generated method stub
				
			}
			@Override
			public void onStart(ITestContext arg0) {
				// TODO Auto-generated method stub
				
			}
			@Override
			public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
				// TODO Auto-generated method stub
				
			}
			@Override
			public void onTestSkipped(ITestResult arg0) {
				// TODO Auto-generated method stub
				
			}
			@Override
			public void onTestStart(ITestResult arg0) {
				// TODO Auto-generated method stub
				
			}
			@Override
			public void onTestSuccess(ITestResult arg0) {
				// TODO Auto-generated method stub
				
			}		    
			} 


