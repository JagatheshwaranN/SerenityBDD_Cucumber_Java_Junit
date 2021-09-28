package qa.jtaf.serenity.steps;

import net.thucydides.core.annotations.Step;
import qa.jtaf.serenity.pages.CheckoutPage;

public class CheckoutPageStep {

	CheckoutPage checkoutPage;

	@Step("Open Cart checkout page header should display")
	public void verifyCheckoutPageOpen() {
		checkoutPage.validateCheckoutPageHeader();
	}

	@Step("Billing details should be entered into billing section")
	public void verifyAddBillingDetails(String billingData) {
		checkoutPage.enterBillingDetails(billingData);
	}

	@Step("Delivery details should be entered into delivery section")
	public void verifyAddDeliveryDetails() {
		checkoutPage.enterDeliveryDetails();
	}

	@Step("Delivery method details should be entered into delivery method section")
	public void verifyAddDeliveryMethodDetails() {
		checkoutPage.enterDeliveryMethodDetails();
	}

	@Step("Payment method details should be entered into payment method section")
	public void verifyAddPaymentMethodDetails() {
		checkoutPage.enterPaymentMethodDetails();
	}

	@Step("Review product details in checkout section and place order")
	public void verifyProductDetailsAndPlaceOrder() {
		checkoutPage.validateCheckoutProductDetailsAndPlaceOrder();
	}

	@Step("Placed order success message should display")
	public void verifyPalceOrderSuccess() {
		checkoutPage.validatePlaceOrderSuccess();
	}

}
