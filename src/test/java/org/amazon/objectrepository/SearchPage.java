package org.amazon.objectrepository;

import org.amazon.resources.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends BaseClass {
	public SearchPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[contains(text(),'results')]")
	private WebElement Count;
	@FindBy(xpath = "//span[contains(text(),'Sort')]//following-sibling::span")
	private WebElement sort;
	@FindBy(xpath = "//a[contains(text(),'Price: Low to High')]")
	private WebElement sort1;
	@FindBy(xpath = "(//span[text()='₹']//following-sibling::span)[1]")
	private WebElement low;

	public WebElement getCount() {
		return Count;
	}

	public WebElement getSort() {
		return sort;
	}

	public WebElement getSort1() {
		return sort1;
	}

	public WebElement getLow() {
		return low;
	}

}
