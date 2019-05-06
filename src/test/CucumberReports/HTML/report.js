$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/Features/googleSearch.feature");
formatter.feature({
  "name": "google searches",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@UserStory01"
    }
  ]
});
formatter.scenario({
  "name": "search apple products from the google",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@UserStory01"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "go to website google",
  "keyword": "When "
});
formatter.match({
  "location": "GoogleSearchSteps.go_to_website_google()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "webpage titile contains google",
  "keyword": "Then "
});
formatter.match({
  "location": "GoogleSearchSteps.webpage_titile_contains_google()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters apple products name and click Enter",
  "keyword": "And "
});
formatter.match({
  "location": "GoogleSearchSteps.user_enters_apple_products_name_and_click_Enter()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "title changes",
  "keyword": "* "
});
formatter.match({
  "location": "GoogleSearchSteps.title_changes()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});