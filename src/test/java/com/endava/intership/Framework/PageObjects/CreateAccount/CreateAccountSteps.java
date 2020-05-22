package com.endava.intership.Framework.PageObjects.CreateAccount;

import com.endava.intership.Framework.Infrastructure.Driver.Setup;
import com.endava.intership.Framework.Infrastructure.Driver.Wait;
import com.endava.intership.Framework.Infrastructure.Helper.Navigation.Navigation;
import com.endava.intership.Framework.Infrastructure.Helper.Utility.JsonReader;
import com.endava.intership.Framework.Infrastructure.Helper.Utility.Resource;
import com.endava.intership.Framework.Infrastructure.Helper.Utility.User;
import com.endava.intership.Framework.PageObjects.DefaultPage.DefaultPage;
import com.fasterxml.jackson.core.type.TypeReference;
import com.google.common.collect.ClassToInstanceMap;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;


public class CreateAccountSteps extends DefaultPage {
    private final CreateAccount createAccount = new CreateAccount();
    private final Wait wait = new Wait(Setup.driver);
    private ClassToInstanceMap<Object> FileReaderManager;

    @Given("User is on homepage")
    public void userAccessPage() {
        Navigation.navigateTo("https://demostore.x-cart.com/");
    }

    @When("Sign in button is pressed")
    public void signInSingUpButtonIsPressed() {
        createAccount.getSignInButton().click();
    }

    ////////
    @Then("Sign in popup is displayed")
    public void signInPopupIsDisplayed() {
        Setup.driver.getWindowHandle();
    }

    @When("Creat new account link is pressed")
    public void linkIsPressed() {
        createAccount.getCreateAccountButton().click();
    }

    /////////
    @Then("Create Account pop-up is displayed")
    public void newAccountPopUpIsDisplayed() {
        Setup.driver.getWindowHandle();
    }

    @When("Email field is populated")
    public void fieldIsPopulatedWith() throws IOException {
        wait.forElementToBeDisplayed(5, createAccount.getEmailField(), "email");
        User[] users = JsonReader.fromJSON(new TypeReference<User[]>() {
        }, Resource.getResourcePath("testdata\\users.json"));
        createAccount.getEmailField().sendKeys(users[1].login);
    }

    @And("Password field is populated")
    public void passwordFieldIsPopulated() throws IOException {
        User[] users = JsonReader.fromJSON(new TypeReference<User[]>() {
        }, Resource.getResourcePath("testdata\\users.json"));
        createAccount.getPasswordField().sendKeys(users[1].password);
    }

    @And("Confirm password field is populated")
    public void confirmPasswordFieldIsPopulated() throws IOException {
        User[] users = JsonReader.fromJSON(new TypeReference<User[]>() {
        }, Resource.getResourcePath("testdata\\users.json"));
        createAccount.getConfirmPasswordField().sendKeys(users[1].confirmPassword);
    }

    @And("Creat button is pressed")
    public void creatButtonIsPressed() {
        createAccount.getCreateButton().click();
    }

    @Then("The success message appeared")
    public void myAccountPageIsDisplayed() {
        wait.forLoading(5);
        Setup.driver.getCurrentUrl().contains(createAccount.getWarningMessage());
    }

    @When("User logs out")
    public void userLogsOut() {
        createAccount.getSignInDropDown().click();
        Select clickDropDrawn = new Select(createAccount.getSignInDropDown());
        clickDropDrawn.selectByVisibleText("Log out");
    }

    @Then("Home page is displayed")
    public void homePageIsDisplayed() {
        Setup.driver.getCurrentUrl().contains(getHomeBtn().toString());
    }

    @When("New user logs in")
    public void newUserLogsIn() throws IOException {
        signInSingUpButtonIsPressed();
        wait.forElementToBeDisplayed(5, createAccount.getEmailField(), "email");
        User[] users = JsonReader.fromJSON(new TypeReference<User[]>() {
        }, Resource.getResourcePath("testdata\\users.json"));
        createAccount.getEmailField().sendKeys(users[1].login);
        createAccount.getPasswordField().sendKeys(users[1].password);
        createAccount.getLoginButton().click();
    }

    @Then("User is logged in")
    public void userIsLoggedIn() {
        wait.forLoading(5);
        Setup.driver.getCurrentUrl().contains("My account");
    }

}
