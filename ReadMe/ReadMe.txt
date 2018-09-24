Readme:

Summary:This is to test a negative functionality in Contact Us page

Tools:Eclipse with Maven,Cucumber,Junit

There are 2 scenarios under 1 Feature

Feature:Negative - Contact Us Page under About
Scenario1:Navigate to Contact us page
Scenario2:Valid Submission


Importanct section-
1.Myapplication.feature -->This will contain features,scenarios and steps
2.TestRunner Package-->Runner.java class-->This will control BDD test execution
3.TestStepsPack Package-->TestSteps.java class-->This will contains all the implementations of all the steps
4.Many other supporting items:
Config.properties-->contain basic config details,like,Browser,application URL
ElementRepository.properties-->contain object properties
Utility.java-->fetchPropertyValue function (fetch value from config file) and fetchOR function (fetch value from repositoryfile) 
5.DataGen Class-->for fetching data from excel




Instruction-

This is a basic project created using Selenium webdriver,Maven,Cucumber,Junit.
This needs to be imported with all the dependencies and plugins (mentioned above) in other places to build and run this

Highlights-This will check and help the user know if we are getting error message while not providing data in all required fields.

Improvements:

1.Many new functions/Methods could have been added to reduce code in steps (like method to findelements,Timeout function etc.).
2.Test can be modularize to increase reusibilty of code, we can then use that in other scripts.
2.Element highlight using JavascriptExecutor.
3.Extent Reporting.

Scenarios:

We can think of many scenarios here in the Contact Us page

1.Fill all the fields and submit
2.Different Permutaions and combinations of Negative scenarios using different fields blank