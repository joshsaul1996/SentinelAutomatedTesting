Feature: Input documents to the website
					As A NS Advsior
					I want to upload Documents
					So that they can be keyword checked

Scenario: Selecting a file
Given I have the correct web address
When I select a file
Then the file has been selected


Scenario: Uploading a file
Given I have selected a file
When I click submit
Then the file type is checked
And a submission message is displayed 
 
Scenario: Submit no document
Given I have the correct web address
And the file has not been selected
When I click submit
Then an error message appears
