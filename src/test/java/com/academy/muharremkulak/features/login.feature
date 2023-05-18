Feature: User login

  Scenario: Successful login
    Given user is on login page
    When user enters a valid email "mo12Peterson@gmail.com"
    And user enters a valid password "mo212121"
    And user clicks on the login button
    Then user should be logged in successfully


  Scenario: Invalid credentials
    Given user is on login page
    When user enters a valid username "mo12Peterson@gmail.com"
    And user enters a invalid password "mo212121Incorrect"
    And user clicks on the login link
    Then user should be error message