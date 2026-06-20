package com.callaudit.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BillingClassPage extends GenericPage {

	@FindBy(id = "addBillingClassBtn")
	private WebElement addButton;

	@FindBy(id = "billingClassName")
	private WebElement billingNameField;

	@FindBy(id = "pulseInSeconds")
	private WebElement pulseField;

	@FindBy(id = "chargePerPulse")
	private WebElement chargeField;

	@FindBy(id = "gracePeriodInSeconds")
	private WebElement gracePeriodField;

	@FindBy(id = "surcharge")
	private WebElement surchargeField;

	@FindBy(id = "markupPercent")
	private WebElement markupField;

	@FindBy(id = "saveBtn")
	private WebElement saveButton;

	@FindBy(css = ".delete-btn")
	private WebElement deleteButton;

	@FindBy(css = ".alert-success")
	private WebElement successMessage;

	@FindBy(css = ".alert-danger")
	private WebElement errorMessage;

	public BillingClassPage(WebDriver driver) {
		super(driver);
	}

	public void clickAdd() {
		addButton.click();
	}

	public void enterBillingName(String name) {
		billingNameField.clear();
		billingNameField.sendKeys(name);
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

	public void enterSurcharge(String val) {
		surchargeField.clear();
		surchargeField.sendKeys(val);
	}

	public void enterMarkup(String val) {
		markupField.clear();
		markupField.sendKeys(val);
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
