package com.callaudit.base;

import java.io.IOException;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.callaudit.config.ConfigReader;
import com.callaudit.reports.ExtentManager;
import com.callaudit.utils.JavaUtility;
import com.callaudit.utils.LogUtil;
import com.callaudit.utils.WebDriverUtility;




public class BaseClass {

	public static WebDriver driver;
	public static ExtentReports ereport;
	public static ExtentTest test;
	public WebDriverUtility wutil = new WebDriverUtility();
	public JavaUtility jutil = new JavaUtility();
	ExtentManager em = new ExtentManager();
	public static final Logger log = LogUtil.getLogger(BaseClass.class);
	ConfigReader config = new ConfigReader();
	
    @BeforeSuite
	public void reportConfig() {
		ereport = ExtentManager.getInstance();
		log.info("Extent Report initialized");
		driver = new ChromeDriver();
		log.info("Browser launched successfully");
		wutil.maximize(driver);
		wutil.implicitWait(driver, 10);
		driver.get(config.getConfigData("base.url"));
		log.info("Navigated to the application URL   " +  config.getConfigData("base.url"));
	}
//	@BeforeClass
//	public void openBrowser() throws IOException {
////		driver = new ChromeDriver();
////		log.info("Browser launched successfully");
////		wutil.maximize(driver);
////		wutil.implicitWait(driver, 10);
////		driver.get(config.getConfigData("base.url"));
////		log.info("Navigated to the application URL   " +  config.getConfigData("base.url"));
//	}
//
//	@BeforeMethod
//	public void login() throws IOException {
//		
//	}
//
//	@AfterMethod
//	public void logout() {
//		
//	
//	}

//	@AfterClass
//	public void closeBrowser() {
//		driver.quit();
//	}

	@AfterSuite
	public void reportBackup() {
		driver.quit();
		ereport.flush();
	}
    }

