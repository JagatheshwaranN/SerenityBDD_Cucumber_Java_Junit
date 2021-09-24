package qa.jtaf.serenity.step.definition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import qa.jtaf.serenity.steps.AccountPageStep;
import qa.jtaf.serenity.steps.HomePageStep;
import qa.jtaf.serenity.steps.LoginPageStep;
import qa.jtaf.serenity.steps.ProductDetailPageStep;
import qa.jtaf.serenity.steps.ShoppingCartPageStep;

public class OpenCartStepDefinitions {

	@Steps
	HomePageStep homePageStep;

	@Steps
	LoginPageStep loginPageStep;

	@Steps
	AccountPageStep accountPageStep;

	@Steps
	ProductDetailPageStep productDetailPageStep;

	@Steps
	ShoppingCartPageStep shoppingCartPageStep;

	@Given("user is on Open Cart home page")
	public void user_is_on_open_cart_home_page() {
		homePageStep.openApp();
	}

	@When("user navigate to Open Cart login page from MyAccount flyout")
	public void user_navigate_to_open_cart_login_page_from_my_account_flyout() {
		homePageStep.verifyNavToLogin();
	}

	@When("user login with username {string} and password {string}")
	public void user_login_with_username_and_password(String userName, String passWord) {
		loginPageStep.verifyLogin(userName, passWord);
	}

	@Then("Open Cart account page should open")
	public void open_cart_account_page_should_open() {
		accountPageStep.verifyAccountPageOpen();
	}

	@Then("user navigate to Open Cart home page from account page")
	public void user_navigate_to_open_cart_home_page_from_account_page() {
		accountPageStep.verifyNavToHome();
		homePageStep.verifyHomePageOpen();
	}

	@Then("user search for product {string}")
	public void user_search_for_product(String product) {
		homePageStep.verifyProductSearch(product);
	}

	@When("user clicks Add to cart button")
	public void user_clicks_add_to_cart_button() {
		homePageStep.verifyProductAddToCart();
	}

	@Then("Open Cart product detail page should open")
	public void open_cart_product_detail_page_should_open() {
		productDetailPageStep.verifyProductDetailPageOpen();
	}

	@Then("user add product to shopping cart")
	public void user_add_product_to_shopping_cart() {
		productDetailPageStep.verifyAddProductToCart();
	}

	@When("user navigate to Open Cart shopping cart page from product view drop")
	public void user_navigate_to_open_cart_shopping_cart_page_from_product_view_drop() {
		productDetailPageStep.verifyNavToCart();
	}

	@Then("Open Cart shopping cart page should open")
	public void open_cart_shopping_cart_page_should_open() {
		shoppingCartPageStep.verifyShoppingCartPageOpen();
	}

	@Then("user verify the product details in shopping cart")
	public void user_verify_the_product_details_in_shopping_cart() {
		shoppingCartPageStep.verifyShoppingCartProductDetails();
	}

	@Then("user remove the product from shopping cart")
	public void user_remove_product_from_shopping_cart() {
		shoppingCartPageStep.verifyShoppingCartProductRemove();
	}

	@When("user navigate to Open Cart checkout page")
	public void user_navigate_to_open_cart_checkout_page() {

	}

	@When("user enters the checkout billing, delivery, payment details {string} and place order")
	public void user_enters_the_checkout_billing_delivery_payment_details_and_place_order(String string) {

	}

	@Then("place order success message should display")
	public void place_order_success_message_should_display() {

	}

}
