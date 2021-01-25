Feature: delete the lead

Background: user is logged In
Given I navigate to login page
When I submit the Username and Password
Then I logged In


Scenario: I navigate to Create Lead page and Create the  lead in the List
Given I Navigate to Create Lead page
And I enter the company name,first name,last name
And Select the Source id
And Select the marketing campaign
And Select the DOB
When I Submit the form
Then lead is Created
 
Scenario: I navigate to Lead list page and Delete the first lead in the List
Given I Navigate to Lead List page
When I delete the lead
Then lead is deleted
