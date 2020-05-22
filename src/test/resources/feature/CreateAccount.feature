Feature: Create account functionality

  Background:
    Given User is on homepage

  @Positive1
  Scenario: Verify that user can creat account with valid credentials

    When "Sign in" button is clicked
    Then "Pop up" is displayed
    When "Create new account" link is clicked
    Then "Pop-up" create new account is displayed
    When User enters "valid email" data in "email" field on "Register" page
    And User enters "valid password" data in "password" field on "Register" page
    And User enters "valid confirm password" data in "confirm password" field on "Register" page
    And "Create new account" button from form is clicked
    Then The success message is displayed

  @Negative
  Scenario: Verify that user can't creat account with invalid credentials

    When "Sign in" button is clicked
    Then "Pop up" is displayed
    When "Create new account" link is clicked
    Then "Pop-up" create new account is displayed
    When User enters "valid email" data in "email" field on "Register" page
    And User enters "invalid password" data in "password" field on "Register" page
    And User enters "invalid confirm password" data in "confirm password" field on "Register" page
    And "Create new account" button from form is clicked
    Then The error message is displayed
    When The fields are cleared
    And User enters "invalid email" data in "email" field on "Register" page
    And User enters "valid password" data in "password" field on "Register" page
    And User enters "valid confirm password" data in "confirm password" field on "Register" page
    And "Create new account" button from form is clicked
    Then The email error message is displayed


   @Positive2
   Scenario: Verify the creating account with valid data clicking on menu button on the top right

    When User clicks on the preferences menu button after scroll
    Then "Preferences menu" is expanded
    When User clicks on "Sign in" button from preferences menu
    Then "Pop up" is displayed
    When "Create new account" link is clicked
    Then "Pop-up" create new account is displayed
    When User enters "valid email" data in "email" field on "Register" page
    And User enters "valid password" data in "password" field on "Register" page
    And User enters "valid confirm password" data in "confirm password" field on "Register" page
    And "Create new account" button from form is clicked
    Then The success message is displayed




















