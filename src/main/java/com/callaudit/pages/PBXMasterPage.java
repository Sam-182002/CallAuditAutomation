package com.callaudit.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PBXMasterPage extends GenericPage {

	@FindBy(id = "addPBXBtn")
	private WebElement addButton;

	@FindBy(id = "pbxName")
	private WebElement pbxNameField;

	@FindBy(id = "cdrStructure")
	private WebElement cdrStructureField;

	@FindBy(id = "saveBtn")
	private WebElement saveButton;

	@FindBy(css = ".alert-success")
	private WebElement successMessage;

	@FindBy(css = ".alert-danger")
	private WebElement errorMessage;

	public PBXMasterPage(WebDriver driver) {
		super(driver);
	}

	public void clickAdd() {
		addButton.click();
		
	}

	public void enterPBXName(String name) {
		pbxNameField.clear();
		pbxNameField.sendKeys(name);
	}

	public String getCDRStructureText() {
		return cdrStructureField.getText().trim();
	}

	public void clickSave() {
		saveButton.click();
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
