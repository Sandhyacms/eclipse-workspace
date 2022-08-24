Feature: Salesforce login page to be tested
Scenario: Verify the login with valid username and password
Given User is on Salesforce login page
Then User enters username "admin123@gmail.com"
And Enters password "admin123"
Then Click on Login Button 


Scenario Outline:: Verify the login with valid username and password
Given User is on Salesforce login page
Then User enters username "<username"
And Enters password "<password>"
Then Click on Login Button 

Examples: 
|username|password|
|admin1234@gmail.com|admin123|
|user1234@gmail.com|user123|
|admin1235@gmail.com|admin123|
|user1235@gmail.com|user123|






















