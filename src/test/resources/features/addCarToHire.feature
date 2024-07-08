Feature: Add Car

  @addCar
  Scenario: Add a car to a for rent list
    Given User laumches Chrome browser
    When User opens ilcarro Home Page
    And User clicks on Log in link
    And User enters valid data
    And User clicks on Yalla button
    Then User verifies Success Message is displayed
    And User clicks on the Ok button
    And User clicks on the Let the car work link
    And User selects the location
#    And User fills out the car details form with valid data
#    And User clicks on the submit button
#    Then User verifies Success Message is displayed
#    And User quits browser