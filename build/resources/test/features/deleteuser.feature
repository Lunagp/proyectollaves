Feature: Llavaes

  Scenario: Delete the user on the page
    Given that enter on the page "http://localhost:8080/#/" d
    When you log in select the delete user option
      | user | password |
      | Anni | 123      |
    Then you should see user deleted successfully on the screen.
