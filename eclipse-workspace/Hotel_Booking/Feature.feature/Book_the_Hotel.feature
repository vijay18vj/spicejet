
@tag
Feature: Booking the hotel
As a user 
i want book the hotel to The Adactin Hotel App!

  @tag1
  Scenario: Book the Hotel
    Given I enter location and hotel name
    And i enter room type and no of rooms
    When i enter checkin and check out date
    And i enter Adults per Room	and Children per Room
    And i click search button
    Then I should be redirected to my The Adactin Hotel App  select hotel page
    
