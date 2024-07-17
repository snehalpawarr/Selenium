Feature: Get all airlines

@execute
Scenario: Get all airlines details
    Given url secureBaseURL
    And header Authorization = 'Bearer '+authInfo.authToken
    And path 'airlines'
    When method GET
    Then status 200