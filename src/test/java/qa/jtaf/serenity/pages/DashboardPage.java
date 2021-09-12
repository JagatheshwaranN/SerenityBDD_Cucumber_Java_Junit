package qa.jtaf.serenity.pages;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class DashboardPage extends PageObject {

	@FindBy(id = "menu_dashboard_index")
	WebElement dashBoardOption;
	
	@FindBy(xpath="//h1[text()='Dashboard']")
	WebElement dashBoardHeader;
	
	@FindBy(xpath="//div[@id='group_0' and @class='maincontent group-wrapper']")
	WebElement appsQuickLaunch;
	
	@FindBy(id="panel_draggable_1_0")
	WebElement employeeDistributionGraph;
	
	@FindBy(id="panel_draggable_1_1")
	WebElement legends;
	
	@FindBy(id="panel_draggable_1_2")
	WebElement pendingLeaveRequests;
	

	public void validateDashBoard() {
		shouldBeVisible(dashBoardHeader);
		shouldBeVisible(appsQuickLaunch);
		shouldBeVisible(employeeDistributionGraph);
		shouldBeVisible(legends);
		shouldBeVisible(pendingLeaveRequests);		
	}

}
