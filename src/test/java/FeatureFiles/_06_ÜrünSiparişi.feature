Feature: Order Functionality

  Background:
    Given Navigate to magento website
    And Click on the Element in Dialog
      | signIn |
    And User send keys in Dialog
      | email    |  yusufkilic811@gmail.com|
      | password | YusufK.2121 |
    And Click on the Element in Dialog
      | signInButton |
    Then Login Success Message Should Appear

  Scenario: Order Verification

    And Shopping transaction in Dialog

    And Click on the Element in Dialog
      | shippingMethods |
      | nextButton      |

    Then Purchase Success Message Should Appear