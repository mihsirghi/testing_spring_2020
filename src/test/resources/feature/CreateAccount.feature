Feature: Create account functionality

  Background: User is on homepage

  @Random_test
  Scenario: Verify that user can creat account with valid inputs

    When "Sign in" button is clicked
    Then Sign in popup is displayed
    When "Creat new account" link is clicked
    Then "Pop-up" is displayed
    When "Email" field is populated
    And Password field is populated
    And Confirm password field is populated
    And Creat button is pressed
    Then The success message appeared
    When User logs out
    Then Home page is displayed
    When New user logs in
    Then User is logged in








