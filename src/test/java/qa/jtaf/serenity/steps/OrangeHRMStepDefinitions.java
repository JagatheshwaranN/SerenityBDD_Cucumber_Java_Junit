package qa.jtaf.serenity.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import qa.jtaf.serenity.step.DashboardPageStep;
import qa.jtaf.serenity.step.HomePageStep;

public class OrangeHRMStepDefinitions {
	
	@Steps
	HomePageStep homePageStep;
	
	@Steps
	DashboardPageStep dashBoardPageStep;

	@Given("user is on Orange HRM login page")
	public void user_is_on_orange_hrm_login_page() {
		homePageStep.openApp();
	}

	@When("user enters username {string}")
	public void user_enters_username(String userName) {
		homePageStep.enterUserName(userName);
	}

	@When("user enters password {string}")
	public void user_enters_password(String passWord) {
		homePageStep.enterPassword(passWord);

	}

	@When("user clicks login button")
	public void user_clicks_login_button() {
		homePageStep.clickLogin();
	}

	@Then("Orange HRM dashboard page should open")
	public void orange_hrm_dashboard_page_should_open() {
		dashBoardPageStep.verifyDashBoard();
	}
}
