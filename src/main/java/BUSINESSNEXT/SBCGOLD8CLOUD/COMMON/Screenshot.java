package BUSINESSNEXT.SBCGOLD8CLOUD.COMMON;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import BUSINESSNEXT.SBCGOLD8CLOUD.REPOSITORY.*;

public class Screenshot extends BrowserStart implements Properties{


	    public void ScreenshotMethod(String process)
	    {


	    File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);


      Date d = new Date();
      String FileName = process+d.toString().replace(":", "_").replace(" ", "_");


	    try {
	    	//FileUtils.copyFile(screenshotFile, new File("D:\\Rizwan\\Automation\\lib\\Pots\\"+Result.getName()+System.currentTimeMillis()+FileName+".png"));

	    	FileUtils.copyFile(screenshotFile, new File(pots+FileName+".png"));
		}

	    catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

}
}