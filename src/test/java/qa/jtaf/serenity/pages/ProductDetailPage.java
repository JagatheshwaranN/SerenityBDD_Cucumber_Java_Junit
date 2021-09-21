package qa.jtaf.serenity.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;

import com.jtaf.qa.utilities.LoggerUtility;

import net.serenitybdd.core.annotations.findby.FindBy;

public class ProductDetailPage {
	
private static Logger log = LoggerUtility.getLog(ProductDetailPage.class);
	
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
	

}
