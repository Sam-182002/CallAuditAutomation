package com.callaudit.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegionsPage extends GenericPage {

    @FindBy(id = "addRegionBtn")
    private WebElement addButton;

    @FindBy(id = "regionName")
    private WebElement regionNameField;

    @FindBy(id = "mobileStartDigit")
    private WebElement mobileStartField;

    @FindBy(id = "fixedLineStartDigit")
    private WebElement fixedLineStartField;

    @FindBy(id = "areaCode")
    private WebElement areaCodeField;

    @FindBy(id = "idd")
    private WebElement iddField;

    @FindBy(id = "ndd")
    private WebElement nddField;

    @FindBy(id = "saveBtn")
    private WebElement saveButton;

    @FindBy(css = ".delete-btn")
    private WebElement deleteButton;

    @FindBy(css = ".alert-success")
    private WebElement successMessage;

    @FindBy(css = ".alert-danger")
    private WebElement errorMessage;

    public RegionsPage(WebDriver driver) {
        super(driver);
    }

    public void clickAdd()                              { addButton.click(); }
    public void enterRegionName(String name)            { regionNameField.clear(); regionNameField.sendKeys(name); }
    public void enterMobileStartDigit(String val)       { mobileStartField.clear(); mobileStartField.sendKeys(val); }
    public void enterFixedLineStartDigit(String val)    { fixedLineStartField.clear(); fixedLineStartField.sendKeys(val); }
    public void enterAreaCode(String val)               { areaCodeField.clear(); areaCodeField.sendKeys(val); }
    public void enterIDD(String val)                    { iddField.clear(); iddField.sendKeys(val); }
    public void enterNDD(String val)                    { nddField.clear(); nddField.sendKeys(val); }
    public void clickSave()                             { saveButton.click(); }
    public void clickDelete()                           { deleteButton.click(); }
    public String getSuccessMessage()                   { return successMessage.getText().trim(); }
    public String getErrorMessage()                     { return errorMessage.getText().trim(); }

    public boolean isErrorDisplayed() {
        try { return errorMessage.isDisplayed(); }
        catch (Exception e) { return false; }
    }
}
