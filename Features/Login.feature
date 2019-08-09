Feature: Login

  #Scenario: Logo presence on OrangeHRM Home Page
   # Given I launch the Chrome browser
    #When I open OrangeHRM Home Page
    #Then I verify that the logo present on page
    #And Close browser

  Background: Below are the common steps for every scenarios
    Given User Launch the Chrome Browser
    When User Open URL "http://admin-demo.nopcommerce.com/login"

  @Sanity
  Scenario: Successful Login with Valid Credentials
    And User enter email as "admin@yourstore.com" and password as "admin"
    And Click on Login Button
    Then Page Title should be "Dashboard / nopCommerce administration"
    When User click on Logout Link
    Then Page Title should be "Your store. Login"
    And Close Browser

  @Regression
  Scenario Outline: Login with Data Driven Technique
    And User enter email as "<email>" and password as "<password>"
    And Click on Login Button
    Then Page Title should be "Dashboard / nopCommerce administration"
    When User click on Logout Link
    Then Page Title should be "Your store. Login"
    And Close Browser

    Examples:
      | email               | password  |
      | admin@yourstore.com | admin     |
      | admin@yourstore.com | admin123  |