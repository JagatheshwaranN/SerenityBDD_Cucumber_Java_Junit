package qa.jtaf.serenity.steps;

import net.thucydides.core.annotations.Step;
import qa.jtaf.serenity.pages.AccountPage;

public class AccountPageStep {
	
	AccountPage accountPage;
	
	@Step("Open Cart account page header should display")
	public void verifyAccountPageOpen() {
		accountPage.validateAccountPageHeader();
	}

	@Step("Navigate to Open Cart home page")
	public void verifyNavToHome() {
		accountPage.navigateToHomePage();
	}

}
