package com.callaudit.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ExtensionsPage extends GenericPage {

    @FindBy(id = "addExtensionBtn")
    private WebElement addButton;

    @FindBy(id = "rangeStart")
    private WebElement rangeStartField;

    @FindBy(id = "rangeEnd")
    private WebElement rangeEndField;

    @FindBy(id = "department")
    private WebElement departmentField;

    @FindBy(id = "createDeptLink")
    private WebElement createDeptLink;

    @FindBy(id = "importBtn")
    private WebElement importButton;

    @FindBy(id = "exportBtn")
    private WebElement exportButton;

    @FindBy(id = "saveBtn")
    private WebElement saveButton;

    @FindBy(id = "cancelBtn")
    private WebElement cancelButton;

    @FindBy(id = "resetBtn")
    private WebElement resetButton;

    @FindBy(css = ".no-records")
    private WebElement noRecordsMessage;

    @FindBy(css = ".error-msg")
    private WebElement errorMessage;

    @FindBy(css = ".success-msg")
    private WebElement successMessage;

    public ExtensionsPage(WebDriver driver) {
        super(driver);
    }

    public void clickAdd()                       { addButton.click(); }
    public void enterRangeStart(String start)    { rangeStartField.clear(); rangeStartField.sendKeys(start); }
    public void enterRangeEnd(String end)        { rangeEndField.clear(); rangeEndField.sendKeys(end); }
    public void enterDepartment(String dept)     { departmentField.clear(); departmentField.sendKeys(dept); }
    public void clickCreateDepartment()          { createDeptLink.click(); }
    public void clickImport()                    { importButton.click(); }
    public void clickExport()                    { exportButton.click(); }
    public void clickSave()                      { saveButton.click(); }
    public void clickCancel()                    { cancelButton.click(); }
    public void clickReset()                     { resetButton.click(); }

    public boolean isNoRecordsDisplayed() {
        try { return noRecordsMessage.isDisplayed(); }
        catch (Exception e) { return false; }
    }

    public boolean isErrorDisplayed() {
        try { return errorMessage.isDisplayed(); }
        catch (Exception e) { return false; }
    }

    public String getSuccessMessage() {
        return successMessage.getText().trim();
    }
}
