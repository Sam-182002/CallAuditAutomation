package com.callaudit.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ReportsPage extends GenericPage {

    @FindBy(id = "resetBtn")
    private WebElement resetButton;

    @FindBy(id = "summaryRadio")
    private WebElement summaryRadio;

    @FindBy(id = "detailedRadio")
    private WebElement detailedRadio;

    @FindBy(id = "reportType")
    private WebElement reportTypeDropdown;

    @FindBy(id = "location")
    private WebElement locationDropdown;

    @FindBy(id = "ascending")
    private WebElement ascendingOption;

    @FindBy(id = "descending")
    private WebElement descendingOption;

    @FindBy(id = "showReportBtn")
    private WebElement showReportButton;

    @FindBy(css = ".no-records-dialog")
    private WebElement noRecordsDialog;

    public ReportsPage(WebDriver driver) {
        super(driver);
    }

    public void clickReset()           { resetButton.click(); }
    public void selectSummaryReport()  { summaryRadio.click(); }
    public void selectDetailedReport() { detailedRadio.click(); }
    public void selectAscending()      { ascendingOption.click(); }
    public void selectDescending()     { descendingOption.click(); }
    public void clickShowReport()      { showReportButton.click(); }

    public void selectReportType(String reportType) {
        new Select(reportTypeDropdown).selectByVisibleText(reportType);
    }

    public void selectLocation(String location) {
        new Select(locationDropdown).selectByVisibleText(location);
    }

    public boolean isNoRecordsDialogDisplayed() {
        try { return noRecordsDialog.isDisplayed(); }
        catch (Exception e) { return false; }
    }
}
