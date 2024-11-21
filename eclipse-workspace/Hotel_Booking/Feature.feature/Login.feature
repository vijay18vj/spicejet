@tag
Feature: Adactin Hotel App! login
As a user 
i want to log in to The Adactin Hotel App!
   @tag1
  Scenario: validate the login credentials
    Given i am on the Adactin Hotel App! login page
    And i enter username and pass word
    When  i cick the login button
    Then I should be redirected to my The Adactin Hotel App! homepage
  

  
