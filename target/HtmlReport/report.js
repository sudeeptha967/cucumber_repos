$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Feature/feature1.feature");
formatter.feature({
  "name": "purchase products in Online",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "display welcome message",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "application displaying welcome message",
  "keyword": "Given "
});
formatter.match({
  "location": "demo.application_displaying_welcome_message()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "validate login functionality",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "user opens login application",
  "keyword": "When "
});
formatter.match({
  "location": "demo.user_opens_login_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "entering username as \"mercury\"",
  "keyword": "And "
});
formatter.match({
  "location": "demo.entering_username_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "entering password as \"mercury\"",
  "keyword": "And "
});
formatter.match({
  "location": "demo.entering_password_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click Submit",
  "keyword": "Then "
});
formatter.match({
  "location": "demo.click_Submit()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate login success",
  "keyword": "And "
});
formatter.match({
  "location": "demo.validate_login_success()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "display welcome message",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "application displaying welcome message",
  "keyword": "Given "
});
formatter.match({
  "location": "demo.application_displaying_welcome_message()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Search products",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@search"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "user entering search product as \"iphone\"",
  "keyword": "When "
});
formatter.match({
  "location": "demo.user_entering_search_product_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "application display search related items",
  "keyword": "Then "
});
formatter.match({
  "location": "demo.application_display_search_related_items()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "display welcome message",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "application displaying welcome message",
  "keyword": "Given "
});
formatter.match({
  "location": "demo.application_displaying_welcome_message()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add products to cart",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@addproduct"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "user click on Add to cart",
  "keyword": "When "
});
formatter.match({
  "location": "demo.user_click_on_Add_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The product should added to cart item",
  "keyword": "And "
});
formatter.match({
  "location": "demo.the_product_should_added_to_cart_item()"
});
formatter.result({
  "status": "passed"
});
});