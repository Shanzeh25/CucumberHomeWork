package steps;

import io.cucumber.java.en.When;
import utils.CommonMethods;

public class EmployeeSearchSteps extends CommonMethods {

    @When("user clicks on PIM option")
    public void user_clicks_on_pim_option() {
        //   DashboardPage dash = new DashboardPage();
        click(dash.pimOption);
    }
}
