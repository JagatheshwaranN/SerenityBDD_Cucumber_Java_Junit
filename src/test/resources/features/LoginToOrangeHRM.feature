@tag
Feature: Login Functionality

  @tag2
  Scenario Outline: Verify user able to login to Orange HRM
    Given user is on Orange HRM login page
    When user enters username "<username>"
    And user enters password "<password>"
    And user clicks login button
    Then Orange HRM dashboard page should open

    Examples: 
      | username | password |
      | Admin    | admin123 |