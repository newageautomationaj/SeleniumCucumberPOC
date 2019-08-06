$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/Login.feature");
formatter.feature({
  "name": "Login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Successful Login with Valid Credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User Launch the Chrome Browser",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPageSteps.user_Launch_the_Chrome_Browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Open URL \"http://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.user_Open_URL(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter email as \"admin@yourstore.com\" and password as \"admin\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageSteps.user_enter_email_as_and_password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Login Button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageSteps.click_on_Login_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Page Title should be \"Dashboard / nopCommerce administration\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.page_Title_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on Logout Link",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.user_click_on_Logout_Link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Page Title should be \"Your store. Login\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.page_Title_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close Browser",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageSteps.close_Browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Login with Data Driven Technique",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User Launch the Chrome Browser",
  "keyword": "Given "
});
formatter.step({
  "name": "User Open URL \"http://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.step({
  "name": "User enter email as \"\u003cemail\u003e\" and password as \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Click on Login Button",
  "keyword": "And "
});
formatter.step({
  "name": "Page Title should be \"Dashboard / nopCommerce administration\"",
  "keyword": "Then "
});
formatter.step({
  "name": "User click on Logout Link",
  "keyword": "When "
});
formatter.step({
  "name": "Page Title should be \"Your store. Login\"",
  "keyword": "Then "
});
formatter.step({
  "name": "Close Browser",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ]
    },
    {
      "cells": [
        "admin@yourstore.com",
        "admin"
      ]
    },
    {
      "cells": [
        "admin@yourstore.com",
        "admin123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login with Data Driven Technique",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User Launch the Chrome Browser",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPageSteps.user_Launch_the_Chrome_Browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Open URL \"http://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.user_Open_URL(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter email as \"admin@yourstore.com\" and password as \"admin\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageSteps.user_enter_email_as_and_password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Login Button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageSteps.click_on_Login_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Page Title should be \"Dashboard / nopCommerce administration\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.page_Title_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on Logout Link",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.user_click_on_Logout_Link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Page Title should be \"Your store. Login\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.page_Title_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close Browser",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageSteps.close_Browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login with Data Driven Technique",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User Launch the Chrome Browser",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPageSteps.user_Launch_the_Chrome_Browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Open URL \"http://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.user_Open_URL(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter email as \"admin@yourstore.com\" and password as \"admin123\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageSteps.user_enter_email_as_and_password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Login Button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageSteps.click_on_Login_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Page Title should be \"Dashboard / nopCommerce administration\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.page_Title_should_be(String)"
});
formatter.result({
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat stepDefinitions.LoginPageSteps.page_Title_should_be(LoginPageSteps.java:45)\r\n\tat ✽.Page Title should be \"Dashboard / nopCommerce administration\"(file:Features/Login.feature:24)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User click on Logout Link",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.user_click_on_Logout_Link()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Page Title should be \"Your store. Login\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.page_Title_should_be(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Close Browser",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageSteps.close_Browser()"
});
formatter.result({
  "status": "skipped"
});
});