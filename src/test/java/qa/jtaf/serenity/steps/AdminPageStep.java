package qa.jtaf.serenity.steps;

import net.thucydides.core.annotations.Step;
import qa.jtaf.serenity.pages.AdminPage;


public class AdminPageStep {
	
	
AdminPage adminPage;
	
	@Step("Verify the dashboard page sections")
	public void redirectToUsersPage() {
		adminPage.navigateToUsersPage();
	}

}
