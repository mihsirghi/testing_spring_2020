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
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

public class LoginPageTemplate {
    private final LoginPage loginPage = new LoginPage();
    private final Wait wait = new Wait(Setup.driver);

    @Given("User is on homepage")
    public void userIsOnHomePage() {
        Navigation.navigateTo(UrlAddress.homePage);
    }

    @When("User clicks on Login button")
    public void userClicksSignInButton() {
        new WebDriverWait(Setup.driver, 5).until(ExpectedConditions.elementToBeClickable(loginPage.getSignInButton())).click();
    }

    @Then("{string} is displayed")
    public void popUpisDisplayed(String element) {
        new WebDriverWait(Setup.driver, 5).until(ExpectedConditions.visibilityOf(loginPage.getPopUp()));
    }

    @When("User enters {string} data in {string} field on {string} page")
    public void userFillsField(String input, String field, String page) throws IOException {
        GenericData genericData = new GenericData(loginPage);
        genericData.enterTestData(input, field, page);
    }

    @And("User enters {string} data in {string} field in {string} page")
    public void userEntersDataInFieldOnPage(String input, String field, String page) throws IOException {
        GenericData genericData = new GenericData(loginPage);
        genericData.enterTestData(input, field, page);
    }

    @And("{string} button is clicked")
    public void userClicksOnSignInButton(String element) {
        wait.forLoading(7);
        loginPage.getSignInBtn().click();
    }

    @Then("User is logged in")
    public void userIsLoggedIn() {
        wait.forLoading(10);
        Setup.driver.getCurrentUrl().contains("My account");
    }

    @Then("The error message is displayed")
    public void theErrorMessageIsDisplayed() {
        new WebDriverWait(Setup.driver, 5).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ui-dialog:not([style*=\"display: none\"]) table > tbody > tr > td > div.form-error")));
    }

    //test 3
    @When("User clicks on the preferences menu button after scroll")
    public void userClicksOnLoginButtonAfterScroll() {
        JavascriptExecutor scroll = (JavascriptExecutor) Setup.driver;
        scroll.executeScript("window.scrollBy(0,1000)");
        new WebDriverWait(Setup.driver, 5).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='header']/div[2]/a")));
        loginPage.getPreferencesMenuButtton().click();
    }

    @Then("{string} is expanded")
    public void preferencesMenuDisplayed(String arg0) {
        new WebDriverWait(Setup.driver, 5).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.header_settings.dropdown.open > div")));
    }

    @When("User clicks on {string} button from preferences menu")
    public void userClicksOnButtonFromPreferencesMenu(String arg0) {
        loginPage.getSignInButtonFrompreferencesMenuBottton().click();
    }

    //test4
    @When("User clicks on add {string}")
    public void userClicksOnAdd(String arg0) {
        JavascriptExecutor scroll = (JavascriptExecutor) Setup.driver;
        scroll.executeScript("window.scrollBy(0,750)");
        Actions actions = new Actions(Setup.driver);
        actions.moveToElement(loginPage.getProduct()).build().perform();
        new WebDriverWait(Setup.driver, 5).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='content']/div/div/div[4]/div/div/div/ul/li[1]/div/div[2]/div[3]/div[1]/button/span")));
        actions.moveToElement(loginPage.getAddButton()).build().perform();
        loginPage.getAddButton().click();
    }

    @Then("{string} with {string} button is displayed")
    public void withButtonIsDisplay(String arg0, String arg1) {
        new WebDriverWait(Setup.driver, 5).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.ui-dialog.ui-corner-all.ui-widget.ui-widget-content.ui-front.default-dialog.has-title.add2cartpopup")));
    }

    @When("{string} button is clicked by user")
    public void checkootButtonIsClick(String arg0) {
        loginPage.getCheckoutBtn().click();
    }

    @Then("{string} form is displayed")
    public void formIsDisplayeddd(String arg0) {
        Setup.driver.getCurrentUrl().contains("Log in to your account");
    }

}
/*
Feature: Login functionality

        Background:
        Given User is on homepage

@Test1
  Scenario: Verify the logging in with valid credentials

          When User clicks on Login button
          Then "Pop up" is displayed
          When User enters "valid email" data in "email" field on "Log in" page
          And User enters "valid password" data in "password" field on "Log in" page
          And "Sign in" button is clicked
          Then User is logged in

@Test2
  Scenario: Verify the logging in with un-existent user is not possible

          When User clicks on Login button
          Then "Pop up" is displayed
          When User enters "invalid email" data in "email" field on "Log in" page
          And User enters "invalid password" data in "password" field on "Log in" page
          And "Sign in" button is clicked
          Then The error message is displayed

@Test3
  Scenario: Verify the logging in clicking on menu button on the top right

          When User clicks on the preferences menu button after scroll
          Then "Preferences menu" is expanded
          When User clicks on "Sign in" button from preferences menu
          Then "Pop up" is displayed
          When User enters "valid email" data in "email" field on "Log in" page
          And User enters "valid password" data in "password" field on "Log in" page
          And "Sign in" button is clicked
          Then User is logged in

@Test4
  Scenario: Verify the logging in  with valid data after clicking on checkout button

          When User clicks on add "product"
          Then "Pop up" with "Checkout" button is displayed
          When "Checkout" button is clicked by user
          Then "Log in" form is displayed
          When User enters "valid email" data in "email" field on "Log in" page
          And User enters "valid password" data in "password" field on "Log in" page
          And  "Sign in" button is clicked
          Then  User is logged in*/
















