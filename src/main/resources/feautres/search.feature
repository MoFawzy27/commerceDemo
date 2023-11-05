@smoke
  Feature: search
    Scenario Outline: User searches about items
      Given User go to Home Page
      When  user could search using product name "<product name>"
      And  user clicks on search button
      And  user checks the number of the items <number>
      Then user checks product word "<product name>" in the items

      Examples:
      | product name | number | product name |
      |    book      |    6   |    book      |
      |    laptop    |    2   |   laptop     |
      |    nike      |    3   |    nike      |

    Scenario Outline: User searches about items with sku
      Given User go to Home Page
      When  user could search using product sku "<sku>"
      And   user clicks on search button
      And   user clicks on the showed product
      Then  user checks the product contains the sku "<sku>"


      Examples:
        |     sku      |
        |  AP_MBP_13   |

