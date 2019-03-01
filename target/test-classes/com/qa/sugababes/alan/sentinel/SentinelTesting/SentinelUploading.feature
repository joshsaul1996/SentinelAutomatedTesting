Feature: Input documents to the website
					As A NS Advsior
					I want to upload Documents
					So that they can be keyword checked

Scenario: Selecting and uploading a valid file
Given I have the correct web address
And Have entered a report name
When I click Choose File button
And Click on a file pressing enter
And I click submit
Then a submission message is displayed 
 
 
 Scenario: Selecting and uploading a valid file without setting a title
Given I have the correct web address
When I click Choose File button
And Click on a file pressing enter
And I click submit
Then an error should appear