Feature: Login functionality

  @Random_test
  Scenario: Verify the logging in with existent user

    Given User is on homepage
    When User clicks on Login button
    Then Button is clicked
    When User fills Email field
    And User fills Password field
    And User clicks on Sign In button
    Then User is logged in







