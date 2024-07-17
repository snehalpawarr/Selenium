Feature: Online Fake API-Airlines-Get
 
@execute
Scenario: Get all user details
Given url baseURL
And path 'users'
And param page = 2
When method GET
Then status 200

@execute
Scenario: Get specific user details by id
Given url baseURL
And path 'users/2'
When method GET
Then status 200

 
 
@execute
Scenario: Get empty user details
Given url baseURL
And path 'users/23'
When method GET
Then status 404
 
 
@execute
Scenario: Get delaying user details
Given url baseURL
And path 'users'
And param delay = 3
When method GET
Then status 200


@execute
Scenario: Get List of resources
Given url baseURL
And path 'unknown'
When method GET
Then status 200


@execute
Scenario: Get single resource
Given url baseURL
And path 'unknown/2'
When method GET
Then status 200



@execute
Scenario: Get single resource(Not Found)
Given url baseURL
And path 'unknown/23'
When method GET
Then status 404
