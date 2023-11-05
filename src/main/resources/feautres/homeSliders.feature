Feature: hover

  Scenario: guest user clicks on first homeslider and navigate to the page containing the slider component
    Given User go to Home Page
    When  user clicks on the first slider
    Then  user is navigated to the page containing the slider component

  Scenario: guest user clicks on second homeslider and navigate to the page containing the slider component
    Given User go to Home Page
    When  user clicks on the second slider
    Then  user is navigated to the page containing the slider component

