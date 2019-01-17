package utilities;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import base.BaseTest;

public class TestUtil extends BaseTest{
	
	
	public static String fileName;
	
	public static void captureScreenshot() throws IOException
	{
		Date d= new Date();
		fileName=d.toString().replace(" ","_").replace(":","_")+".jpg";
		File scr=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scr,new File(System.getProperty("user.dir")+"\\test-output\\html\\"+fileName));
		}

}
