Feature: Online Fake API-Airline-Post-secured-passenger
 
  @execute
  Scenario: Add passenger details using payload from file
    Given url secureBaseURL
    And header Authorization = 'Bearer '+authInfo.authToken
    And path 'passenger'
    * def passengersPaylod = read('PassengerPayload.json')
    And request passengersPaylod
    When method POST
    Then status 200