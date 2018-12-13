$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login_Test.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    },
    {
      "line": 3,
      "value": "#Feature: List of scenarios."
    },
    {
      "line": 4,
      "value": "#Scenario: Business rule through list of steps with arguments."
    },
    {
      "line": 5,
      "value": "#Given: Some precondition step"
    },
    {
      "line": 6,
      "value": "#When: Some key actions"
    },
    {
      "line": 7,
      "value": "#Then: To observe outcomes or validation"
    },
    {
      "line": 8,
      "value": "#And,But: To enumerate more Given,When,Then steps"
    },
    {
      "line": 9,
      "value": "#Scenario Outline: List of steps for data-driven as an Examples and \u003cplaceholder\u003e"
    },
    {
      "line": 10,
      "value": "#Examples: Container for s table"
    },
    {
      "line": 11,
      "value": "#Background: List of steps run before each of the scenarios"
    },
    {
      "line": 12,
      "value": "#\"\"\" (Doc Strings)"
    },
    {
      "line": 13,
      "value": "#| (Data Tables)"
    },
    {
      "line": 14,
      "value": "#@ (Tags/Labels):To group Scenarios"
    },
    {
      "line": 15,
      "value": "#\u003c\u003e (placeholder)"
    },
    {
      "line": 16,
      "value": "#\"\""
    },
    {
      "line": 17,
      "value": "## (Comments)"
    },
    {
      "line": 18,
      "value": "#Sample Feature Definition Template"
    },
    {
      "line": 20,
      "value": "#Key for the multi-line comments in the feature file is \u0027Ctrl+/\u0027"
    }
  ],
  "line": 23,
  "name": "Login",
  "description": "Description: I want to verify the login functionality for the \u0027Mercury Tours\u0027",
  "id": "login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 27,
  "name": "Login to the \u0027Mercury Tours\u0027 application",
  "description": "",
  "id": "login;login-to-the-\u0027mercury-tours\u0027-application",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 28,
  "name": "User is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 30,
  "name": "I enter \"Test@123\" and \"Test@123\"",
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "\u0027Home\u0027 page should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Test_Steps.user_is_on_login_page()"
});
formatter.result({
  "duration": 25727783054,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Test@123",
      "offset": 9
    },
    {
      "val": "Test@123",
      "offset": 24
    }
  ],
  "location": "Test_Steps.i_enter_username_and_password(String,String)"
});
formatter.result({
  "duration": 1922739152,
  "status": "passed"
});
formatter.match({
  "location": "Test_Steps.click_on_login_button()"
});
formatter.result({
  "duration": 2716224415,
  "status": "passed"
});
formatter.match({
  "location": "Test_Steps.home_page_should_be_displayed()"
});
formatter.result({
  "duration": 2527036467,
  "status": "passed"
});
formatter.scenario({
  "line": 35,
  "name": "Register to the \u0027Mercury Tours\u0027 application",
  "description": "",
  "id": "login;register-to-the-\u0027mercury-tours\u0027-application",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 36,
  "name": "User is on Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 38,
  "name": "click on the register link",
  "keyword": "When "
});
formatter.step({
  "line": 41,
  "name": "\u0027Register\u0027 page should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Register_Steps.user_is_on_Home_page()"
});
formatter.result({
  "duration": 9599786758,
  "status": "passed"
});
formatter.match({
  "location": "Register_Steps.click_on_the_register_link()"
});
formatter.result({
  "duration": 154558,
  "status": "passed"
});
formatter.match({
  "location": "Register_Steps.register_page_should_be_displayed()"
});
formatter.result({
  "duration": 7337580456,
  "status": "passed"
});
});