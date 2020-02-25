Feature: WikiHome functionality 

#Background: 
#	Given the user is on Local manager page 
#	Then user is on Rioseo login page 


#Example of Parameterized scenario statement
Scenario Outline: 1 WikiHome 
	Given the user is on wikiHome page 
	When the user enters <value> in searchbox
	Then the user can see the typed in text 
	
	#Example of passing the values to the scenarios
	Examples:
		| value |
		| France |
		| India |