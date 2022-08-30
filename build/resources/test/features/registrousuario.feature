Feature: User registration in the web application

  Scenario: User registration in the web application
    Given who enters the website and logs in "http://localhost:8080/#/"
    When register a manager type user with the following data
      | username | Anni |
      | password | 123  |
    Then you will see the successfully registered user on the screen


