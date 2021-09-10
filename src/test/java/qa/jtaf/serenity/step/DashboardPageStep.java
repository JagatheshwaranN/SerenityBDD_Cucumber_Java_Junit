package qa.jtaf.serenity.step;

import net.thucydides.core.annotations.Step;
import qa.jtaf.serenity.pages.DashboardPage;

public class DashboardPageStep {
	
	DashboardPage dashboardPage;
	
	@Step
	public void verifyDashBoard() {
		dashboardPage.checkDashBoard();
	}


}
