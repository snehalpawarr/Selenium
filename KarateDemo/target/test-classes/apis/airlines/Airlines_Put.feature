Feature: Update Passenger Details using Put method

@execute
Scenario: Update an existing passenger details
  Given url nonSecureBaseURL
  And path 'airline/73dd5420-3bf9-48f3-a0b6-17cf7aa61b19'
  And request read('AirlinePayload.json')
  When method PUT
  Then status 200