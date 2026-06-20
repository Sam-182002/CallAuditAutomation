package com.callaudit.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class LocationPropertiesPage extends GenericPage {

    @FindBy(id = "addLocationBtn")
    private WebElement addButton;

    @FindBy(id = "locationName")
    private WebElement locationNameField;

    @FindBy(id = "cdrFilePath")
    private WebElement cdrFilePathField;

    @FindBy(id = "cdrDumpFolder")
    private WebElement cdrDumpFolderField;

    @FindBy(id = "pbxName")
    private WebElement pbxDropdown;

    @FindBy(id = "cdrStructureDisplay")
    private WebElement cdrStructureText;

    @FindBy(id = "saveBtn")
    private WebElement saveButton;

    @FindBy(css = ".alert-success")
    private WebElement successMessage;

    @FindBy(css = ".alert-danger")
    private WebElement errorMessage;

    public LocationPropertiesPage(WebDriver driver) {
        super(driver);
    }

    public void clickAdd()                          { addButton.click(); }
    public void enterLocationName(String name)      { locationNameField.clear(); locationNameField.sendKeys(name); }
    public void enterCDRFilePath(String path)       { cdrFilePathField.clear(); cdrFilePathField.sendKeys(path); }
    public void enterCDRDumpFolder(String folder)   { cdrDumpFolderField.clear(); cdrDumpFolderField.sendKeys(folder); }
    public String getCDRStructureText()             { return cdrStructureText.getText().trim(); }
    public void clickSave()                         { saveButton.click(); }
    public String getSuccessMessage()               { return successMessage.getText().trim(); }
    public String getErrorMessage()                 { return errorMessage.getText().trim(); }

    public void selectPBX(String pbx) {
        new Select(pbxDropdown).selectByVisibleText(pbx);
    }

    public boolean isErrorDisplayed() {
        try { return errorMessage.isDisplayed(); }
        catch (Exception e) { return false; }
    }
}
