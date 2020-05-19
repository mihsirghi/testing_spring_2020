package com.endava.intership.Framework.PageObjects.DefaultPage;

import com.endava.intership.Framework.Infrastructure.Driver.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.net.URL;

public class DefaultPage {

    protected WebDriver driver;
    protected Wait wait;

    public DefaultPage() {
        this.driver = Setup.driver;
        this.wait = new Wait( this.driver );
        PageFactory.initElements( driver, this );
    }

    public void checkTitle(String title) {
        String displayedTitle = driver.getTitle();
        Assert.assertEquals( "Displayed title is " + displayedTitle + " instead of " + title, title, displayedTitle );
    }

    //Navigation elements
    @FindBy(linkText = "Home")
    private WebElement homeBtn;

    @FindBy(linkText = "Shipping")
    private WebElement shippingBtn;

    @FindBy(linkText = "Contact us" )
    private WebElement contactUsBtn;

    @FindBy(linkText = "New!")
    private WebElement newBtn;

    @FindBy(linkText = "Coming soon")
    private WebElement comingSoonBtn;

    //Sign-In
    @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div[4]/div[1]/div/div[2]/div[3]/button/span")
    private WebElement singInBtn;

    @FindBy(id = "login-email")
    private WebElement loginMailInput;

    @FindBy(id = "login-password")
    private WebElement loginPasswordInput;

    public WebElement getHomeBtn() {
        return homeBtn;
    }

    public WebElement getShippingBtn() {
        return shippingBtn;
    }

    public WebElement getContactUsBtn() {
        return contactUsBtn;
    }

    public WebElement getNewBtn() {
        return newBtn;
    }

    public WebElement getComingSoonBtn() {
        return comingSoonBtn;
    }

    public WebElement getSingInBtn() {
        return singInBtn;
    }

    public WebElement getLoginMailInput() {
        return loginMailInput;
    }

    public WebElement getLoginPasswordInput() {
        return loginPasswordInput;
    }
}
