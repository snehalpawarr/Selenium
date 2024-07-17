Feature: Open New Account

Scenario: Successfull account creation
Given User is loged in to ParaBank homepage
When User navigate to the open new account page
And select Account type 
And submit the request
Then User should get the new account number
And Successfull account creation message should be displayed 
 