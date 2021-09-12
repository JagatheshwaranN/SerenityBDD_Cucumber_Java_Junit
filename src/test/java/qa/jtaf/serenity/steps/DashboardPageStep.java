package qa.jtaf.serenity.steps;

import net.thucydides.core.annotations.Step;
import qa.jtaf.serenity.pages.DashboardPage;

public class DashboardPageStep {
	
	DashboardPage dashboardPage;
	
	@Step("Verify the dashboard page sections")
	public void verifyDashBoardPage() {
		dashboardPage.validateDashBoard();
	}


}
