package com.endava.intership.Framework.PageObjects.CreateAccount;

import com.endava.intership.Framework.Infrastructure.Driver.Setup;
import com.endava.intership.Framework.Infrastructure.Driver.Wait;
import com.endava.intership.Framework.PageObjects.DefaultPage.DefaultPage;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccount extends DefaultPage {
    public CreateAccount() {
        this.driver = Setup.driver;
        this.driver.manage().window().setSize(new Dimension(1024, 768));
        this.wait = new Wait(this.driver);
    }

    @FindBy(xpath = "//*[@id='header-bar']/div[3]/button/span")
    private WebElement signInButton;

    @FindBy(css = "a.popup-button.default-popup-button.create-account-link")
    private WebElement createAccountButton;

    @FindBy(id = "login")
    private WebElement emailField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(id = "password-conf")
    private WebElement confirmPasswordField;

    @FindBy(xpath = "//*[@id='form-1589902049063']/div[2]/div[2]/div/button")
    private WebElement createButton;

    // @FindBy(id = "status-messages")
    @FindBy(linkText = "The data has been saved successfully")
    private WebElement warningMessage;

    @FindBy(xpath = "//*[@id='header-bar']/div[3]/a")
    private WebElement signInDropDown;

    @FindBy(xpath = "//*[@id='header-bar']/div[3]/button/span")
    private WebElement loginButton;

    public WebElement getSignInButton() {
        return signInButton;
    }

    public WebElement getCreateAccountButton() {
        return createAccountButton;
    }

    public WebElement getEmailField() {
        return emailField;
    }

    public WebElement getPasswordField() {
        return passwordField;
    }

    public WebElement getConfirmPasswordField() {
        return confirmPasswordField;
    }

    public WebElement getCreateButton() {
        return createButton;
    }

    public String getWarningMessage() {
        return warningMessage.toString();
    }

    public WebElement getSignInDropDown() {
        return signInDropDown;
    }

    public WebElement getLoginButton() {
        return loginButton;
    }

}
