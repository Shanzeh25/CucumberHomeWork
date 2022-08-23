package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;
import utils.CommonMethods;

import static steps.PageInitializer.addEmployeePage;
import static steps.PageInitializer.dash;

public class AddEmployeeSteps extends CommonMethods {

    @When("user clicks on add employee option")
    public void user_clicks_on_add_employee_option() {
        click(dash.addEmployeeOption);
    }

    @When("user enters firstName , middleName and lastName")
    public void user_enters_first_name_middle_name_and_last_name() {
        sendText(addEmployeePage.firstName, "shanzeh");
        sendText(addEmployeePage.middleName, "asif");
        sendText(addEmployeePage.lastName, "ch");
    }

    @When("user clicks on save button")
    public void user_clicks_on_save_button() {
        click(addEmployeePage.saveButton);
    }
    @When("user clicks on edit")
    public void user_clicks_on_edit() { click(addEmployeePage.edit);}

    @When("enters nick name")
    public void enters_nick_name() {
        sendText(addEmployeePage.nickName,"SA");
    }
    @When("user enters license number")
    public void user_enters_license_number() {
       sendText(addEmployeePage.licenseNo,"2610");
    }
    @When("user enters other id")
    public void user_enters_other_id() {
        sendText(addEmployeePage.otherID,"26101996");
    }
    @When("user enters ssn no")
    public void user_enters_ssn_no() {
       sendText(addEmployeePage.ssnNo,"12");
    }
    @When("user enters sin no")
    public void user_enters_sin_no() {
        sendText(addEmployeePage.sinNo,"34");
    }
    @When("user enters military service")
    public void user_enters_military_service() {
       sendText(addEmployeePage.militaryService,"123456");
    }
    @When("Click in license Expiry date calender")
    public void click_in_license_expiry_date_calender() {
       click(addEmployeePage.calenderExpiryIcon);
    }
    @When("user click on month and select month")
    public void user_click_on_month_and_select_month() {
        click(addEmployeePage.monthClick);
        Select select = new Select(addEmployeePage.monthClick);
        select.selectByVisibleText("Sep");
    }
    @When("user click on year and select year")
    public void user_click_on_year_and_select_year() {
        click(addEmployeePage.yearClick);
        Select select = new Select(addEmployeePage.yearClick);
        select.selectByVisibleText("2021");
    }
    @When("user select date")
    public void user_select_date() {
        click(addEmployeePage.date);
    }

    @When("user clicks on DOB")
    public void user_clicks_on_dob() {
        click(addEmployeePage.dob);
    }
    @When("user select month and year")
    public void user_select_month_and_year() {
        click(addEmployeePage.monthClick);
        Select select = new Select(addEmployeePage.monthClick);
        select.selectByVisibleText("Oct");
        click(addEmployeePage.yearClick);
        select = new Select(addEmployeePage.yearClick);
        select.selectByVisibleText("2020");
    }

    @When("user click on date")
    public void user_click_on_date() {
       click(addEmployeePage.dobDate);
    }

    @When("user clicks on marital status")
    public void user_clicks_on_marital_status() {
       click(addEmployeePage.maritalStatus);
    }
    @When("user select the status")
    public void user_select_the_status() {
        Select select = new Select(addEmployeePage.maritalStatus);
        select.selectByVisibleText("Married");
    }

    @When("user click on nationality and select it")
    public void user_click_on_nationality_and_select_it() {
       click(addEmployeePage.nationality);
        Select select = new Select(addEmployeePage.nationality);
        select.selectByVisibleText("Pakistani");

    }

    @When("user ticks on smoker")
    public void user_ticks_on_smoker() {
       click(addEmployeePage.smoker);
    }
    @When("user select the gender")
    public void user_select_the_gender() {
        click(addEmployeePage.gender);
    }


    @Then("employee added successfully")
    public void employee_added_successfully() {
        //homework - verify added employee
        System.out.println("Employee added");
    }


}
