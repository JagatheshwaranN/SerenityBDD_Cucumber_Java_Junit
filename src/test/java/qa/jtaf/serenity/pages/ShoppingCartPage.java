package qa.jtaf.serenity.pages;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.jtaf.qa.utilities.FileReaderUtility;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class ShoppingCartPage extends PageObject {

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
	
	@FindBy(xpath = "//button[@data-original-title='Remove']")
	WebElement RemoveProduct;
	
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

	public void validateShoppingCartPageHeader() {
		shouldBeVisible(ShoppingCartTitle);
	}

	public void validateShoppingCartSection() {
		shouldBeVisible(ShoppingCartProductTable);
		shouldBeVisible(ProductImage);
		shouldBeVisible(ProductDetail);
		shouldBeVisible(ProductModel);
		shouldBeVisible(ProductQuantity);
		shouldBeVisible(ProductUnitPrice);
		shouldBeVisible(ProductTotal);
		shouldBeVisible(UseCouponCodeSection);
		shouldBeVisible(ShippingAndTaxesSection);
		shouldBeVisible(UseGiftCertificateSection);
		shouldBeVisible(TotalSection);
	}
	
	public void validateRemoveProduct() {
		shouldBeVisible(RemoveProduct);
		clickOn(RemoveProduct);
	}
	
	public void navigateToCheckoutPage() {
		shouldBeVisible(CheckoutButton);
		clickOn(CheckoutButton);
		Assert.assertEquals(getTitle().trim(), FileReaderUtility.getTestData("checkout.page.title"));
	}

}
