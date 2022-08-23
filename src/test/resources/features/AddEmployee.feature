Feature: This feature is  going to add employees in HRMS application

  Background:
    When user enters valid admin username and password
    And user clicks on login button
    Then admin user is successfully logged in
    When user clicks on PIM option
    And user clicks on add employee option

  @smoke @hw
  Scenario: Add an employee
    When user enters firstName , middleName and lastName
    And user clicks on save button
    When user clicks on edit
    And enters nick name
    When user enters license number
    And user enters other id
    When user enters ssn no
    And user enters sin no
    When user enters military service
    And Click in license Expiry date calender
    When user click on month and select month
    And user click on year and select year
    When user select date
    And user clicks on DOB
    When user select month and year
    And user click on date
    When user clicks on marital status
    And user select the status
    When user click on nationality and select it
    And user ticks on smoker
    When user select the gender
    And user clicks on save button
    Then employee added successfully