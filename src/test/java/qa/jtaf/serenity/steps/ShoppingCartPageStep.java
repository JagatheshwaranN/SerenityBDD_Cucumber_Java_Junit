package qa.jtaf.serenity.steps;

import net.thucydides.core.annotations.Step;
import qa.jtaf.serenity.pages.ShoppingCartPage;

public class ShoppingCartPageStep {

	ShoppingCartPage shoppingCartPage;

	@Step("Open Cart shopping cart page header should display")
	public void verifyShoppingCartPageOpen() {
		shoppingCartPage.validateShoppingCartPageHeader();
	}

	@Step("Added Product details should display in shopping cart")
	public void verifyShoppingCartProductDetails() {
		shoppingCartPage.validateShoppingCartSection();
	}

	@Step("Added Product details should be removed from shopping cart")
	public void verifyShoppingCartProductRemove() {
		shoppingCartPage.validateRemoveProduct();
	}

	@Step("Navigate to Open Cart checkout page from shopping cart page")
	public void verifyNavToCheckout() {
		shoppingCartPage.navigateToCheckoutPage();
	}

}
