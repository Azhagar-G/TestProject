$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/flipkart_login.feature");
formatter.feature({
  "name": "To Validate the login functionality of Flipkart",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "login the user",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.step({
  "name": "launch the browser",
  "keyword": "Given "
});
formatter.step({
  "name": "go to the website",
  "keyword": "When "
});
formatter.step({
  "name": "login the user with \u003cusername\u003e and \u003cpassword\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "validate user logged in or not",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "name",
        "value"
      ]
    },
    {
      "cells": [
        "name1",
        "5"
      ]
    },
    {
      "cells": [
        "name2",
        "7"
      ]
    }
  ]
});
formatter.scenario({
  "name": "login the user",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.step({
  "name": "launch the browser",
  "keyword": "Given "
});
formatter.match({
  "location": "loginpage_step_def.launch_the_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "go to the website",
  "keyword": "When "
});
formatter.match({
  "location": "loginpage_step_def.go_to_the_website()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "login the user with \u003cusername\u003e and \u003cpassword\u003e",
  "keyword": "And "
});
formatter.match({
  "location": "loginpage_step_def.login_the_user_with_username_and_password()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "validate user logged in or not",
  "keyword": "Then "
});
formatter.match({
  "location": "loginpage_step_def.validate_user_logged_in_or_not()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "login the user",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.step({
  "name": "launch the browser",
  "keyword": "Given "
});
formatter.match({
  "location": "loginpage_step_def.launch_the_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "go to the website",
  "keyword": "When "
});
formatter.match({
  "location": "loginpage_step_def.go_to_the_website()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "login the user with \u003cusername\u003e and \u003cpassword\u003e",
  "keyword": "And "
});
formatter.match({
  "location": "loginpage_step_def.login_the_user_with_username_and_password()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "validate user logged in or not",
  "keyword": "Then "
});
formatter.match({
  "location": "loginpage_step_def.validate_user_logged_in_or_not()"
});
formatter.result({
  "status": "skipped"
});
});