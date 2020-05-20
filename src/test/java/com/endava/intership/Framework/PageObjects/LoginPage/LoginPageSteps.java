package com.endava.intership.Framework.PageObjects.LoginPage;

import com.endava.intership.Framework.Infrastructure.Driver.Setup;
import com.endava.intership.Framework.Infrastructure.Driver.Wait;
import com.endava.intership.Framework.Infrastructure.Helper.Navigation.Navigation;
import com.endava.intership.Framework.Infrastructure.Helper.Utility.JsonReader;
import com.endava.intership.Framework.Infrastructure.Helper.Utility.Resource;
import com.endava.intership.Framework.Infrastructure.Helper.Utility.User;
import com.fasterxml.jackson.core.type.TypeReference;
import com.google.common.collect.ClassToInstanceMap;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

public class LoginPageSteps {
    private final LoginPage loginPage = new LoginPage();
    private final Wait wait = new Wait(Setup.driver);
    private ClassToInstanceMap<Object> FileReaderManager;

    @Given("User is on homepage")
    public void userAccessPage() {
        Navigation.navigateTo("https://demostore.x-cart.com/");
    }

    @When("User clicks on Login button")
    public void userClicksLoginButton() {
        new WebDriverWait(Setup.driver, 20).until(ExpectedConditions.elementToBeClickable(loginPage.getLoginButton())).click();
    }

    @Then("Button is clicked")
    public void buttonIsClicked() {
    }

    @When("User fills Email field")
    public void userFillsEmailFieldWithEmail() throws IOException {
        wait.forElementToBeDisplayed(5, loginPage.getEmailField(), "email");
        User[] users = JsonReader.fromJSON(new TypeReference<User[]>() {}, Resource.getResourcePath( "testdata\\users.json" ));
        loginPage.getEmailField().sendKeys(users[0].login);
    }

    @And("User fills Password field")
    public void userFillsPasswordFieldWithPassword() throws IOException {
        User[] users = JsonReader.fromJSON(new TypeReference<User[]>() {}, Resource.getResourcePath( "testdata\\users.json" ));
        loginPage.getPasswordField().sendKeys(users[0].password);
    }

    @And("User clicks on Sign In button")
    public void userClicksOnSignInButton() {
        wait.forLoading(7);
        loginPage.getSignInBtn().click();
    }

    @Then("User is logged in")
    public void userIsLoggedIn() {
        wait.forLoading(10);
        Setup.driver.getCurrentUrl().contains("My account");
    }
}
