package com.endava.intership.Framework.PageObjects.LoginPage;

import com.endava.intership.Framework.Infrastructure.Driver.Setup;
import com.endava.intership.Framework.Infrastructure.Driver.Wait;
import com.endava.intership.Framework.Infrastructure.Helper.Navigation.Navigation;
import com.endava.intership.Framework.Infrastructure.Helper.Utility.GenericData;
import com.endava.intership.Framework.PageObjects.UrlAddress;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;

public class LoginPageSteps {
    private final LoginPage loginPage = new LoginPage();
    private final Wait wait = new Wait(Setup.driver);
    JavascriptExecutor scroll = (JavascriptExecutor) Setup.driver;
    Actions actions = new Actions(Setup.driver);
    GenericData genericData = new GenericData(loginPage);

    @Given("User is on homepage")
    public void userIsOnHomePage() {
        Navigation.navigateTo(UrlAddress.homePage);
    }

    @When("User clicks on Login button")
    public void userClicksSignInButton() {
        loginPage.getSignInButton();
    }

    @When("User enters {string} data in {string} field on {string} page")
    public void userFillsField(String input, String field, String page) throws IOException {
        genericData.enterTestData(input, field, page);
    }

    @When("User clicks on the preferences menu button after scroll")
    public void userClicksOnLoginButtonAfterScroll() {
        JavascriptExecutor scroll = (JavascriptExecutor) Setup.driver;
        scroll.executeScript("window.scrollBy(0,1000)");
        loginPage.getPreferencesMenuButtton();
    }

    @When("User clicks on {string} button from preferences menu")
    public void userClicksOnButtonFromPreferencesMenu(String arg0) {
        loginPage.getSignInBtnFromPreferencesMenuBtn().click();
    }

    @When("User clicks on add {string}")
    public void userClicksOnAdd(String arg0) {
        scroll.executeScript("window.scrollBy(0,750)");
        actions.moveToElement(loginPage.getProduct()).build().perform();
        actions.moveToElement(loginPage.getAddBtn()).build().perform();
        loginPage.getAddBtn().click();
    }

    @When("{string} button is clicked by user")
    public void checkootButtonIsClick(String arg0) {
        loginPage.getCheckoutBtn().click();
    }

    @And("User enters {string} data in {string} field in {string} page")
    public void userEntersDataInFieldOnPage(String input, String field, String page) throws IOException {
        genericData.enterTestData(input, field, page);
    }

    @And("{string} button is clicked")
    public void userClicksOnSignInButton(String element) {
        wait.forLoading(7);
        loginPage.getSignInBtn().click();
    }

    @Then("{string} is displayed")
    public void popUpisDisplayed(String element) {
        loginPage.getPopUp();
    }

    @Then("User is logged in")
    public void userIsLoggedIn() {
        wait.forLoading(10);
        Setup.driver.getPageSource().contains("My account");
    }

    @Then("the error message is displayed")
    public void theErrorMessageIsDisplayed() {
        loginPage.errorMessageDisplayed();
    }

    @Then("{string} is expanded")
    public void preferencesMenuDisplayed(String arg0) {
        loginPage.preferencesMenuDisplayed();
    }

    @Then("{string} with {string} button is displayed")
    public void popUpWithCheckoutButtonIsDisplay(String arg0, String arg1) {
        loginPage.checkoutBtn();
    }

    @Then("{string} form is displayed")
    public void formIsDisplayeddd(String arg0) {
        Setup.driver.getCurrentUrl().contains("Log in to your account");
    }
}
