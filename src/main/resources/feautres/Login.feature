@smoke
Feature: Login

  Scenario:  user could login with valid email and password

    Given User go to Home Page
    When  user clicks on login tab
    And   user login with "test@example.com" and "P@ssw0rd"
    And   user press on login button
    Then  user login to the system successfully

  Scenario: user could login with invalid email and password

    Given User go to Home Page
    When  user clicks on login tab
    And   user login with "wrong@example.com" and "P@ssw0rd"
    And   user press on login button
    Then  user could not login to the system

