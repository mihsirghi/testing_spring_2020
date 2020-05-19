package com.endava.intership.Framework.PageObjects.DefaultPage;

import com.endava.intership.Framework.Infrastructure.Helper.Navigation.Button;
import com.endava.intership.Framework.Infrastructure.Helper.Utility.Generics;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;

import java.util.InputMismatchException;

public class DefaultSteps {

    public DefaultSteps () {}

    @And("User Clicks {string} on Navigation Bar")
    public void navigationBarClick (String button) {
        if ( Generics.isElementPresent( By.linkText( button ) ) ) {
            Button.clickButton( By.linkText( button ) );
        } else throw new InputMismatchException( "No such element" );
    }

}
