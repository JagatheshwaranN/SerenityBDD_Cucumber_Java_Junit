package qa.jtaf.serenity.steps;

import net.thucydides.core.annotations.Step;
import qa.jtaf.serenity.pages.AccountPage;

public class AccountPageStep {
	
	AccountPage accountPage;
	
	@Step("Open Cart Account Page should open")
	public void verifyAccountPageOpen() {
		accountPage.validateAccountPageHeader();
	}

}
