package com.callaudit.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BillingExceptionsPage extends GenericPage {

	@FindBy(id = "addBillingExceptionBtn")
	private WebElement addButton;

	@FindBy(id = "exceptionName")
	private WebElement exceptionNameField;

	@FindBy(id = "pulseInSeconds")
	private WebElement pulseField;

	@FindBy(id = "chargePerPulse")
	private WebElement chargeField;

	@FindBy(id = "gracePeriodInSeconds")
	private WebElement gracePeriodField;

	@FindBy(id = "tollFreeNumber")
	private WebElement tollFreeField;

	@FindBy(id = "saveBtn")
	private WebElement saveButton;

	@FindBy(css = ".delete-btn")
	private WebElement deleteButton;

	@FindBy(css = ".alert-success")
	private WebElement successMessage;

	@FindBy(css = ".alert-danger")
	private WebElement errorMessage;

	public BillingExceptionsPage(WebDriver driver) {
		super(driver);
	}

	public void clickAdd() {
		addButton.click();
	}

	public void enterExceptionName(String name) {
		exceptionNameField.clear();
		exceptionNameField.sendKeys(name);
	}

	public void enterPulse(String val) {
		pulseField.clear();
		pulseField.sendKeys(val);
	}

	public void enterCharge(String val) {
		chargeField.clear();
		chargeField.sendKeys(val);
	}

	public void enterGracePeriod(String val) {
		gracePeriodField.clear();
		gracePeriodField.sendKeys(val);
	}

	public void enterTollFree(String val) {
		tollFreeField.clear();
		tollFreeField.sendKeys(val);
	}

	public void clickSave() {
		saveButton.click();
	}

	public void clickDelete() {
		deleteButton.click();
	}

	public String getSuccessMessage() {
		return successMessage.getText().trim();
	}

	public String getErrorMessage() {
		return errorMessage.getText().trim();
	}

	public boolean isErrorDisplayed() {
		try {
			return errorMessage.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}
}
