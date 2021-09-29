package qa.jtaf.serenity.pages;


import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.jtaf.qa.utilities.FileReaderUtility;
import com.jtaf.qa.utilities.LoggerUtility;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class LoginPage extends PageObject {
	
	private static Logger log = LoggerUtility.getLog(LoginPage.class);

	@FindBy(xpath = "//div[@class='well']//h2[text()='Returning Customer']")
	WebElement LoginHeader;

	@FindBy(xpath = "//input[@id='input-email']")
	WebElement UserEmail;
	
	@FindBy(xpath = "//input[@id='input-password']")
	WebElement Password;
	
	@FindBy(xpath = "//input[@value='Login']")
	WebElement LoginButton;
	
	public void validateLoginPageHeader() {
		shouldBeVisible(LoginHeader);
	}
	
	public void doLogin(String userName, String passWord) {
		shouldBeVisible(UserEmail);
		typeInto(UserEmail, FileReaderUtility.getTestData(userName));
		typeInto(Password, FileReaderUtility.getTestData(passWord));
		clickOn(LoginButton);
		Assert.assertEquals(getTitle().trim(), FileReaderUtility.getTestData("account.page.title"));	
	}
	
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
	
}
