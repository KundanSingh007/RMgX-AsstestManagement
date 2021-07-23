# RMgX-AsstestManagement

A Spring boot application for 

Assignment details are, 

Problem Statement: 

To build a REST based app for asset management in a company. 

Description:

Any company has assets like laptops, keyboard, stationary items, furniture etc. 
It is important for a company to keep a track of these assets, their condition,
and assignment to people to ensure rightful use of these assets and keep a track of them.
A REST based app is required which will expose the following services :

Add category of assets. Categories can be like - electronics, furniture etc.
A category will have a unique ID, name and description
Update category 
List of all categories 
//
Add an asset. Asset will have a name, purchase date, condition notes, 
a category,assignment status - Available, Assigned, Recovered. 
List of assets
//

Search assets based on name 
Update an asset. 
Assign an asset to an employee 
Recover an asset from an employee 
Delete an asset.  The rules here are : An asset cannot be delete which is in assigned state 
Assume that employees are already there in the database with 
the following information about them - id (unique id of the employee), full name, designation


Tech Stack to be used:

Spring boot 2.4 
Spring JPA
H2 Database 
Source code management in Github 
Things to consider:

Clean code with functional solidity and completeness
Documented code with clear description  on how things work ( Javadocs and README.md )
Unit Test cases using JUNIT5 and Spring Boot Tests and Mockito : not done.
