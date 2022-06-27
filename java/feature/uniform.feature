Feature: Uniform Login  page

  Scenario Outline: Login with unauthorized user
    Given User is on homepage
    When user enter invalid Username "<username>" and password "<password>"
    When user clicks on submit button
    Then Validation message appears

    Examples: 
      | username | password  |
      | harry    | harry@123 |

  @first2
  Scenario Outline: Login with authorized user
    Given User is on homepage
    When user enter valid Username "<username>" and password "<password>"
    And user clicks on submit button
    Then user is at dashboard and ckick menu button
    When user clicks on Menu to navigate to Reports
    When user clicks on Sales and navigates to Orders page
    Then user click on Orders

    Examples: 
      | username | password  |
      | admin    | Admin@123 |

  Scenario Outline: 
    Then User is at Sales Report page
    When user enter Starting Starting date "<Starting date>" and Ending date "<Ending date>"
    Then user clicks on filter button

    Examples: 
      | Starting date | Ending date |
      | 2022-06-01    | 2022-06-27  |
