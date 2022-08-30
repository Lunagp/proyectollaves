Feature: User registration in the web application

  Scenario: User registration in the web application
    Given who enters the website and logs in "http://localhost:8080/#/"
    When register a manager type user with the following data
      | username | password | name   | last    | id         | cel        |
      | Anni     | 123      | Andres | Sanchez | 6363636363 | 4242424242 |
    Then you will see the successfully registered user on the screen


