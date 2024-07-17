Feature: Registration for ParaBank

  Scenario: User registers with valid details
    Given User is on the ParaBank homepage
    When User navigate to the registration page
    And  enter valid registration details
    | firstname | lastname | address | city | state | zipcode | phone | ssn | username | password | confirmpassword |
		| Snehal | Pawar | Wagholi | Pune | Maharashtra | 412307 | 8765435262 | 123456789 | snehalpawar | Para@4321 | Para@4321 |
    And  submit the registration form
    Then User should see a success message
 

  Scenario: User registers with existing username
    Given User is on the ParaBank homepage
    When User navigate to the registration page
    And  enter registration details with an existing username
    | firstname | lastname | address | city | state | zipcode | phone | ssn | username | password | confirmpassword |
		| Snehal | Pawar | Wagholi | Pune | Maharashtra | 412307 | 8765435262 | 123456789 | riyapatil1 | Mav123 | Mav123 |
    And  submit the registration form
    Then User should see an error message indicating the username is taken

