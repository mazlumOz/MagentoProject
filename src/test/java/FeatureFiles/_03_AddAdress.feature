Feature: Add Address Functionality

  Background:
    Given Navigate to Magento
    When  Click to Sign in Button
    Then Click on the My Account section
    And  Click on Manage Address Button

  Scenario Outline: Add new Addresses

    And User send keys in Dialog

      | TelephoneInputt | <phone>  |
      | Streett         | <street> |
      | Cityy           | <city>   |
      | Zipp            | <zip>    |

    And User select state

    Then User click on DialogButton

      | DefaultBillingg    |
      | DefaultShippingg   |
      | SaveAddressButtonn |
      | DeleteButtonn      |
      | DeleteOkk          |


    Examples:
      | phone    | street     | city     | zip   |
      | 22222222 | Atatürk    | istanbul | 11111 |
      | 33333333 | Kazımdirik | izmir    | 99999 |
