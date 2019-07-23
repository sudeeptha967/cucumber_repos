Feature: purchase products in Online 

#certain steps need to execute
Background: display welcome message
Given application displaying welcome message 

#@login @regression
Scenario: validate login functionality

When user opens login application
And entering username as "mercury"
And entering password as "mercury"
Then click Submit 
And Validate login success

#@search @regression
Scenario: Search products
When user entering search product as "iphone"
Then application display search related items

#@addproduct @regression
Scenario: Add products to cart
When user click on Add to cart
And The product should added to cart item
#@payment
Scenario: Payment
When user performs payment through netbanking
Then close application



