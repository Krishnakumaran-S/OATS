Feature: Login into LeafTop Application
Background: 
Given Launch the browser
And maximize the browser
And Enter the URls

Scenario Outline: Positive Flow for Login

#And set the timeouts
And enter the User name as DemoSalesManager
And enter the password as crmsfa
And clicks on login button
And clicks on CRMSFA
And clicks on create lead
And Enter First Name as <firstname>
And Enter Last Name as <lastname>
And Enter Company Name as <companyname>
When Click on Create lead
Then Verify Lead is created

Examples:
|firstname|lastname|companyname|
|krish|kum|wipro|
|vino|gold|wipro|


Scenario Outline: Negative Flow for Login

#And set the timeouts
And enter the User name as DemoSalesManager
And enter the password as crmsfc
And clicks on login button
And clicks on CRMSFA
And clicks on create lead
And Enter First Name as <firstname>
And Enter Last Name as <lastname>
And Enter Company Name as <companyname>
When Click on Create lead
But Verify Lead is created

Examples:
|firstname|lastname|companyname|
|krish|kum|wipro|
|vino|gold|wipro|