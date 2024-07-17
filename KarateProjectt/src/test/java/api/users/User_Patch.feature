Feature: patch Passenger Details

@execute
Scenario: Update an existing passenger details
  Given url baseURL
  And path 'users/2'
  And request read('UserPayload.json')
  When method PATCH
  Then status 200