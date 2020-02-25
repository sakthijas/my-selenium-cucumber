Feature: WikiFrance functionality

#Example of Parameterized scenario statement
Scenario Outline: 2 WikiFrance
	Given the user is on wikiHome page 
	When the user enters <value> in searchbox
	Then the user hits enter and see the page related to France
	
	#Example of passing the values to the scenarios
	Examples:
		| value |
		| France |