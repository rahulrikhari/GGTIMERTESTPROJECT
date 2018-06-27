$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("EggTimer.feature");
formatter.feature({
  "name": "Egg Timer Increment",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Check timer increament",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.step({
  "name": "Enter URL",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.enter_URL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Remove default value and When enter 25 second and click go",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.remove_default_value_and_When_enter_second_and_click_go(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Timer start with decrement",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.timer_start_with_decrement()"
});
formatter.result({
  "status": "passed"
});
});