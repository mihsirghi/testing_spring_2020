package com.endava.intership.Framework.PageObjects.CartPage;

import com.endava.intership.Framework.Infrastructure.Driver.Setup;
import com.endava.intership.Framework.Infrastructure.Driver.Wait;
import com.endava.intership.Framework.PageObjects.DefaultPage.DefaultPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage extends DefaultPage {
    //Page Url
    private static final String cartPageUrl = "https://www.demoblaze.com/cart.html";
    Setup setup= new Setup();

    //Page elements
    @FindBy(xpath = "/html/body/nav/div/div/ul/li[2]/a")
    private WebElement contactBtn;

    @FindBy(xpath = "//*[@id='nava']")
    private WebElement navEmblemBtn;

    @FindBy(xpath = "/html/body/nav/div[1]/ul/li[1]/a")
    private WebElement homePageBtn;

    @FindBy(xpath = "/html/body/nav/div[1]/ul/li[3]/a")
    private WebElement aboutUsBtn;

    @FindBy(xpath = "//*[@id='cartur']")
    private WebElement cartBtn;

    @FindBy(xpath = "//*[@id='login2']")
    private WebElement logInBtn;

    @FindBy(xpath = "//*[@id='signin2']")
    private WebElement signInBtn;

    @FindBy(xpath = "/html/body/div[6]/div/div[2]/button")
    private WebElement placeOrderBtn;

    public CartPage(){
        WebDriver driver = setup.driver;
        PageFactory.initElements( driver, this );
    }

    public void goCartPage(){
        setup.driver.get( cartPageUrl );
        Wait wait = new Wait( setup.driver );
        wait.forLoading(5);
    }


    //Getters for WebElements
    public WebElement getContactBtn() { return contactBtn; }

    public WebElement getNavEmblemBtn() { return navEmblemBtn; }

    public WebElement getHomePageBtn() { return homePageBtn; }

    public WebElement getAboutUsBtn() { return aboutUsBtn; }

    public WebElement getCartBtn() { return cartBtn; }

    public WebElement getLogInBtn() { return logInBtn; }

    public WebElement getSignInBtn() { return signInBtn; }

    public WebElement getPlaceOrderBtn() { return placeOrderBtn; }
}
