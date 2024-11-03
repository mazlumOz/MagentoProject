Feature: Registration

  Background: User Registration
    Given Navigate to Magento website
    When The user clicks on create an account button

    Scenario: User registration data entries

      And User enters required information
      | firstName |michal|
      | lastName  |tyson |
      | emailAddress |mchltyson5412321@gmail.com|
      | password     |Mchltyson.345|
      |passwordConfirmation|Mchltyson.345|

      And User clicks on the sign up button


      And User see thanks massage

