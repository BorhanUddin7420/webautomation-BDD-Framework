$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("example.feature");
formatter.feature({
  "line": 1,
  "name": "example test cases",
  "description": "",
  "id": "example-test-cases",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3540835600,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User login as central approver of CDA project",
  "description": "",
  "id": "example-test-cases;user-login-as-central-approver-of-cda-project",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User is on LogIn page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enters \"soudi@yahoo.com\" into Username field",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User enters \"12skdh3\" into Password field",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User Click LogIn button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User Login Successfully",
  "keyword": "And "
});
formatter.match({
  "location": "Example_stepDefinition.user_is_on_example_page()"
});
formatter.result({
  "duration": 2203647200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "soudi@yahoo.com",
      "offset": 13
    }
  ],
  "location": "Example_stepDefinition.user_enters_into_Username_field(String)"
});
formatter.result({
  "duration": 149159600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "12skdh3",
      "offset": 13
    }
  ],
  "location": "Example_stepDefinition.user_enters_into_Password_field(String)"
});
formatter.result({
  "duration": 274511700,
  "status": "passed"
});
formatter.match({
  "location": "Example_stepDefinition.user_Click_example_button()"
});
formatter.result({
  "duration": 2187068000,
  "status": "passed"
});
formatter.match({
  "location": "Example_stepDefinition.user_example_Successfully()"
});
formatter.result({
  "duration": 5012529400,
  "error_message": "org.junit.ComparisonFailure: expected:\u003chttps://[login.jomakhata.com/login/index/aHR0cHM6Ly93d3cuam9tYWtoYXRhLmNvbS8%3D]\u003e but was:\u003chttps://[www.jomakhata.com/#/role]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat com.nvision.pageObj.Example.loginSuccess(Example.java:41)\r\n\tat com.nvision.glue.Example_stepDefinition.user_example_Successfully(Example_stepDefinition.java:47)\r\n\tat ✽.And User Login Successfully(example.feature:9)\r\n",
  "status": "failed"
});
formatter.before({
  "duration": 85900,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Click login",
  "description": "",
  "id": "example-test-cases;click-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "user click to save button",
  "keyword": "Given "
});
formatter.match({
  "location": "Example_stepDefinition.user_click_to_save_button()"
});
formatter.result({
  "duration": 52700,
  "status": "passed"
});
});