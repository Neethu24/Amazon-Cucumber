package org.amazon.objectrepository;

import org.amazon.resources.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "email")
	private WebElement txtEmail;

	@FindBy(id = "continue")
	private WebElement btnCont;

	@FindBy(id = "signInSubmit")
	private WebElement btnSubmit;

	@FindBy(name = "password")
	private WebElement txtPassword;

	public WebElement getTxtEmail() {
		return txtEmail;
	}

	public WebElement getBtnCont() {
		return btnCont;
	}

	public WebElement getBtnSubmit() {
		return btnSubmit;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}


}
