Feature: Whishlist

  Scenario: user check whishlist
    Given User go to Home Page
    When  user clicks on whishlist button found in the product
    Then  Success message appears to the user "The product has been added to your wishlist" with green color

  Scenario: user check quantity whishlist
    Given User go to Home Page
    When  user clicks on whishlist button in the product
    And   User clicks on whishlist button beside login button after the success message disappear
    Then  user checks that the quantity is bigger than zero
