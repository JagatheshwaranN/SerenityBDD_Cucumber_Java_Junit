package qa.jtaf.serenity.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;

import com.jtaf.qa.utilities.FileReaderUtility;
import com.jtaf.qa.utilities.LoggerUtility;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class HomePage extends PageObject {

	private static Logger log = LoggerUtility.getLog(HomePage.class);

	@FindBy(xpath = "//div[@id='divLogo']/img")
	WebElement orangeHRMLogo;

	@FindBy(id = "divLoginForm")
	WebElement loginForm;

	@FindBy(id = "txtUsername")
	WebElement userName;

	@FindBy(id = "txtPassword")
	WebElement passWord;

	@FindBy(id = "btnLogin")
	WebElement loginButton;

	public void doLogin(String user, String pass) {
		log.info("The login method execution started");
		shouldBeVisible(orangeHRMLogo);
		shouldBeVisible(loginForm);
		typeInto(userName, FileReaderUtility.getTestData(user));
		typeInto(passWord, FileReaderUtility.getTestData(pass));
		clickOn(loginButton);
		log.info("The login method execution ended");
	}

}
