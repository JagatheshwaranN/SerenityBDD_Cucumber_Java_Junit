package qa.jtaf.serenity.steps;


import net.thucydides.core.annotations.Step;
import qa.jtaf.serenity.pages.HomePage;

public class HomePageStep {

	HomePage homePage;

	@Step("Open Cart application launch")
	public void openApp() {
		homePage.open();
	}

	@Step("Navigate to Open Cart login page from myAccount flyout")
	public void verifyNavToLogin() {
		homePage.navigateToLoginPage();
	}
	
	@Step("Open Cart home page header should display")
	public void verifyHomePageOpen() {
		homePage.validateHomePageHeader();
	}

	@Step("User should search for product in home page")
	public void verifyProductSearch(String product) {
		homePage.searchProduct(product);
	}
	
	@Step("User should click add to cart in home page")
	public void verifyProductAddToCart() {
		homePage.productAddToCart();
	}

}
