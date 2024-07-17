Feature: SwagLabs Login feature
 Login feature allows user to login into Swag Labs portal



	Scenario: User is trying to login to SwagLabs using invalid credentials
		Given User is on Swag Labs login page
		When  User enter wrong credentials 
		|userName | password |
		|SnehalP| Mav432|
		And click on login
		Then 'Epic sadface: Username and password do not match any user in this service' message should display	
		
		
	Scenario: User is trying to login to SwagLabs using valid credentials
		Given User is on Swag Labs login page
		When  User enter valid credentials 
		|userName | password |
		|standard_user| secret_sauce|
		And click on login
		Then user should be able to view Swag Labs home page
		
	