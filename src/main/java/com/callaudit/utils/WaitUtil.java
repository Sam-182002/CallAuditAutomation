//package com.callaudit.utils;
//
//import com.callaudit.config.ConfigReader;
//import org.openqa.selenium.*;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import java.time.Duration;
//
//public class WaitUtil {
//
////    private static long EXPLICIT_WAIT = Long.parseLong(ConfigReader.getConfigData("explicit.wait"));
////
////    private static WebDriverWait getWait(WebDriver driver) {
////        return new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
////    }
////
////    public static WebElement waitForVisible(WebDriver driver, By locator) {
////        return getWait(driver).until(ExpectedConditions.visibilityOfElementLocated(locator));
////    }
////
////    public static WebElement waitForClickable(WebDriver driver, By locator) {
////        return getWait(driver).until(ExpectedConditions.elementToBeClickable(locator));
////    }
////
////    public static void click(WebDriver driver, By locator) {
////        waitForClickable(driver, locator).click();
////    }
////
////    public static void sendKeys(WebDriver driver, By locator, String text) {
////        WebElement element = waitForVisible(driver, locator);
////        element.clear();
////        element.sendKeys(text);
////    }
////
////    public static String getText(WebDriver driver, By locator) {
////        return waitForVisible(driver, locator).getText().trim();
////    }
////
////    public static void selectByVisibleText(WebDriver driver, By locator, String text) {
////        WebElement element = waitForVisible(driver, locator);
////        new Select(element).selectByVisibleText(text);
////    }
////
////    public static boolean isElementPresent(WebDriver driver, By locator) {
////        try {
////            waitForVisible(driver, locator);
////            return true;
////        } catch (TimeoutException | NoSuchElementException e) {
////            return false;
////        }
////    }
////
////    public static boolean isElementDisplayed(WebDriver driver, By locator) {
////        try {
////            return driver.findElement(locator).isDisplayed();
////        } catch (NoSuchElementException e) {
////            return false;
////        }
////    }
////
////    public static void waitForPageLoad(WebDriver driver) {
////        getWait(driver).until(webDriver ->
////            ((JavascriptExecutor) webDriver)
////                .executeScript("return document.readyState").equals("complete"));
////    }
////}
