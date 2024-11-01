Feature: TABMenu Functionality

  Background:
    Given The user navigates to the Magento website
    When The user clicks on the Sign in Link
    Then The user types username and password with valid credentials
    And The user clicks on the Sign in button
    Then The user verifies logged in successfully

  Scenario: TAB menu control Women

    When The user clicks on the categories in the TAB menu.
    |women|
    Then It will see the Tops and Bottoms subcategories open.
    |topsWomen|
    |jacketsWomen|
    |hoodiesSweatshirtsWomen|
    |teesWomen|
    |BrasTanksWomen|
    |BottomsWomen|
    |pantsWomen|
    |shortsWomen|


    And The user clicks on the Tops subcategory.
      |topsWomen|
    And Validates the page containing "topsText" products belonging to the "Tops" subcategory


    And User clicks on the back button


  Scenario: TAB menu control Men

    When The user clicks on the categories in the TAB menu.
      |men|
    Then It will see the Tops and Bottoms subcategories open.
      |topsMen|
      |jacketsMen|
      |hoodiesSweatshirtsMen|
      |teesMen|
      |tanksMen|
      |BottomsMen|
      |pantsMen|
      |shortsMen|


    And The user clicks on the Tops subcategory.
      |BottomsMen|
    And Validates the page containing "bottomsText" products belonging to the "Bottoms" subcategory