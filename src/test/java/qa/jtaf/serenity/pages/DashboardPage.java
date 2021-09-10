package qa.jtaf.serenity.pages;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;

public class DashboardPage extends PageObject{
	
	public void checkDashBoard() {
		shouldBeVisible(By.id("menu_dashboard_index"));
	}

}
