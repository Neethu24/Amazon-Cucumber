
Feature: Amazon product search and select feature
  Scenario: Login Page
    Given User has to be in login page
    When User has to type valid user name and continue
    And User has to type valid password and login
    Then User should be redirected to Amazon HomePage
    When User Searches for product and number of product matched
    And User select product with least price
    Then Add to cart and take snapshot

