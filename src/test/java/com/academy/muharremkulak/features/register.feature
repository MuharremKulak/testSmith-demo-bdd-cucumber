Feature: User Register

  As a user I want to register to the website
  So that I can create my account

  Scenario Outline: Successful registration
    Given user am on home page
    And user clicks on Sign in link
    When user clicks on Register your account link
    Then user should be navigated to create register page
    And user enters "<first_name>" in the firstname input
    And user enters "<last_name>" in the lastname input
    And user enters DOB
    And user enters "<address>" in the address input
    And user enters "<post_code>" in the postCode input
    And user enters "<city>" in the city input
    And user enters "<state>" in the state input
    And user chooses country
    And user enters "<phone>" in the phone input
    And user enters "<email>" in the email input
    And user enters "<password>" in the password input
    When user clicks on Register your account button
    Then user should be registered successfully


    Examples:
      | first_name  | last_name | address         | post_code | city      | state | phone        | email                | password    |
      | Mo          | Peterson  | 123 Main Street | 22201     | Mclean    | VA    | 1234567890   | mo12Peterson@gmail.com | mo212121    |
      | Kevin       | Lee       | 456 Main Street | 22202     | Arlington | VA    | 2003007890   | kevinLee12@gmail.com | kevin212121 |