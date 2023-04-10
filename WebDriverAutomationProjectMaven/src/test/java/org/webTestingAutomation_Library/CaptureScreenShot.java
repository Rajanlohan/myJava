package org.webTestingAutomation_Library;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CaptureScreenShot {

	public static void screenshot(WebDriver driver, String ss) throws IOException
	{
		Calendar cl = Calendar.getInstance();
		System.out.println(cl.getTime());
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File f = screenshot.getScreenshotAs(OutputType.FILE);
		File ft = new File("./Screenshots/"+cl.getTime().toString()
				.replace(":", "").replace(" ", "").replace("IST","").replace("2023", "")+".png");
		FileUtils.copyFile(f, ft);
		
	}
}
