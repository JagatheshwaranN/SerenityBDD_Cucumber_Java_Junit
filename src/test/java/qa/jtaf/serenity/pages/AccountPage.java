package qa.jtaf.serenity.pages;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.jtaf.qa.utilities.FileReaderUtility;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class AccountPage extends PageObject {

	@FindBy(xpath = "//ul[@class='breadcrumb']//i[@class='fa fa-home']")
	WebElement HomeBreadcrumb;

	@FindBy(xpath = "//ul[@class='breadcrumb']//a[text()='Account']")
	WebElement MyAccountBreadcrumb;

	@FindBy(xpath = "//h2[text()='My Account']")
	WebElement MyAccountHeader;

	public void validateAccountPageHeader() {
		shouldBeVisible(MyAccountBreadcrumb);
		shouldBeVisible(MyAccountHeader);
	}
	
	public void navigateToHomePage() {
		clickOn(HomeBreadcrumb);
		Assert.assertEquals(getTitle().trim(), FileReaderUtility.getTestData("home.page.title"));
	}

}
