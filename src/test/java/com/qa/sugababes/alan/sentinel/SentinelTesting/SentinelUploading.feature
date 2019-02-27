Feature: Input documents to the website
					As A NS Advsior
					I want to upload Documents
					So that they can be keyword checked

Scenario: Selecting a file
Given I have the correct web address
And Have entered a report name
When I click Choose File button
And Click on a file pressing enter
Then the file has been selected 
And the file has been checked


Scenario: Uploading a file
Given I have the correct web address
And Have entered a report name
And I have selected a file
When I click submit
Then a submission message is displayed 
 