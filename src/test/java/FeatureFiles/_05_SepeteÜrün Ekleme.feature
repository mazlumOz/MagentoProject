Feature: Adding/Editing/Removing products to the cart

  Background: Login scenario
    Given The user navigates to the Magento website
    When The user clicks on the Sign in Link
    Then The user types username and password with valid credentials
    And The user clicks on the Sign in button
    When Scroll to shop performance field and click to shop performance button
    Then User should be redirected to performance fabric page successfully
    And Click the list mode button
    And Adds a randomly selected product to the cart
    And Chooses size, color and Qty options for product and click add to cart button

  Scenario: Add to Cart
    Then User should be checked that the product is added to the cart

    Scenario: Edit to Cart
      And Edit to cart
      Then User should be checked that the cart is updated

    Scenario: Remove  product from the cart
      And Click the delete button
      Then User should be checked that the cart is empty