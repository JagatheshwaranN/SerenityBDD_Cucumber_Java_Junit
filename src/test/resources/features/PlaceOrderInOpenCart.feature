@opencart
Feature: Place Order Functionality

  @placeorder
  Scenario Outline: Verify user able to place order in Open Cart application
    Given user is on Open Cart home page
    When user navigate to Open Cart login page from MyAccount flyout
    And user login with username "<username>" and password "<password>"
    Then Open Cart account page should open
    And user navigate to Open Cart home page from account page
    And user search for product "<product>"
    When user clicks Add to cart button
    Then Open Cart product detail page should open
    And user add product to shopping cart
    When user navigate to Open Cart shopping cart page from product view drop
    Then Open Cart shopping cart page should open
    And user verify the product details in shopping cart
    When user navigate to Open Cart checkout page
    And user enters the checkout billing, delivery, payment details "<checkoutDetails>" and place order
    Then place order success message should display

    Examples: 
      | username     | password     | product     | checkoutDetails |
      | app.username | app.password | item.search | billing.details |
