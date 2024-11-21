Feature: Main Menu Navigation
  As a user 
  I want to navigate through the main menu items

  @tag1
  Scenario: Navigate through main menu options
    Given I am on the Best Buy homepage
    When I click  main menu item
    Then Each page should display relevant content