package qa.jtaf.serenity.steps;

import net.thucydides.core.annotations.Step;
import qa.jtaf.serenity.pages.LoginPage;

public class LoginPageStep {
	
	LoginPage loginPage;
	
	@Step("Login to Open Cart application")
	public void verifyLogin(String userName, String passWord) {
		loginPage.doLogin(userName, passWord);
	}

}
