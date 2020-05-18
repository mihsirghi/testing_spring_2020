Feature: Home button

  @Random_test
  Scenario Outline: Testing the page
    Given User is on homepage
    Then Coming soon is clicked
    And Home page is clicked
    And Sign in is clicked
    And "<mail>" is entered
    And "<password>" are entered

    Examples:
      | mail | password |
      | test@mail.com | teststuff |
