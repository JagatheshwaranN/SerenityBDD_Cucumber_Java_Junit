package qa.jtaf.serenity.steps;

import net.thucydides.core.annotations.Step;
import qa.jtaf.serenity.pages.HomePage;


public class HomePageStep {

	HomePage homePage;

	@Step("Launch the Orange HRM application")
	public void openApp() {
		homePage.open();
	}

	@Step("Login to Orange HRM application")
	public void verifyLogin(String userName, String passWord) {
		homePage.doLogin(userName, passWord);
	}

}
