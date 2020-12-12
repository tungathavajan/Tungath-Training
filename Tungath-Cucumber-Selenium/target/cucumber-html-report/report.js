$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/assignment.feature");
formatter.feature({
  "name": "Assignment Feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Customer Register sucessfully and verify customer is able to send the email",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "customer loads the URL in browser",
  "keyword": "Given "
});
formatter.step({
  "name": "customer clicks on signup button",
  "keyword": "When "
});
formatter.step({
  "name": "enters \"\u003cfirstname\u003e\", \"\u003clastname\u003e\", \"\u003cemail\u003e\", \"\u003cusername\u003e\" and \"\u003cpass\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "clicks on register button",
  "keyword": "And "
});
formatter.step({
  "name": "validate the message",
  "keyword": "Then ",
  "doc_string": {
    "value": "    Your personal settings have been registered."
  }
});
formatter.step({
  "name": "clicks on Home",
  "keyword": "Then "
});
formatter.step({
  "name": "Validate \"\u003cemail\u003e\" email from profile section",
  "keyword": "And "
});
formatter.step({
  "name": "create email and send to \"naveen\"",
  "keyword": "And "
});
formatter.step({
  "name": "Validate the message \"The message has been sent to naveen naveen (naveen)\"",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "firstname",
        "lastname",
        "email",
        "username",
        "pass"
      ]
    },
    {
      "cells": [
        "sankara",
        "mahadeva",
        "sankara.maha@gmail.com",
        "sankara.maha",
        "passw0rd"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Customer Register sucessfully and verify customer is able to send the email",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "customer loads the URL in browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDef.loadURL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "customer clicks on signup button",
  "keyword": "When "
});
formatter.match({
  "location": "StepDef.clickSignup()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enters \"sankara\", \"mahadeva\", \"sankara.maha@gmail.com\", \"sankara.maha\" and \"passw0rd\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDef.userenterdetails(String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on register button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDef.user_clicksonRegister()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validate the message",
  "keyword": "Then ",
  "doc_string": {
    "value": "    Your personal settings have been registered."
  }
});
formatter.match({
  "location": "StepDef.validateMessage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on Home",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.clickHome()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate \"sankara.maha@gmail.com\" email from profile section",
  "keyword": "And "
});
formatter.match({
  "location": "StepDef.validateEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "create email and send to \"naveen\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDef.createEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate the message \"The message has been sent to naveen naveen (naveen)\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDef.validateEmailMessage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});