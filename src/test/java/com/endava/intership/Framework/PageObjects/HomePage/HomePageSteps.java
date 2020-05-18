package com.endava.intership.Framework.PageObjects.HomePage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class HomePageSteps {
    private final HomePageOld homePageOld = new HomePageOld();

    @Given( "^A user navigates to HomePage" )
    public void aUserNavigatesToHomePage(){ this.homePageOld.goToHomePage();}

    @Then( "^Page title is \"([^\"]*)\"$" )
    public void pageTitle(String title){this.homePageOld.checkTitle( title );}

    @Then( "^The cart button is clicked" )
    public void theCartButtonIsClicked(){
        homePageOld.getCartBtn().click();}

    @Then("^Home button is clicked")
    public void homeButtonIsClicked(){
        homePageOld.getHomePageBtn().click();}

    @And("^The title is")
    public void theTitleIsString() {
        homePageOld.checkTitle( "STORE" );
    }


}
