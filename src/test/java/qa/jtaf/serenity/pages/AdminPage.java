package qa.jtaf.serenity.pages;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class AdminPage extends PageObject {

	@FindBy(id = "menu_admin_viewAdminModule")
	WebElement adminOption;

	public void navigateToUsersPage() {
		shouldBeVisible(adminOption);

	}
}
