@tag
Feature: Login Functionality

  @tag2
  Scenario Outline: Verify user able to login to Orange HRM
    Given user is on Orange HRM login page
    When user login with username "<username>" and password "<password>"
    Then Orange HRM dashboard page should open

    Examples: 
      | username | password |
      | Admin    | admin123 |