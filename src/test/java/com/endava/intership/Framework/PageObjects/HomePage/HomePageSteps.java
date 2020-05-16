package com.endava.intership.Framework.PageObjects.HomePage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;

public class HomePageSteps {
    private final HomePage homePage = new HomePage();

    @Given( "^A user navigates to HomePage" )
    public void aUserNavigatesToHomePage(){ this.homePage.goToHomePage();}

    @Then( "^Page title is \"([^\"]*)\"$" )
    public void pageTitle(String title){this.homePage.checkTitle( title );}

    @Then( "^The cart button is clicked" )
    public void theCartButtonIsClicked(){homePage.getCartBtn().click();}

    @Then("^Home button is clicked")
    public void homeButtonIsClicked(){homePage.getHomePageBtn().click();}

    @And("^The title is")
    public void theTitleIsString() {
        homePage.checkTitle( "STORE" );
    }
}
