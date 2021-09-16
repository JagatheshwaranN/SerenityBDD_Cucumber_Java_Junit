package qa.jtaf.serenity.pages;


import org.openqa.selenium.WebElement;

import com.jtaf.qa.utilities.FileReaderUtility;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class LoginPage extends PageObject {

	@FindBy(xpath = "//div[@class='well']//h2[text()='Returning Customer']")
	WebElement LoginHeader;

	@FindBy(xpath = "//input[@id='input-email']")
	WebElement UserEmail;
	
	@FindBy(xpath = "//input[@id='input-password']")
	WebElement Password;
	
	@FindBy(xpath = "//input[@value='Login']")
	WebElement LoginButton;
	
	public void doLogin(String userName, String passWord) {
		shouldBeVisible(LoginHeader);
		typeInto(UserEmail, FileReaderUtility.getTestData(userName));
		typeInto(Password, FileReaderUtility.getTestData(passWord));
		clickOn(LoginButton);
	}
	
}
