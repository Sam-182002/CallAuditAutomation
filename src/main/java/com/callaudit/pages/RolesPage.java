package com.callaudit.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RolesPage extends GenericPage {

	@FindBy(id = "addRoleBtn")
	private WebElement addButton;

	@FindBy(id = "roleName")
	private WebElement roleNameField;

	@FindBy(id = "saveBtn")
	private WebElement saveButton;

	@FindBy(css = ".permission-checkbox")
	private WebElement permissionCheckbox;

	@FindBy(css = ".alert-success")
	private WebElement successMessage;

	@FindBy(css = ".alert-danger")
	private WebElement errorMessage;

	public RolesPage(WebDriver driver) {
		super(driver);
	}

	public void clickAdd() {
		addButton.click();
	}

	public void enterRoleName(String name) {
		roleNameField.clear();
		roleNameField.sendKeys(name);
	}

	public void selectPermission() {
		permissionCheckbox.click();
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
