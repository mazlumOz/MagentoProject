Feature: Search Functionality

  Background: Redirect to the Magento website
    Given The user navigates to the Magento website

  Scenario: Search to the a valid product
    When Send to product code to search area and search it
    Then User should be checked that product is on the result page list

  Scenario: Search to the a invalid product
    When Send to invalid product code to search area and search it
    Then User should be checked that received the error message