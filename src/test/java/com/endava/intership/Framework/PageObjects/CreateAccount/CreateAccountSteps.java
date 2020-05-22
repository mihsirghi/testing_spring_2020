package com.endava.intership.Framework.PageObjects.CreateAccount;

import com.endava.intership.Framework.Infrastructure.Driver.Setup;
import com.endava.intership.Framework.Infrastructure.Driver.Wait;
import com.endava.intership.Framework.Infrastructure.Helper.Navigation.Navigation;
import com.endava.intership.Framework.Infrastructure.Helper.Utility.GenericData;
import com.endava.intership.Framework.PageObjects.DefaultPage.DefaultPage;
import com.endava.intership.Framework.PageObjects.UrlAddress;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

public class CreateAccountSteps extends DefaultPage {
    private final CreateAccount createAccount = new CreateAccount();
    GenericData genericData = new GenericData(createAccount);
    private final Wait wait = new Wait(Setup.driver);
    JavascriptExecutor scroll = (JavascriptExecutor) Setup.driver;

    @Given("User is on homepage")
    public void userIsOnHomePage() {
        Navigation.navigateTo(UrlAddress.homePage);
    }

    @When("{string} button is clicked")
    public void userClicksSignInButton(String arg0) {
        createAccount.getSignInBtn();
    }

    @Then("{string} is displayed")
    public void popUpisDisplayed(String element) {
        createAccount.getPopUp();
    }

    @When("{string} link is clicked")
    public void linkIsClicked(String arg0) {
        scroll.executeScript("window.scrollBy(0,1000)");
        createAccount.getCreateAccountBtn().click();
    }

    @Then("{string} create new account is displayed")
    public void newAccountPopUpIsDisplayed(String arg0) {
        Setup.driver.getWindowHandle();
    }

    @When("User enters {string} data in {string} field on {string} page")
    public void userEntersDataInFieldOnEmail(String input, String field, String page) throws IOException {
        genericData.enterTestData(input, field, page);
    }

    @And("{string} button from form is clicked")
    public void creatButtonIsPressed(String arg0) {
        createAccount.getCreateBtn().click();
    }

    @Then("The success message is displayed")
    public void myAccountPageIsDisplayed() {
        createAccount.getWarningMessage();
    }

    @Then("The error message is displayed")
    public void anErrorMessageIsDisplayed() {
        createAccount.getErrorMessage();
    }

    @Then("The email error message is displayed")
    public void theEmailErrorMessageIsDisplayed() {
        createAccount.getEmailErrorMessage();
    }

    @And("The fields are cleared")
    public void theFieldsIsCleared() {
        createAccount.getCloseErrorMessage().click();
        createAccount.getEmailField().clear();
        createAccount.getPasswordField().clear();
        createAccount.getConfirmPasswordField().clear();
    }

    //test3
    @When("User clicks on the preferences menu button after scroll")
    public void userClicksOnLoginButtonAfterScroll() {
        scroll.executeScript("window.scrollBy(0,1000)");
        new WebDriverWait(Setup.driver, 5).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='header']/div[2]/a")));
        createAccount.getPreferencesMenuButtton().click();
    }

    @Then("{string} is expanded")
    public void preferencesMenuDisplayed(String arg0) {
        createAccount.menuIsDisplayed();
    }

    @When("User clicks on {string} button from preferences menu")
    public void userClicksOnButtonFromPreferencesMenu(String arg0) {
        createAccount.getSignInBtnFrompreferencesMenuBottton().click();
    }
}
