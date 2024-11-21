Feature: Checkout and Order Confirmation
  As a user
  I want to complete the checkout process on Best Buy
  So that I can place an order successfully and see a confirmation
 @checkout
  Scenario: Place an order with dummy payment information
    Given I am on my cart page
    When I proceed to the checkout page
    And I fill out the form with dummy payment information
    And  I can place an order successfully and see a confirmation
    Then I  close the web browser