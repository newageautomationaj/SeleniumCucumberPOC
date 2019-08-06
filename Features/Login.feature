Feature: Login

  #Scenario: Logo presence on OrangeHRM Home Page
   # Given I launch the Chrome browser
    #When I open OrangeHRM Home Page
    #Then I verify that the logo present on page
    #And Close browser

  Scenario: Successful Login with Valid Credentials
    Given User Launch the Chrome Browser
    When User Open URL "http://admin-demo.nopcommerce.com/login"
    And User enter email as "admin@yourstore.com" and password as "admin"
    And Click on Login Button
    Then Page Title should be "Dashboard / nopCommerce administration"
    When User click on Logout Link
    Then Page Title should be "Your store. Login"
    And Close Browser

  Scenario Outline: Login with Data Driven Technique
    Given User Launch the Chrome Browser
    When User Open URL "http://admin-demo.nopcommerce.com/login"
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