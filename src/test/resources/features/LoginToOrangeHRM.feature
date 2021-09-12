@orangeHRM
Feature: Login Functionality

  @login
  Scenario Outline: Verify user able to login to Orange HRM
    Given user is on Orange HRM login page
    When user login with username "<username>" and password "<password>"
    Then Orange HRM dashboard page should open

    Examples: 
      | username     | password     |
      | app.username | app.password |
