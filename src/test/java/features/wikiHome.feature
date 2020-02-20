Feature: WikiHome functionality 

#Background: 
#	Given the user is on Local manager page 
#	Then user is on Rioseo login page 

Scenario: 1 WikiHome
	Given the user is on wikiHome page 
	When the user enters value in searchbox
	Then the user can see the typed in text