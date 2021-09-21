package qa.jtaf.serenity.pages;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.jtaf.qa.utilities.FileReaderUtility;
import com.jtaf.qa.utilities.LoggerUtility;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
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
	
	@Before
	public void setup() throws IOException {
		FileReaderUtility.loadPropertyFile();
	}
		
	@After
	public void after(Scenario scenario) {
		try {
			if (scenario.isFailed()) {
				try {
					log.info("FAILED ***** : " + scenario.getName());
					final byte[] screenshot = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES);
					scenario.attach(screenshot, "image/jpeg", scenario.getName());
				} catch (Exception ex) {
					log.info("Exception occured while capture screenshot : " + ex);
				}
			} else {
				try {
					log.info("PASSED ***** : " + scenario.getName());
					final byte[] screenshot = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES);
					scenario.attach(screenshot, "image/jpeg", scenario.getName());
				} catch (Exception ex) {
					log.info("Exception occured while capture screenshot : " + ex);
				}
			}
		} catch (Exception ex) {
			log.info("Error occured while close of the TEST" + "\n" + ex);
		}
	}

	public void navigateToLoginPage() {
		shouldBeVisible(OpenCartLogo);
		shouldBeVisible(MyAccountFlyout);
		clickOn(MyAccountFlyout);
		clickOn(LoginFlyout);
	}

}
