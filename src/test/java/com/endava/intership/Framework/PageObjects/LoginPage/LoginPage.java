package com.endava.intership.Framework.PageObjects.LoginPage;

import com.endava.intership.Framework.Infrastructure.Driver.Setup;
import com.endava.intership.Framework.Infrastructure.Driver.Wait;
import com.endava.intership.Framework.PageObjects.DefaultPage.DefaultPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginPage extends DefaultPage {
    public LoginPage() {
        this.driver = Setup.driver;
        this.driver.manage().window().setSize(new Dimension(1024, 768));
        this.wait = new Wait(this.driver);
    }

    @FindBy(xpath = "//*[@id='header-bar']/div[3]/button/span")
    private WebElement signInButton;

    @FindBy(xpath = "//*[@id='login-email']")
    private WebElement emailField;

    @FindBy(xpath = "//*[@id='login-password']")
    private WebElement passwordField;

    @FindBy(css = "form.login-form .submit")
    private WebElement signInBtn;

    @FindBy(css = "div.ui-dialog.ui-corner-all.ui-widget.ui-widget-content.ui-front.default-dialog.has-title")
    private WebElement popUp;

    @FindBy(css = "div.header_settings.dropdown.open > div")
    private WebElement preferencesMenu;

    @FindBy(css = "div.header_settings.dropdown.open > div > ul.sign-in_block > li > button")
    private WebElement signInBtnFromPreferencesMenuBtn;

    @FindBy(css = "div.block.block-block.block-featured-products > div > div > div > ul > li:nth-child(1) > div")
    private WebElement product;

    @FindBy(xpath = "//*[@id='content']/div/div/div[4]/div/div/div/ul/li[1]/div/div[2]/div[3]/div[1]/button/span")
    private WebElement addBtn;

    @FindBy(linkText = "Checkout")
    private WebElement checkoutBtn;

    public void getSignInButton() {
        new WebDriverWait(Setup.driver, 5).until(ExpectedConditions.elementToBeClickable(signInButton)).click();
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

    public void getPopUp() {
        new WebDriverWait(Setup.driver, 5).until(ExpectedConditions.visibilityOf(popUp));
    }

    public void getPreferencesMenuButtton() {
        new WebDriverWait(Setup.driver, 5).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='header']/div[2]/a"))).click();
    }

    public void preferencesMenuDisplayed() {
        new WebDriverWait(Setup.driver, 5).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.header_settings.dropdown.open > div")));
    }

    public WebElement getSignInBtnFromPreferencesMenuBtn() {
        return signInBtnFromPreferencesMenuBtn;
    }

    public WebElement getProduct() {
        return product;
    }

    public WebElement getAddBtn() {
        return addBtn;
    }

    public WebElement getCheckoutBtn() {
        return checkoutBtn;
    }

    public void errorMessageDisplayed() {
        new WebDriverWait(Setup.driver, 5).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ui-dialog:not([style*='display: none']) table > tbody > tr > td > div.form-error")));
    }

    public void checkoutBtn() {
        new WebDriverWait(Setup.driver, 5).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.ui-dialog.ui-corner-all.ui-widget.ui-widget-content.ui-front.default-dialog.has-title.add2cartpopup")));
    }
}
