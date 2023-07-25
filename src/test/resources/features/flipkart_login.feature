 Feature: To Validate the login functionality of Flipkart

  @login
  Scenario Outline: login the user
    Given launch the browser
    When go to the website
    And login the user with <username> and <password>
    Then validate user logged in or not

    Examples: 
      | name  | value |
      | name1 |     5 |
      | name2 |     7 |
