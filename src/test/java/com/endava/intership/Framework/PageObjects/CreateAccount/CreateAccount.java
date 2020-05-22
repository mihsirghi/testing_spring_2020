package com.endava.intership.Framework.PageObjects.CreateAccount;

import com.endava.intership.Framework.Infrastructure.Driver.Setup;
import com.endava.intership.Framework.Infrastructure.Driver.Wait;
import com.endava.intership.Framework.PageObjects.DefaultPage.DefaultPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateAccount extends DefaultPage {
    public CreateAccount() {
        this.driver = Setup.driver;
        this.driver.manage().window();
        this.wait = new Wait(this.driver);
    }

    @FindBy(xpath = "//*[@id='header-bar']/div[3]/button/span")
    private WebElement signInButton;

    @FindBy(css = "div.ui-dialog.ui-corner-all.ui-widget.ui-widget-content.ui-front.default-dialog.has-title")
    private WebElement popUp;

    @FindBy(css = "a.popup-button.default-popup-button.create-account-link")
    private WebElement createAccountButton;

    @FindBy(css = "#login")
    private WebElement emailField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(id = "password-conf")
    private WebElement confirmPasswordField;

    @FindBy(css = "div.model-form-buttons > div > button")
    private WebElement createButton;

    @FindBy(css = "li.info")
    private WebElement warningMessage;

    @FindBy(xpath = "//*[@id='header-bar']/div[3]/a")
    private WebElement signInDropDown;

    @FindBy(xpath = "//*[@id='header-bar']/div[3]/button/span")
    private WebElement loginButton;

    @FindBy(css = "li.error")
    private WebElement errorMessage;

    @FindBy(css = "p.error")
    private WebElement emailErrorMessage;

    @FindBy(xpath = "//*[@id='header']/div[2]/a")
    private WebElement preferencesMenuButtton;

    @FindBy(css = "div.header_settings.dropdown.open > div > ul.sign-in_block > li > button")
    private WebElement signInButtonFrompreferencesMenuBottton;

    @FindBy(css = "#status-messages > a")
    private WebElement closeErrorMessage;

    public void getSignInBtn() {
        new WebDriverWait(Setup.driver, 5).until(ExpectedConditions.elementToBeClickable(signInButton)).click();
    }

    public WebElement getCreateAccountBtn() {
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

    public WebElement getCreateBtn() {
        return createButton;
    }

    public void getWarningMessage() {
        new WebDriverWait(Setup.driver, 5).until(ExpectedConditions.visibilityOf(warningMessage));
    }

    public void getPopUp() {
        new WebDriverWait(Setup.driver, 5).until(ExpectedConditions.visibilityOf(popUp));
    }

    public void getErrorMessage() {
        new WebDriverWait(Setup.driver, 5).until(ExpectedConditions.visibilityOf(errorMessage));
    }

    public void getEmailErrorMessage() {
        new WebDriverWait(Setup.driver, 5).until(ExpectedConditions.visibilityOf(emailErrorMessage));
    }

    public WebElement getPreferencesMenuButtton() {
        return preferencesMenuButtton;
    }

    public WebElement getSignInBtnFrompreferencesMenuBottton() {
        return signInButtonFrompreferencesMenuBottton;
    }

    public WebElement getCloseErrorMessage() {
        return closeErrorMessage;
    }

    public void menuIsDisplayed() {
        new WebDriverWait(Setup.driver, 5).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.header_settings.dropdown.open > div")));
    }
}
