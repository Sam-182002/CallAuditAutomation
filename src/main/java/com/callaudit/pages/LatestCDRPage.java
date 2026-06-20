package com.callaudit.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class LatestCDRPage extends GenericPage {

    @FindBy(id = "latestCDRTable")
    private WebElement cdrTable;

    @FindBy(id = "refreshBtn")
    private WebElement refreshButton;

    @FindBy(id = "locationFilter")
    private WebElement locationDropdown;

    public LatestCDRPage(WebDriver driver) {
        super(driver);
    }

    public boolean isCDRTableDisplayed() {
        try { return cdrTable.isDisplayed(); }
        catch (Exception e) { return false; }
    }

    public void clickRefresh() { refreshButton.click(); }

    public void selectLocation(String location) {
        new Select(locationDropdown).selectByVisibleText(location);
    }
}
