@opencart
Feature: Place Order Functionality

  @login
  Scenario Outline: Verify user able to place order in Open Cart application
    Given user is on Open Cart home page
    When user navigate to Open Cart login page from MyAccount flyout
    And user login with username "<username>" and password "<password>"
    Then Open Cart account page should open
    And user navigate to Open Cart home page from account page
    

    Examples: 
      | username     | password     |
      | app.username | app.password |