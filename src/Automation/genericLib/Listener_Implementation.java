package Automation.genericLib;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener_Implementation implements ITestListener{
	@Override
	public void onTestFailure(ITestResult result)
	{
		//to get the failed test case name
		String tcName = result.getName();
		//take Screenshot
		
		TakesScreenshot ts = (TakesScreenshot)Base_Class.listenerDriver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File trg = new File("./screenshot/"+tcName+".png");
		try
		{
			FileUtils.copyFile(src, trg);
		}
		catch(IOException e)
		{
			
		}
	}
	

}
