Feature: Get all passengers

@execute
Scenario: Get all passenger details
    Given url secureBaseURL
    And header Authorization = 'Bearer '+authInfo.authToken
    And path 'passenger'
    When method GET
    Then status 200