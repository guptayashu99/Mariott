@FindHotel
Feature: Find Hotel

Scenario Outline: Find a Hotel in a City
Given We are at the Mariott Website
When We enter Destination <city>
And Click Find Hotels
Then Verify if hotels are in that <city>

Examples:
|city|
|Delhi|
#|Mumbai|