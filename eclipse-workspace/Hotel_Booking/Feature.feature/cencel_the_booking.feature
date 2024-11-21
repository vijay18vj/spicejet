
@tag
Feature: cencel the booking
As a user
i want to cencal my booking on the Adactin Hotel App!

  @tag1
  Scenario: booking cencel
    Given I click the my ltinerary botton
    And i cilck the hotel botton
    When I click the cencel selected bottom 
    And i click the ok botton from popup bar
    And i click the search botton
    Then I should be redirected again in to my The Adactin Hotel App homepage
    
