$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login",
  "description": "",
  "id": "login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "login without username and password",
  "description": "",
  "id": "login;login-without-username-and-password",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user is on github homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user clicks on Sign in button",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user is displayed login screen",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDef.user_is_on_github_homepage()"
});
formatter.result({
  "duration": 365635129,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.user_clicks_on_Sign_in_button()"
});
formatter.result({
  "duration": 23606,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.user_is_displayed_login_screen()"
});
formatter.result({
  "duration": 40029,
  "status": "passed"
});
});