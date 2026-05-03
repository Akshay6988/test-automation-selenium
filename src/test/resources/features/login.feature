Feature: Login Feature

  Scenario: Valid Login
    Given user is on login page
    When user enters valid credentials
    Then user should land on dashboard