package com.callaudit.utils;

import com.callaudit.config.ConfigReader;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenshotUtil {
	static ConfigReader config = new ConfigReader();
    public static String capture(WebDriver driver, String testName) {
        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        String fileName = testName + "_" + timestamp + ".png";
        String filePath = config.getConfigData("screenshot.path") + fileName;

        try {
            File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            File dest = new File(filePath);
            dest.getParentFile().mkdirs();
            FileUtils.copyFile(src, dest);
            System.out.println("Screenshot saved: " + filePath);
        } catch (Exception e) {
            System.out.println("Screenshot failed: " + e.getMessage());
        }
        return filePath;
    }
}
