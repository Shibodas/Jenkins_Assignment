package Utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot {
	public static void takeScreenShot(WebDriver driver) {

		String screenshotFileName = System.getProperty("user.dir") + "\\TestFailed.jpg";
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		try {

			FileUtils.copyFile(scrFile, new File(screenshotFileName));

		} catch (IOException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		}
	}
}
