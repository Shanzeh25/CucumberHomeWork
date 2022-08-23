Feature: This feature is  going to add employees in HRMS application

  Background:
    When user enters valid admin username and password
    And user clicks on login button
    Then admin user is successfully logged in
    When user clicks on PIM option
    And user clicks on add employee option

  @smoke @hw
  Scenario: Add an employee
    * user enters firstName , middleName and lastName
    * user clicks on edit
    * enters nick name
    * user enters license number
    * user enters other id
    * user enters ssn no
    * user enters sin no
    * user enters military service
    * Click in license Expiry date calender
    * user click on month and select month
    * user click on year and select year
    * user select date
    * user clicks on DOB
    * user select month and year
    * user click on date
    * user clicks on marital status
    * user select the status
    * user click on nationality and select it
    * user ticks on smoker
    * user select the gender
    * user clicks on save button
    * employee added successfully