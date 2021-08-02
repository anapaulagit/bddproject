$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:automationTest/loginSearch.feature");
formatter.feature({
  "name": "Youtube Login Validation and Search",
  "description": "In Youtube site\nAs a valid User\nI want to do a search",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "navigate to Youtube page",
  "keyword": "Given "
});
formatter.match({
  "location": "automation.test.AutoTestStepdefs.navigateToYoutubePage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Make a search",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@happy"
    }
  ]
});
formatter.step({
  "name": "I search for \"Wex inc\"",
  "keyword": "When "
});
formatter.match({
  "location": "automation.test.AutoTestStepdefs.iSearchFor(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I see a list of videos about Wex",
  "keyword": "Then "
});
formatter.match({
  "location": "automation.test.AutoTestStepdefs.iSeeAListOfVideosAboutWex()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});