
Feature: Register

  Scenario: guest user could register with valid data successfully
    Given user go to register page
    When  user select gender type
    And   user enter first name "automation" and last name "tester"
    And   User enters date of birth
    And   user enter email "test@example.com" field
    And   user fills Password fields "P@ssw0rd" "P@ssw0rd"
    And   User clicks on register button
    Then success message is displayed "Your registration completed"


