package com.callaudit.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends GenericPage {

    @FindBy(id = "searchResultsTable")
    private WebElement searchTable;

    @FindBy(id = "resetBtn")
    private WebElement resetButton;

    @FindBy(id = "exportBtn")
    private WebElement exportButton;

    @FindBy(css = ".no-records")
    private WebElement noRecordsMessage;

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public boolean isTableDisplayed() {
        try { return searchTable.isDisplayed(); }
        catch (Exception e) { return false; }
    }

    public void clickReset() { resetButton.click(); }

    public void clickExport() { exportButton.click(); }

    public boolean isNoRecordsMessageDisplayed() {
        try { return noRecordsMessage.isDisplayed(); }
        catch (Exception e) { return false; }
    }
}
