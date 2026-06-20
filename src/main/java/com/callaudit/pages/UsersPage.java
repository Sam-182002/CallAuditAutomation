package com.callaudit.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class UsersPage extends GenericPage {

    @FindBy(id = "addUserBtn")
    private WebElement addUserButton;

    @FindBy(id = "username")
    private WebElement usernameField;

    @FindBy(id = "email")
    private WebElement emailField;

    @FindBy(id = "roles")
    private WebElement rolesDropdown;

    @FindBy(id = "saveBtn")
    private WebElement saveButton;

    @FindBy(css = ".alert-success")
    private WebElement successMessage;

    @FindBy(css = ".alert-danger")
    private WebElement errorMessage;

    public UsersPage(WebDriver driver) {
        super(driver);
    }

    public void clickAddUser()                  { addUserButton.click(); }
    public void enterUsername(String username)  { usernameField.clear(); usernameField.sendKeys(username); }
    public void enterEmail(String email)        { emailField.clear(); emailField.sendKeys(email); }
    public void clickSave()                     { saveButton.click(); }

    public void selectRole(String role) {
        new Select(rolesDropdown).selectByVisibleText(role);
    }

    public String getSuccessMessage() { return successMessage.getText().trim(); }

    public boolean isErrorDisplayed() {
        try { return errorMessage.isDisplayed(); }
        catch (Exception e) { return false; }
    }

    public String getErrorMessage() { return errorMessage.getText().trim(); }
}
