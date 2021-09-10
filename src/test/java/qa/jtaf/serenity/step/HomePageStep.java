package qa.jtaf.serenity.step;

import net.thucydides.core.annotations.Step;
import qa.jtaf.serenity.pages.HomePage;

public class HomePageStep {

	HomePage homePage;

	@Step
	public void openApp() {
		homePage.open();
	}

	@Step
	public void enterUserName(String userName) {
		homePage.typeUserName(userName);
	}

	@Step
	public void enterPassword(String passWord) {
		homePage.typePassword(passWord);
	}

	@Step
	public void clickLogin() {
		homePage.clickOnLogin();
	}

}
