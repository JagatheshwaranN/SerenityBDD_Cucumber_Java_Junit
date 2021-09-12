package qa.jtaf.serenity.step.definition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import qa.jtaf.serenity.steps.DashboardPageStep;
import qa.jtaf.serenity.steps.HomePageStep;

public class OrangeHRMStepDefinitions {
	
	@Steps
	HomePageStep homePageStep;
	
	@Steps
	DashboardPageStep dashBoardPageStep;

	@Given("user is on Orange HRM login page")
	public void user_is_on_orange_hrm_login_page() {
		homePageStep.openApp();
	}
	
	@When("user login with username {string} and password {string}")
	public void user_login_with_username_and_password(String userName, String passWord) {
		homePageStep.verifyLogin(userName,passWord);
	}

	@Then("Orange HRM dashboard page should open")
	public void orange_hrm_dashboard_page_should_open() {
		dashBoardPageStep.verifyDashBoardPage();
	}
}
