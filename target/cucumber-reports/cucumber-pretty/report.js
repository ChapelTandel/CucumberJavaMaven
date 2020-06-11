$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/Features/AppForm.feature");
formatter.feature({
  "name": "App Form",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Register a new user",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on appForm page",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.AppFormSteps.iAmOnAppFormPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I register a new user",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.AppFormSteps.iRegisterANewUser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I see Thank you page",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.AppFormSteps.iSeeThankYouPage()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/java/Features/Login.feature");
formatter.feature({
  "name": "Login feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Valid login",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.LoginSteps.iAmOnLoginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I submit a valid login",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.LoginSteps.iSubmitAValidLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am logged",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.LoginSteps.iAmLogged()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});