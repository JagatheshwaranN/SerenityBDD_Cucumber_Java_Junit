package qa.jtaf.serenity.pages;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;

public class CheckoutPage {

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
	
}
