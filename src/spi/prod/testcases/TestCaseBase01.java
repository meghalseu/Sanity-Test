package spi.prod.testcases;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import spi.framework.GlobalConfig;
import spi.logger.Log;
import spi.utility.Wrapper;

public class TestCaseBase01 {

	

	@BeforeMethod(alwaysRun = true)
	public void beforeMethod() {

		// Setup. Launch browser
		DOMConfigurator.configure("log4j.xml");

		GlobalConfig.currentdriver = GlobalConfig
				.TestWithBrowser("chrome");

		WebDriver driver = GlobalConfig.currentdriver;

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		Log.info("Inside Test Setup");

		//driver.get(GlobalConfig.SPI_QA_URL); //Test against QA Environment
		driver.get("http://spi.tts.local/"); //Uncomment this if you want to run test against PROD

		Log.info("Current URL : " + Wrapper.getURL());
		Log.info("");

	}

	@AfterMethod (alwaysRun = true)
	public void afterMethod() {

		// Cleanup. Quit Browser
		GlobalConfig.currentdriver.quit();
		Log.info("Inside Test Cleanup");
		Log.info(".");
		Log.info(".");
		Log.info(".");
	}

}
