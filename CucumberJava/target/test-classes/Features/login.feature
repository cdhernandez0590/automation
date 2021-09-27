@tag
Feature: Feature to test Spend and Save Functionality

  @tag1
  Scenario: Check user is redirected to Spend and Save Page upo clicking the link
    Given User is on Home Page
    When User clicks on Save and Spend link    
    Then User should be redirected to Spend and Save page
  @tag2
  Scenario: Check user is  able to see two card products
  Given User is in HomePage
  When clicks the SaveAndSpend link
  Then User should be redirected to Spend and Save page
  And User should be able to visualize two card products
    