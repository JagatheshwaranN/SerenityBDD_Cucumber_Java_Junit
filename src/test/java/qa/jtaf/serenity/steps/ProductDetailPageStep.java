package qa.jtaf.serenity.steps;

import net.thucydides.core.annotations.Step;
import qa.jtaf.serenity.pages.ProductDetailPage;

public class ProductDetailPageStep {

	ProductDetailPage productDetailPage;

	@Step("Open Cart product detail page header should display")
	public void verifyProductDetailPageOpen() {
		productDetailPage.validateProductDetailPageHeader();
	}

	@Step("User should able to add product to shopping cart")
	public void verifyAddProductToCart() {
		productDetailPage.addProductToCart();
	}

	@Step("Navigate to Open Cart shopping cart page from product view drop")
	public void verifyNavToCart() {
		productDetailPage.navigateToShoppingCartPage();
	}
}