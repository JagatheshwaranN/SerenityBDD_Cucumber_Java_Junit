package qa.jtaf.serenity.pages;



import net.serenitybdd.core.pages.PageObject;

public class HomePage extends PageObject {

	public void typeUserName(String userName) {
		$("#txtUsername").type(userName);
	}

	public void typePassword(String passWord) {
		$("#txtPassword").type(passWord);
	}

	public void clickOnLogin() {
		$("#btnLogin").click();
	}

	

}
