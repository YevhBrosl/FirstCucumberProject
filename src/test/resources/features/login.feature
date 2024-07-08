Feature: Login

  @validData
  Scenario: Login with valid data
    Given User laumches Chrome browser
    When User opens ilcarro Home Page
    And User clicks on Log in link
    And User enters valid data
    And User clicks on Yalla button
    Then User verifies Success Message is displayed
    And User clicks on the Ok button
    And User quits browser

  @invalidPassword
  Scenario Outline: Login with valid email and invalid password
    Given User laumches Chrome browser
    When User opens ilcarro Home Page
    And User clicks on Log in link
    And User enters valid email and invalid password
      | email   | password   |
      | <email> | <password> |
    And User clicks on Yalla button
    Then User verifies Error Message is displayed
    And User quits browser
    Examples:
      | email          | password |
      | wooster@gm.com | Qwerty11 |
      | wooster@gm.com | qwerty1! |
      | wooster@gm.com | QWERTY1! |
      | wooster@gm.com | Qwerty!! |
