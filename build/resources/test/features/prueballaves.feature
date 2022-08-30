Feature: LLaves

  @Login
  Scenario: Login on the website
    Given that enter the page "http://localhost:8080/#/"
    When enter valid credentials
      | user | password |
      | Anni | 123      |
    Then the user will be logged in correctly

  @IncorrectLogin
  Scenario: Login on the website with incorrect credentials
    Given that enter on the page "http://localhost:8080/#/"
    When enter incorrect credentials
      | user | password |
      | anni | 12345    |
    Then the user will be logged in incorrectly