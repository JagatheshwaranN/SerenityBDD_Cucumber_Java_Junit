package qa.jtaf.serenity.pages;


import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class ProductDetailPage extends PageObject {

	@FindBy(xpath = "//div[@id='content']")
	WebElement ProductSection;

	@FindBy(xpath = "//div[@id='content']//h1")
	WebElement ProductTitle;

	@FindBy(xpath = "//div[@id='content']//li//h2")
	WebElement ProductPrice;

	@FindBy(xpath = "//div[@id='product']//h3[text()='Available Options']")
	WebElement AvailableOptionsHeader;

	@FindBy(xpath = "//div[@class='input-group date']")
	WebElement DeliveryDate;

	@FindBy(xpath = "//input[@id='input-quantity']")
	WebElement ProductQuantity;

	@FindBy(xpath = "//button[@id='button-cart']")
	WebElement AddToCartButton;

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement AddToCartSuccessMessage;

	@FindBy(xpath = "//button[@type='button']//i[@class='fa fa-shopping-cart']")
	WebElement ShoppingCartIcon;

	@FindBy(xpath = "//ul[@class='dropdown-menu pull-right']")
	WebElement ShoppingCartViewDrop;

	@FindBy(xpath = "//a//Strong[contains(text(),'View Cart')]")
	WebElement ViewCartButton;

	@FindBy(xpath = "//a//Strong[contains(text(),'Checkout')]")
	WebElement CheckoutButton;

	public void validateProductDetailPageHeader() {
		shouldBeVisible(ProductTitle);
	}

	public void addProductToCart() {
		shouldBeVisible(ProductTitle);
		shouldBeVisible(ProductSection);
		shouldBeVisible(ProductPrice);
		shouldBeVisible(AvailableOptionsHeader);
		shouldBeVisible(DeliveryDate);
		shouldBeVisible(ProductQuantity);
		shouldBeVisible(AddToCartButton);
		clickOn(AddToCartButton);
		shouldBeVisible(AddToCartSuccessMessage);
	}

	public void navigateToShoppingCartPage() {
		shouldBeVisible(ShoppingCartIcon);
		clickOn(ShoppingCartIcon);
		shouldBeVisible(ShoppingCartViewDrop);
		shouldBeVisible(ViewCartButton);
		clickOn(ViewCartButton);
	}

}
