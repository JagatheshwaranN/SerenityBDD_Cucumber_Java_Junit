package qa.jtaf.serenity.pages;

import org.apache.log4j.Logger;

import org.openqa.selenium.WebElement;

import com.jtaf.qa.utilities.FileReaderUtility;
import com.jtaf.qa.utilities.LoggerUtility;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class HomePage extends PageObject {

	private static Logger log = LoggerUtility.getLog(HomePage.class);

	@FindBy(xpath = "//div[@id='logo']//a[text()='Your Store']")
	WebElement OpenCartLogo;

	@FindBy(xpath = "//span[text()='My Account']")
	WebElement MyAccountFlyout;

	@FindBy(xpath = "//ul[@class='dropdown-menu dropdown-menu-right']//li//a[text()='Login']")
	WebElement LoginFlyout;

	@FindBy(xpath = "//nav[@class='navbar']")
	WebElement CategoriesNavigationBar;

	@FindBy(xpath = "//input[@name='search']")
	WebElement SearchBar;

	@FindBy(xpath = "//button[@class='btn btn-default btn-lg']")
	WebElement SearchButton;

	@FindBy(xpath = "//div[@id='content']//h1[contains(text(),'Search')]")
	WebElement SearchResultHeader;
	
	@FindBy(xpath = "//div[@class='product-thumb']")
	WebElement ProductSection;
	
	@FindBy(xpath = "(//div[@class='swiper-container swiper-container-horizontal'])[1]")
	WebElement ImageSwiperSection;

	@FindBy(xpath = "(//button[@type='button']//span[contains(@class,'hidden-xs hidden-sm hidden-md')])[1]")
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

	public void validateHomePageHeader() {
		shouldBeVisible(ImageSwiperSection);
	}
	
	public void navigateToLoginPage() {
		shouldBeVisible(OpenCartLogo);
		shouldBeVisible(MyAccountFlyout);
		clickOn(MyAccountFlyout);
		clickOn(LoginFlyout);
	}

	public void searchProduct(String product) {
		shouldBeVisible(SearchBar);
		typeInto(SearchBar, FileReaderUtility.getTestData(product));
		clickOn(SearchButton);
		shouldBeVisible(SearchResultHeader);
		shouldBeVisible(ProductSection);
	}
	
	public void productAddToCart() {
		shouldBeVisible(ProductSection);
		clickOn(AddToCartButton);	
	}
	
	

}
