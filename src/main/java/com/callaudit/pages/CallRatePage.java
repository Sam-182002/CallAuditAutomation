package com.callaudit.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CallRatePage extends GenericPage {

    @FindBy(id = "addCallRateBtn")
    private WebElement addButton;

    @FindBy(id = "callRateName")
    private WebElement callRateNameField;

    @FindBy(id = "pulseInSeconds")
    private WebElement pulseField;

    @FindBy(id = "chargePerPulse")
    private WebElement chargeField;

    @FindBy(id = "gracePeriodInSeconds")
    private WebElement gracePeriodField;

    @FindBy(id = "saveBtn")
    private WebElement saveButton;

    @FindBy(css = ".delete-btn")
    private WebElement deleteButton;

    @FindBy(css = ".alert-success")
    private WebElement successMessage;

    @FindBy(css = ".alert-danger")
    private WebElement errorMessage;

    public CallRatePage(WebDriver driver) {
        super(driver);
    }

    public void clickAdd()                         { addButton.click(); }
    public void enterCallRateName(String name)     { callRateNameField.clear(); callRateNameField.sendKeys(name); }
    public void enterPulse(String val)             { pulseField.clear(); pulseField.sendKeys(val); }
    public void enterCharge(String val)            { chargeField.clear(); chargeField.sendKeys(val); }
    public void enterGracePeriod(String val)       { gracePeriodField.clear(); gracePeriodField.sendKeys(val); }
    public void clickSave()                        { saveButton.click(); }
    public void clickDelete()                      { deleteButton.click(); }
    public String getSuccessMessage()              { return successMessage.getText().trim(); }
    public String getErrorMessage()                { return errorMessage.getText().trim(); }

    public boolean isErrorDisplayed() {
        try { return errorMessage.isDisplayed(); }
        catch (Exception e) { return false; }
    }
}
