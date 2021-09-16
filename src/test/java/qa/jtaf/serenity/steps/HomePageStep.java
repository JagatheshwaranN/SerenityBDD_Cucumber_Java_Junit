package qa.jtaf.serenity.steps;


import net.thucydides.core.annotations.Step;
import qa.jtaf.serenity.pages.HomePage;

public class HomePageStep {

	HomePage homePage;

	@Step("Launch the Open Cart application")
	public void openApp() {
		homePage.open();
	}

	@Step("Navigate to Login Page from MyAccount Flyout")
	public void verifyNavToLogin() {
		homePage.navigateToLoginPage();
	}
	
	

	

}
