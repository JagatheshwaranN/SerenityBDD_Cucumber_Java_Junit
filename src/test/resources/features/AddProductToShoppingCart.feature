@opencart
Feature: Shopping Cart Functionality

  @shoppingcart
  Scenario Outline: Verify user able to add product to shopping cart in Open Cart application
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
    And user remove the product from shopping cart

    Examples: 
      | username     | password     | product     |
      | app.username | app.password | item.search |
