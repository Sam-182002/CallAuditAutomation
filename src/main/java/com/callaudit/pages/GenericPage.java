package com.callaudit.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * GenericPage — base class for all Page Object classes.
 *
 * Purpose:
 *   - Receives the WebDriver instance from the test (via BaseClass.driver)
 *   - Calls PageFactory.initElements() so every @FindBy annotation
 *     in every page class is initialised automatically
 *
 * Usage in page classes:
 *   public class LoginPage extends GenericPage {
 *       @FindBy(id = "username")
 *       private WebElement usernameField;
 *
 *       public LoginPage(WebDriver driver) {
 *           super(driver);   // <-- this single line wires everything
 *       }
 *   }
 *
 * Usage in test classes:
 *   LoginPage loginPage = new LoginPage(driver);
 *   // All @FindBy elements are now ready — no manual PageFactory call needed
 */
public class GenericPage {

    protected WebDriver driver;

    public GenericPage(WebDriver driver) {
        this.driver = driver;
        // Initialise all @FindBy, @FindBys, @FindAll WebElements in the subclass
        PageFactory.initElements(driver, this);
    }
}
