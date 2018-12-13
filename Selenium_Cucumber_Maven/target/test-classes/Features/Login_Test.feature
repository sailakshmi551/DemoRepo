#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

#Key for the multi-line comments in the feature file is 'Ctrl+/'


Feature: Login
 Description: I want to verify the login functionality for the 'Mercury Tours'

  
  Scenario: Login to the 'Mercury Tours' application
    Given User is on login page
   
    When I enter "Test@123" and "Test@123"
    And click on login button
   
    Then 'Home' page should be displayed
    
    Scenario: Register to the 'Mercury Tours' application
    Given User is on Home page
   
    When click on the register link
    
   
    Then 'Register' page should be displayed
    

 #@tag2
 #Scenario Outline: Login to the 'Mercury Tours' application
    #Given User is on login page
   #
    #When I enter "<username>" and "<password>"
    #And click on login button
   #
    #Then 'Home' page should be displayed
#
    #Examples: 
      #| username | password | 
    #	| Test@123 | Test@123 |
    #	| Test     | Test     |     
#
#	@tag3
  #Scenario: Login to the 'Mercury Tours' application
    #Given User is on login page
   #
    #When user enter credentials to login
    #| Test@123 | Test@123 |
    #And click on login button
   #
    #Then 'Home' page should be displayed	
    #
    #	@tag4
  #Scenario: Login to the 'Mercury Tours' application
    #Given User is on login page
   #
    #When user enter credentials to login
    #| UserName | Password |
    #| Test@123 | Test@123 |
    #And click on login button
   #
    #Then 'Home' page should be displayed	
    
  #@tag5
  #Scenario: Login to the 'Mercury Tours' application
    #Given User is on login page
   #
    #When user enter credentials to login
    #| UserName | Password |
    #| Test@123 | Test@123 |
    #| test		 | test     |
    #
   #
    #Then 'Home' page should be displayed	
    