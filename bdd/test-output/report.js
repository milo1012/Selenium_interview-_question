$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/sharm/eclipse-workspace/bdd/Features/Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login functionality",
  "description": "",
  "id": "login-functionality",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "verify login functionality",
  "description": "",
  "id": "login-functionality;verify-login-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "User already on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User enter username and password",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User click login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User close Browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginstepDefinition.user_already_on_login_page()"
});
formatter.result({
  "duration": 18620982005,
  "status": "passed"
});
formatter.match({
  "location": "LoginstepDefinition.user_enter_username_and_password()"
});
formatter.result({
  "duration": 328413578,
  "status": "passed"
});
formatter.match({
  "location": "LoginstepDefinition.user_click_login_button()"
});
formatter.result({
  "duration": 4047978424,
  "status": "passed"
});
formatter.match({
  "location": "LoginstepDefinition.User_close_Browser()"
});
formatter.result({
  "duration": 2797556734,
  "status": "passed"
});
});