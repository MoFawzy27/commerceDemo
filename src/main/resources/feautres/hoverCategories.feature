Feature: hover

  Scenario: guest user could hover on random element
    Given User go to Home Page
    When  user select random element and hover on it
    And   user can select any random subcategory and click on it
    Then  user checks the page title equals to the subcategory

