package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utilities.ExtentManager;
import Utilities.ReadingPropertiesFile;
import Utilities.ScreenShot;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Basepage {

	protected static WebDriver driver;
	public static File file = new File("./resources/config.properties");
	public static FileInputStream fis = null;
	public static Properties prop = new Properties();
	public static ExtentReports extent;
	public static ExtentTest test;

	static {

		try {
			fis = new FileInputStream(file);
		}

		catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		try {
			prop.load(fis);
		}

		catch (IOException e) {
			e.printStackTrace();
		}
	}

	

	@BeforeSuite
	public void initializeWebdriver() {

		System.setProperty(ReadingPropertiesFile.prop.getProperty("chromeProperty"),
				ReadingPropertiesFile.prop.getProperty("chromeDriver"));
		 ChromeOptions option = new ChromeOptions();
		 option.setHeadless(true);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		extent = ExtentManager.getInstance("reports\\ExtentReports.html");
	}

	@BeforeMethod
	public void enterurl(Method method) {
		driver.get(ReadingPropertiesFile.prop.getProperty("url"));
		test = extent.startTest(method.getName());
	}

	@AfterMethod
	public void afterMethod(ITestResult result) {

		if (result.getStatus() == ITestResult.SUCCESS)
			test.log(LogStatus.PASS, "Test case got passed");
		else if (result.getStatus() == ITestResult.FAILURE) {
			test.log(LogStatus.FAIL, result.getThrowable());
			ScreenShot.takeScreenShot(driver);
		} else if (result.getStatus() == ITestResult.SKIP)
			test.log(LogStatus.SKIP, result.getThrowable());

		extent.flush();

	}

	@AfterSuite
	public void browserclose() {
		//driver.quit();
	}
}
