Feature: Google search feature
  This feature helps user to search an appropriate information using google search engin.

  Scenario: User should be able to search an information on various topics
    Given User should open Google search page
    When User enterd "Agile Methodolgy" in search box
    And click on submit button
    Then Multiple Links should be displayed on "Agile Methodolgy" topic

  Scenario: User should be able to search distance between two cities
    Given User should open Google search page
    When User enterd cities name "Pune Mumbai Distance"  in search box
    And click on submit button
    Then map should be display between "Pune and Mumbai" cities along with distance in KMs
    
  