package qa.jtaf.serenity.pages;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.jtaf.qa.utilities.FileReaderUtility;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class CheckoutPage extends PageObject {

	@FindBy(xpath = "//h1[text()='Checkout']")
	WebElement CheckoutTitle;
	
	@FindBy(xpath = "//input[@name='payment_address' and @value='new']")
	WebElement EnterNewBillingAddressRadioButton;
	
	@FindBy(id = "input-payment-firstname")
	WebElement BillingFirstName;

	@FindBy(id = "input-payment-lastname")
	WebElement BillingLasttName;

	@FindBy(id = "input-payment-company")
	WebElement BillingCompany;

	@FindBy(id = "input-payment-address-1")
	WebElement BillingAddress;

	@FindBy(id = "input-payment-city")
	WebElement BillingCity;

	@FindBy(id = "input-payment-postcode")
	WebElement BillingPostCode;

	@FindBy(id = "input-payment-country")
	WebElement BillingCountry;

	@FindBy(id = "input-payment-zone")
	WebElement BillingRegion;

	@FindBy(xpath = "//input[@id='button-payment-address']")
	WebElement BillingDetailsContinue;

	@FindBy(xpath = "//div[@id='collapse-shipping-address']//select[@name='address_id']")
	WebElement DeliveryExistingAddressSection;

	@FindBy(xpath = "//input[@id='button-shipping-address']")
	WebElement DeliveryDetailsContinue;

	@FindBy(xpath = "//div[@id='collapse-shipping-method']//div[@class='radio']//label")
	WebElement DeliveryCharge;

	@FindBy(name = "comment")
	WebElement OrderComments;

	@FindBy(xpath = "//input[@id='button-shipping-method']")
	WebElement DeliveryMethodContinue;

	@FindBy(xpath = "//div[@id='collapse-payment-method']//div[@class='radio']//label")
	WebElement CashOnDelivery;

	@FindBy(xpath = "//input[@type='checkbox' and @name='agree']")
	WebElement TermsAndConditions;

	@FindBy(xpath = "//input[@id='button-payment-method']")
	WebElement PaymentMethodContinue;

	@FindBy(xpath = "//div[@class='table-responsive']")
	WebElement ProductDetailsSection;

	@FindBy(xpath = "//input[@id='button-confirm']")
	WebElement ConfirmOrder;

	@FindBy(xpath = "//div[@id='content']//h1[text()='Your order has been placed!']")
	WebElement PlaceOrderSuccessMessage;

	@FindBy(xpath = "//div[@id='content']//p[text()='Your order has been successfully processed!']")
	WebElement PlaceOrderMessage;

	public void validateCheckoutPageHeader() {
		shouldBeVisible(CheckoutTitle);
	}

	public void enterBillingDetails(String billingDetails) {
		String[] billingData = FileReaderUtility.getTestData(billingDetails).split(",");
		shouldBeVisible(EnterNewBillingAddressRadioButton);
		clickOn(EnterNewBillingAddressRadioButton);
		shouldBeVisible(BillingFirstName);
		typeInto(BillingFirstName, billingData[0]);
		typeInto(BillingLasttName, billingData[1]);
		typeInto(BillingCompany, billingData[2]);
		typeInto(BillingAddress, billingData[3]);
		typeInto(BillingCity, billingData[4]);
		typeInto(BillingPostCode, billingData[5]);
		selectFromDropdown(BillingCountry, billingData[6]);
		selectFromDropdown(BillingRegion, billingData[7]);
		clickOn(BillingDetailsContinue);
	}
	
	public void enterDeliveryDetails() {
		waitFor(DeliveryExistingAddressSection);
		shouldBeVisible(DeliveryExistingAddressSection);
		clickOn(DeliveryDetailsContinue);
	}
	
	public void enterDeliveryMethodDetails() {
		waitFor(DeliveryCharge);
		shouldBeVisible(DeliveryCharge);
		typeInto(OrderComments, "Pack Safely");
		clickOn(DeliveryMethodContinue);
	}
	
	public void enterPaymentMethodDetails() {
		waitFor(CashOnDelivery);
		shouldBeVisible(CashOnDelivery);
		clickOn(TermsAndConditions);
		clickOn(PaymentMethodContinue);
	}
	
	public void validateCheckoutProductDetailsAndPlaceOrder() {
		waitFor(ProductDetailsSection);
		shouldBeVisible(ProductDetailsSection);
		clickOn(ConfirmOrder);
		waitForTitleToAppear(FileReaderUtility.getTestData("place.order.page.title"));
		Assert.assertEquals(getTitle().trim(), FileReaderUtility.getTestData("place.order.page.title"));	
	}
	
	public void validatePlaceOrderSuccess() {
		shouldBeVisible(PlaceOrderSuccessMessage);
		shouldBeVisible(PlaceOrderMessage);
	}
	
}
