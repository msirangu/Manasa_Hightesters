Feature: Cucumber Array example

 Scenario Outline: open Ds Algo Home page and clicks started buttonand redirected to Array page
 Given The user is on the DS Algo Home Page
 When  The user clicks  Get Started button below the array
 Then  The user should be redirected to the Array Page 
 
 Scenario Outline:  click on Array link and rdirect to array in python   
 Given  The user is on the Array in Python Page
 When   The user clicks a Arrays in Python link
 Then The user should be redirected to "Array in Python " 
 
 Scenario Outline: click try here and redirected to python editor
 Given The user is on the Array in Python Page
 When  The user clicks Try Here button of Array in Python Page
 Then  The user should be redirected to a page having an Python Editor with a url "https://dsportalapp.herokuapp.com/tryEditor"
 
 Scenario Outline: without entering code click on run button  no error is displayed
 Given The user is on the Python Editor
 When  The user clicks the Run Button without entring the code in the Editor
 Then  Nothing happens to the page and no error message is displayed 
 
 Scenario Outline: write invalid code and click run then error is diaplayed
Given user is on the Python Editor
When The user write the invalid code in Editor
And  Click the Run Button
Then The user should able to see an error message in alert window

Scenario Outline: enter valid code and click run see in output console
Given user is on the Python Editor
When The user write the valid code in Editor
Then The user should able to see output in the console

Scenario Outline: go backward page
Given The  user is on the Basic Operations in Lists page
When The user clicks an Applications of Array link
Then The user should be redirected to " Applications of Array" AA page.

Scenario Outline: opens editor page
Given  The  user is on the  Applications of Array page
When  The user clicks Try Here button of Application of Array page
Then  The user should be redirected to a page having an Python Editor with a url "https://dsportalapp.herokuapp.com/tryEditor"

Scenario Outline: enter invalidcode and error message is dispalyed
Given  The user is on the Python Editor
When   The user write the invalid code in Editor
Then    The user should able to see an error message in alert window

Scenario Outline: browser back and click practice
Given The  user is on the Applications of Array page
When  The user clicks Practice Questions link
Then  The user should be redirected to practice page having links like "Search the array." ,"Max Consecutive Ones","Find Numbers with Even Number of Digits" and "Squares of a Sorted Array."

Scenario Outline: open the browser and click max and then  redirect to the page
Given  The user is on Practice page 
When    The user clicks Max consecutive ones link
Then   The user should be redirected to "QUESTION" page contains a question,an tryEditor with Run and Submit buttons

Scenario Outline: without enter the code click the run button
Given  The user is on the Python Editor
When   The user clicks the Run Button without entring the code in the Editor
Then   Nothing happens to the page and no error message is displayed

Scenario Outline: enter invalid code then error message is seen
Given   The user is on the Python Editor
When    The user write the invalid code in Editor
Then    The user should able to see an error message in alert window

Scenario Outline: enter valid and output  can be seen
Given    The user is on the Python Editor
When      The user write the valid code in Editor
Then     The user should able to see output in the console

Scenario Outline: enter valid code and click submit button then error is displayed
Given   The user is on the Python Editor
When     The user write the valid code in Editor
Then     The user see an error message "Error occurred during submission"


Scenario Outline:
Given The user is on Practice page 
When   The user clicks squared of the sorted array link
Then   The user should be redirected to "QUESTION" page contains a question,an tryEditor with Run and Submit buttons

Scenario Outline:
Given   The user is on the Python Editor
When     The user write the valid code in Editor
Then    The user see an error message "Error occurred during submission"










