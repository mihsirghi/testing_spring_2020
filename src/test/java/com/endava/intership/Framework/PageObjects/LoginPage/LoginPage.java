package com.endava.intership.Framework.PageObjects.LoginPage;

import com.endava.intership.Framework.Infrastructure.Driver.Setup;
import com.endava.intership.Framework.Infrastructure.Driver.Wait;
import com.endava.intership.Framework.PageObjects.DefaultPage.DefaultPage;
import org.openqa.selenium.Dimension;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends DefaultPage {
    public LoginPage(){
            this.driver = Setup.driver;
            this.driver.manage().window().setSize(new Dimension(1024,768));
            this.wait = new Wait(this.driver);
    }

    @FindBy(xpath = "//*[@id='header-bar']/div[3]/button/span")
    private WebElement loginButton;

    @FindBy(xpath = "//*[@id='login-email']")
    private WebElement emailField;

    @FindBy(xpath = "//*[@id='login-password']")
    private WebElement passwordField;

    @FindBy(css = "form.login-form .submit")
    private WebElement signInBtn;

    public WebElement getLoginButton() {
        return loginButton;
    }

    public WebElement getEmailField() {
        return emailField;
    }

    public WebElement getPasswordField() {
        return passwordField;
    }

    public WebElement getSignInBtn() {
        return signInBtn;
    }
}
