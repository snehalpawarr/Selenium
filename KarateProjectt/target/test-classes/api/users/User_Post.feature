Feature: Post method for adding user

@execute 
  Scenario: Add User details 
    Given url baseURL
    And path 'users'
    And request
      """
      	{
    			"name": "morpheus",
    			"job": "leader"
				}
      """
    When method POST
    Then status 201
    
@execute 
  Scenario: Post method for Register-Successfull 
    Given url baseURL
    And path 'register'
    And request {"email":"eve.holt@reqres.in","password":"pistol"}
    When method POST
    Then status 200
    
@execute 
  Scenario: Post method for Register-Unsuccessfull 
    Given url baseURL
    And path 'register'
    And request {"email":"sydney@fife"}
    When method POST
    Then status 400
   
    
@execute 
  Scenario: Post method for Login-Successfull 
    Given url baseURL
    And path 'login'
    And request {"email":"eve.holt@reqres.in","password":"cityslicka"}
    When method POST
    Then status 200
    
@execute 
  Scenario: Post method for Login-Unsuccessfull 
    Given url baseURL
    And path 'login'
    And request {"email":"peter@klaven"}
    When method POST
    Then status 400