package org.amazon.stepdefinition;

import java.io.IOException;

import org.amazon.objectrepository.HomePage;
import org.amazon.objectrepository.LoginPage;
import org.amazon.objectrepository.SearchPage;
import org.amazon.resources.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginSteps extends BaseClass {
	HomePage hp = new HomePage();

	@Given("User has to be in login page")
	public void user_has_to_be_in_login_page() {
		sendUrl("https://www.amazon.in/");
		btnClick(hp.getLogin());
	}

	LoginPage lp = new LoginPage();

	@When("User has to type valid user name and continue")
	public void user_has_to_type_valid_user_name_and_continue() {
		enterText(lp.getTxtEmail(), "nivethaasrini@gmail.com");
		btnClick(lp.getBtnCont());
	}

	@When("User has to type valid password and login")
	public void user_has_to_type_valid_password_and_login() {
		enterText(lp.getTxtPassword(), "**********");
		btnClick(lp.getBtnSubmit());
	}

	@Then("User should be redirected to Amazon HomePage")
	public void user_should_be_redirected_to_Amazon_HomePage() {
		String url = driver.getTitle();
		Assert.assertTrue(url.contains("Online"));
	}

	SearchPage sp = new SearchPage();
	@When("User Searches for product and number of product matched")
	public void user_Searches_for_product_and_number_of_product_matched() {
		enterText(hp.getSearchbar(), "iphone");
		btnClick(hp.getBtnSearch());
		String str = text(sp.getCount());
		String[] spl = str.split(" ");
		System.out.println("Number of products matching your search  :"+spl[3]);
		
	}

	@When("User select product with least price")
	public void user_select_product_with_least_price() {
		btnClick(sp.getSort());
		btnClick(sp.getSort1());
		System.out.println("Least Product price : "+text(sp.getLow()));
	}

	@Then("Add to cart and take snapshot")
	public void add_to_cart_and_take_snapshot() throws IOException {
		screenShot();
	}
}
