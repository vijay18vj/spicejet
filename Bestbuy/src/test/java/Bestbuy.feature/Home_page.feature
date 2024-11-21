@tag
Feature:  Homepage URL Validation
    As a user of the Best Buy website
  I want to ensure the homepage URL is correct
  So that I can confirm the site loads as expected
 @tag1
  Scenario: Validate the Best Buy homepage URL
    Given I open the Best Buy homepage
    Then The URL should be "https://www.bestbuy.com/"
    
 
