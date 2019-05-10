package org.amazon.objectrepository;

import org.amazon.resources.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseClass {
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@tabindex='25']")
	private WebElement login;
	@FindBy(xpath = "//input[@value='Go']")
	private WebElement btnSearch;

	@FindBy(id = "twotabsearchtextbox")
	private WebElement searchbar;

	public WebElement getSearchbar() {
		return searchbar;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}
	

}
