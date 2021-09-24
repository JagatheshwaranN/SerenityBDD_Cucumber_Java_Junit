package qa.jtaf.serenity.steps;

import net.thucydides.core.annotations.Step;
import qa.jtaf.serenity.pages.ShoppingCartPage;

public class ShoppingCartPageStep {
	
	ShoppingCartPage shoppingCartPage;
	
	@Step("Open Cart shopping cart page header should display")
	public void verifyShoppingCartPageOpen() {
		shoppingCartPage.validateShoppingCartPageHeader();
	}
	
	@Step("Verify Product details in shopping cart")
	public void verifyShoppingCartProductDetails() {
		shoppingCartPage.validateShoppingCartSection();
	}

}
