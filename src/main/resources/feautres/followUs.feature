Feature: follow us

  Scenario: user opens facebook link
    Given User go to Home Page
    When  user opens facebook link 'facebook'
    Then  'https://www.facebook.com/nopCommerce' is opened in new tab

  Scenario: user opens twitter link
    Given User go to Home Page
    When  user opens facebook link 'twitter'
    Then  'https://twitter.com/nopCommerce' is opened in new tab

  Scenario: user opens rss link
    Given User go to Home Page
    When  user opens facebook link 'rss'
    Then  '/news/rss/1' is opened in new tab

  Scenario: user opens youtube link
    Given User go to Home Page
    When  user opens facebook link 'youtube'
    Then  'http://www.youtube.com/user/nopCommerce' is opened in new tab
