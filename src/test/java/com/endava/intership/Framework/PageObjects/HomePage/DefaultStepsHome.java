package com.endava.intership.Framework.PageObjects.HomePage;

import com.endava.intership.Framework.Infrastructure.Helper.Navigation.Navigation;
import io.cucumber.java.en.Given;

public class DefaultStepsHome {

    private final HomePage homePage = new HomePage();
    Navigation navigation=new Navigation();

    @Given("User is on homepage")
    public void userIsOnHomePage() {
        navigation.navigateTo( "https://demostore.x-cart.com/" );
    }
}
