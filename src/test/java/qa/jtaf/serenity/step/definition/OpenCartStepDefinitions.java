package qa.jtaf.serenity.step.definition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import qa.jtaf.serenity.steps.AccountPageStep;
import qa.jtaf.serenity.steps.HomePageStep;
import qa.jtaf.serenity.steps.LoginPageStep;

public class OpenCartStepDefinitions {

	@Steps
	HomePageStep homePageStep;

	@Steps
	LoginPageStep loginPageStep;

	@Steps
	AccountPageStep accountPageStep;

	@Given("user is on Open Cart home page")
	public void user_is_on_open_cart_home_page() {
		homePageStep.openApp();
	}

	@When("user navigate to Open Cart login page from MyAccount flyout")
	public void user_navigate_to_open_cart_login_page_from_my_account_flyout() {
		homePageStep.verifyNavToLogin();
	}

	@When("user login with username {string} and password {string}")
	public void user_login_with_username_and_password(String userName, String passWord) {
		loginPageStep.verifyLogin(userName, passWord);
	}

	@Then("Open Cart account page should open")
	public void open_cart_account_page_should_open() {
		accountPageStep.verifyAccountPageOpen();
	}

}
