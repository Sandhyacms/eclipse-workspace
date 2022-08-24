Feature: Salesforce Login Feature to be tested

Background: Run this step before every senario
Given User is on Salesforce login page



@smoke
Scenario: Verify the login with valid username and password

Then User enters username "diffrent123@gmail.com"
And Enters password "diffrent123"
Then Click on RememberMe Checkbox
Then Click on Login Button 

@regression   @functional  @May-134 @smoke
Scenario: Verify the login with valid username and password
Then User enters username "admin123@gmail.com"
And Enters password "admin123"
Then Click on Login Button 























