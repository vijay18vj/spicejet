@tag
Feature:   Login Functionality
  As a user 
  I want to log in to my account on Best Buy
  @tag1
  Scenario:  Login with valid and invalid credentials
    Given I navigate to the login page
    When I enter email "<email>" and password "<password>"
    And I click the submit button
    Then I should see "<expectedMessage>"
 
