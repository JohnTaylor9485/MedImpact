$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/example.feature");
formatter.feature({
  "name": "a example",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "test",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "abc",
  "keyword": "Given "
});
formatter.match({
  "location": "MyStepdefs.abc()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "dcs",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.dcs()"
});
formatter.result({
  "status": "passed"
});
});