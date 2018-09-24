#Author: your.mitraacity26@gmail.com
#Summary :This is to test a negative functionality in Contact Us page
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation

@AcceptanceTest
  Feature: Negative - Contact Us Page under About
  As an end user
  I want a contact us page
  So that I can find out more about toolsqa exciting services!!

  Scenario: Navigate to Contact us page
    Given I am on the toolsqa Site
    When I click on Contact us option under About
    Then I should be navigated to Contact us page
    
   Scenario: Valid Submission
   		
   	Given I am on Contact us page of toolsqa Site
    When I enter following information in the page
      | name    | j.blogger                                 |
      | email   | j.Blogger@toolsqa.com                     |
      | message | please contact me I want to find out more |
   
   And Click on Send button
    Then I should get an error message