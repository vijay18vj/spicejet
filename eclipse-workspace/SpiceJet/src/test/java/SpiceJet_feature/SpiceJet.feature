Feature: Automated Testing of the SpiceJet Flight Booking System

  Scenario: Navigate to SpiceJet homepage
    Given I open the SpiceJet website

  Scenario: Sign-Up Validation
    Given I open the Sign-Up page
    When I fill in mandatory and non-mandatory fields
    Then I should see the sign-up success message

  Scenario: Login to SpiceJet
    Given I am on the SpiceJet homepage
    When I click the login button and enter dummy credentials
    Then I should see a login success or failure message

  Scenario: Search Flights (One-Way)
    Given I am on the SpiceJet homepage
    When I search for a one-way flight from "Delhi" to "Mumbai"
    Then I should see the search results for available flights

  Scenario: Book a Flight
    Given I have selected a flight
    When I proceed to the booking page
    And I fill in the passenger and payment information
    Then I should see the booking confirmation message