package com.endava.intership.Framework.PageObjects.HomePage;

import com.endava.intership.Framework.Infrastructure.Driver.Setup;
import com.endava.intership.Framework.Infrastructure.Driver.Wait;
import com.endava.intership.Framework.Infrastructure.Helper.Navigation.Navigation;
import com.endava.intership.Framework.PageObjects.DefaultPage.DefaultSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class HomePageSteps {

    private DefaultSteps defaultSteps;


    private final HomePage homePage = new HomePage();
    private final Wait wait = new Wait( Setup.driver );

    @Given("User is on homepage")
    public void userIsOnHomePage() {
        Navigation.navigateTo( "https://demostore.x-cart.com/" );
    }

    @Then("Coming soon is clicked")
    public void comingSoonIsClicked() {
        this.homePage.getContactUsBtn().click();
    }

    @And("Home page is clicked")
    public void homePageIsClicked() {
        this.homePage.getHomeBtn().click();
    }

    @And("Sign in is clicked")
    public void signInIsClicked() {
        this.homePage.getSingInBtn().click();
    }

    @And("{string} is entered")
    public void isEntered(String mail) throws InterruptedException {

        this.wait.forElementToBeDisplayed( 10, homePage.getLoginMailInput(), mail );
        this.homePage.getLoginMailInput().sendKeys( mail );
    }

    @And("{string} are entered")
    public void inputEntered(String password) {
        this.homePage.getLoginPasswordInput().sendKeys( password );
    }

}
