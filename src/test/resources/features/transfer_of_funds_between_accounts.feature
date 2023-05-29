#autor: Juan Esteban Olaya - juanesolayalopez@gmail.com
Feature: Automate page demotestfire
  As a web user
  I need to validate the transfer success of the account Checking from the account Credit Card
  To validate that the correct functioning of the page


  Scenario Outline: Validate successful functionality Transfer funds between accounts
    Given That Juan is on the home page
    And Select option <option>
    When Enter the credentials
      | username   | password   |
      | <userName> | <password> |
    And Select the option <option2>
    And Select the options <fromAccount> <toAccount> and <amountToTransfer>
    Then Validate successful transfer between accounts for the requested amount with the following message successfully transferred from Account
    Examples:
      | userName | password | option    | option2        | fromAccount | toAccount        | amountToTransfer |
      | Jsmith   | Demo1234 | LoginLink | MenuHyperLink3 | 800003      | 4539082039396288 | 1500             |

