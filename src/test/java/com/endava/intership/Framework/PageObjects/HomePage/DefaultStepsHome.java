package com.endava.intership.Framework.PageObjects.HomePage;

import com.endava.intership.Framework.Infrastructure.Helper.Navigation.Navigation;
import io.cucumber.java.en.Given;

public class DefaultStepsHome {

    private final HomePage homePage = new HomePage();

    @Given("User is on homepage")
    public void userIsOnHomePage() {
        Navigation.navigateTo( "https://demostore.x-cart.com/" );
    }
}
