@smoke
Feature: currencies

  Scenario: user checks Euro currency from the dropdown list on the top left of home page

    Given User go to Home Page
    When  user select euro currency from the dropdown list
    Then  user verifies Euro Symbol is shown on the products displayed in Home page

