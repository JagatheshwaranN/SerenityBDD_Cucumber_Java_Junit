package qa.jtaf.serenity.pages;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;

public class ShoppingCartPage {
	
	
	@FindBy(xpath = "//div[@id='content']//h1[contains(text(),'Shopping Cart')]")
	WebElement ShoppingCartTitle;
	
	@FindBy(xpath = "//div[@class='table-responsive']//table[@class='table table-bordered']")
	WebElement ShoppingCartProductTable;
	
	@FindBy(xpath = "//div[@class='table-responsive']//td[@class='text-center']//a//img")
	WebElement ProductImage;
	
	@FindBy(xpath = "(//div[@class='table-responsive']//tbody//td[@class='text-left'])[1]")
	WebElement ProductDetail;
	
	@FindBy(xpath = "(//div[@class='table-responsive']//tbody//td[@class='text-left'])[2]")
	WebElement ProductModel;
	
	@FindBy(xpath = "//div[@class='table-responsive']//tbody//td[@class='text-left']//input[contains(@name,'quantity')]")
	WebElement ProductQuantity;
	
	@FindBy(xpath = "(//div[@class='table-responsive']//tbody//td[@class='text-right'])[1]")
	WebElement ProductUnitPrice;
	
	@FindBy(xpath = "(//div[@class='table-responsive']//tbody//td[@class='text-right'])[2]")
	WebElement ProductTotal;
	
	@FindBy(xpath = "//h4[@class='panel-title']//a[@href='#collapse-coupon']")
	WebElement UseCouponCodeSection;
	
	@FindBy(xpath = "//h4[@class='panel-title']//a[@href='#collapse-shipping']")
	WebElement ShippingAndTaxesSection;
	
	@FindBy(xpath = "//h4[@class='panel-title']//a[@href='#collapse-voucher']")
	WebElement UseGiftCertificateSection;
	
	@FindBy(xpath = "//div[@class='col-sm-4 col-sm-offset-8']//table//tbody")
	WebElement TotalSection;
	
	@FindBy(xpath = "//a[@class='btn btn-primary'][text()='Checkout']")
	WebElement CheckoutButton;
	
	@FindBy(xpath = "//a[@class='btn btn-default'][text()='Continue Shopping']")
	WebElement ContinueShoppingButton;

}
