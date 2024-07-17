Feature: Google search feature
  This feature helps user to search an appropriate information using google search engin.

Scenario Outline: User wants to translate word from one language to another language
    Given User should open Google translater page
    When User enterd "<Word>" word from "<From>"  language and select "<To>" language
    Then Google translater should display word "<Word>" into "<To>" language
    
    
    Examples:
      | Word        | From    | To      |
      | Abstraction | English | Marathi |
      | Fire        | English | French  |
      | Happy       | English | Marathi |
      | Sad         | English | Marathi |