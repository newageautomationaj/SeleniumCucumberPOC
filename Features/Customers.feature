Feature: Customers
  Background: Below are the common steps for every scenarios
    Given User Launch the Chrome Browser
    When User Open URL "http://admin-demo.nopcommerce.com/login"
    And User enter email as "admin@yourstore.com" and password as "admin"
    And Click on Login Button
    Then User can view Dashboard
    When User click on Customers Menu
    And Click on Customers Menu Item

  Scenario: Add New Customer
    And Click on Add New Button
    Then User can view Add New Customer Page
    When User enter Customer Info
    And Click on Save Button
    Then User can view Confirmation Message "The new customer has been added successfully."
    And Close Browser

  Scenario: Search Customer by EmailID
    And Enter Customer EmailID
    When Click on Search Button
    Then User should found Email in the Search Table
    And Close Browser

  Scenario: Search Customer by Name
    And Enter Customer FirstName
    And Enter Customer LastName
    When Click on Search Button
    Then User should found Name in the Search Table
    And Close Browser