package com.endava.intership.Framework.PageObjects.HomePage;

import com.endava.intership.Framework.Infrastructure.Driver.*;
import com.endava.intership.Framework.PageObjects.DefaultPage.DefaultPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageOld extends DefaultPage {

    //Page url
    private final String HomePageUrl = "https://www.demoblaze.com/index.html";

    //Page elements
    @FindBy(xpath = "//*[@id='nava']")
    private WebElement navEmblemBtn;

    @FindBy(xpath = "/html/body/nav/div[1]/ul/li[1]/a")
    private WebElement homePageBtn;

    @FindBy(xpath = "/html/body/nav/div[1]/ul/li[2]/a")
    private WebElement contactBtn;

    @FindBy(xpath = "/html/body/nav/div[1]/ul/li[3]/a")
    private WebElement aboutUsBtn;

    @FindBy(xpath = "//*[@id='cartur']")
    private WebElement cartBtn;

    @FindBy(xpath = "//*[@id='login2']")
    private WebElement logInBtn;

    @FindBy(xpath = "/html/body/nav/div[2]/div/a[1]")
    private WebElement carouselPrevBtn;

    @FindBy(xpath = "/html/body/nav/div[2]/div/a[2]")
    private WebElement carouselNextBtn;

    @FindBy(xpath = "//*[@id='cat']")
    private WebElement categoriesBtn;

    @FindBy(xpath = "//*[@id='itemc']")
    private WebElement phonesBtn;

    @FindBy(css = "html body div#contcont.container div.row div.col-lg-3 div.list-group a#itemc.list-group-item")
    private WebElement laptopsBtn;

    @FindBy(css = "html body div#contcont.container div.row div.col-lg-3 div.list-group a#itemc.list-group-item")
    private WebElement monitorsBtn;

    @FindBy(xpath = "//*[@id='prev2']")
    private WebElement previousBtn;

    @FindBy(xpath = "//*[@id='next2']")
    private WebElement nextBtn;
    //Log in menu elements
    @FindBy(xpath = "//*[@id='loginusername']")
    private WebElement userNameInput;

    @FindBy(xpath = "//*[@id='loginpassword']")
    private WebElement userPasswordInput;

    @FindBy(xpath = "/html/body/div[3]/div/div/div[3]/button[1]")
    private WebElement closeLogInBtn;

    @FindBy(xpath = "/html/body/div[3]/div/div/div[3]/button[2]")
    private WebElement logInFromLogMenuBtn;

    @FindBy(xpath = "/html/body/div[3]/div/div/div[1]/button")
    private WebElement XBtn;

    //Sign up elements
    @FindBy(xpath = "//*[@id='sign-username']")
    private WebElement usernameInput;

    @FindBy(xpath = "//*[@id='sign-password']")
    private WebElement passwordInput;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[3]/button[2]")
    private WebElement logInFromSignInMenuBtn;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[3]/button[1]")
    private WebElement closeFromSignUpMenuBtn;
    Setup setup=new Setup();

    public HomePageOld(){
        WebDriver driver = setup.driver;
        PageFactory.initElements( driver, this );
    }

    void goToHomePage(){
        setup.driver.get( HomePageUrl );
        Wait wait = new Wait( setup.driver );
        wait.forLoading(5);
    }

    //getter  for webElements
    public WebElement getHomePageBtn() { return homePageBtn; }

    public WebElement getCartBtn() {
        return cartBtn;
    }

    public WebElement getLogInBtn() {
        return logInBtn;
    }

    public WebElement getAboutUsBtn() {
        return aboutUsBtn;
    }

    public WebElement getContactBtn() {
        return contactBtn;
    }

    public WebElement getNavEmblemBtn() {
        return navEmblemBtn;
    }

    public WebElement getCarouselPrevBtn() {
        return carouselPrevBtn;
    }

    public WebElement getCarouselNextBtn() {
        return carouselNextBtn;
    }

    public WebElement getCategoriesBtn() {
        return categoriesBtn;
    }

    public WebElement getPhonesBtn() {
        return phonesBtn;
    }

    public WebElement getLaptopsBtn() {
        return laptopsBtn;
    }

    public WebElement getMonitorsBtn() {
        return monitorsBtn;
    }

    public WebElement getPreviousBtn() {
        return previousBtn;
    }

    public WebElement getNextBtn() {
        return nextBtn;
    }

    public WebElement getUserNameInput() {
        return userNameInput;
    }

    public WebElement getUserPasswordInput() {
        return userPasswordInput;
    }

    public WebElement getCloseLogInBtn() {
        return closeLogInBtn;
    }

    public WebElement getLogInFromLogMenuBtn() {
        return logInFromLogMenuBtn;
    }

    public WebElement getXBtn() {
        return XBtn;
    }

    public WebElement getUsernameInput() {
        return usernameInput;
    }

    public WebElement getPasswordInput() {
        return passwordInput;
    }

    public WebElement getLogInFromSignInMenuBtn() {
        return logInFromSignInMenuBtn;
    }

    public WebElement getCloseFromSignUpMenuBtn() {
        return closeFromSignUpMenuBtn;
    }
}
