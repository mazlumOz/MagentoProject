Feature: TABMenu Functionality

  Scenario: TAB menu control Women

    When The user clicks on the categories in the TAB menu.
    Then It will see the Tops and Bottoms subcategories open.
    And The user clicks on the Tops subcategory.
    And Validates the page containing products belonging to the subcategory
    And User clicks on the back button
