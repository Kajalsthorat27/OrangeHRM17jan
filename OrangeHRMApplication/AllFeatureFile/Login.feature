Feature: OrangeHRM Application

#kajal
  Scenario: OrangeHRM  Login Functionality
    Given User is on LoginPage
    When User enter Username and Password
    Then clcik on Login Button
#Sahara
    Scenario: Homepage functionality
    Then user validate url and title
    
    #Santosh
    Scenario: PIM page Functionality
    Then user click on pim page 
    And user enter first name and last name and click on save button
    
    