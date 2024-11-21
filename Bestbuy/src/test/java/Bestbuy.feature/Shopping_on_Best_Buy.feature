Feature: Shopping on Best Buy
  As a user
  I want to search for items and add them to my shopping cart
  @searchItem
  Scenario: Search for and add an item to the shopping cart
    Given I am on the Best Buy homepage
    When I search for "iphone16"
    And I add the first search result to the shopping cart
    Then I should see the item in my shopping cart
  @shopByDepartment
  Scenario: Select and add an item from Shop by Department
    Given I am on the Best Buy homepage
    When I navigate to "Shop by Department"
    And I select an item from the department
    And I add the item to the shopping cart
    Then I should see the item in my shopping cart
  @shopByBrand
  Scenario: Select and add an item from a Brand
    Given I am on the Best Buy homepage
    When I navigate to "Brands"
    And I select "Samsung" from the brands
    And I add the item to the shopping cart
    Then I should see the item in my shopping cart
