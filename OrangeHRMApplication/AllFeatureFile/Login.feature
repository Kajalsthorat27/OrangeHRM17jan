Feature: OrangeHRM Application

  Scenario: OrangeHRM  Login Functionality
    Given User is on LoginPage
    When User enter Username and Password
    Then clcik on Login Button

    Scenario: Homepage functionality
    Then user validate url and title
    