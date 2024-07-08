Feature: Home Page

  @navigate
  Scenario: Verify Home page title is displayed
    Given User laumches Chrome browser
    When User opens ilcarro Home Page
    Then User verifies Home page title is displayed
    And User quits browser