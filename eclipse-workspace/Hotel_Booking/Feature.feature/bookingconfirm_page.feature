
@tag
Feature: booking confirm
  As a user 
i want to confirm my booking to The Adactin Hotel App!e

  @tag1
  Scenario: confirm my booking
    Given I enter first name and lastname
    And i  enter address 
    When I enter card number and card type
    And i enter card Expiry Date and CVV Number
    And i click Book Now button
    Then  I should be redirected to  The Adactin Hotel App Booking Confirmation
   

  
