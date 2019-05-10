package org.amazon.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {
	public static WebDriver driver;

	@Before
	public void launchBrowswer() {
		System.setProperty("webdriver.chrome.driver", "/Users/Nivethaa/Desktop/chromedriver");
		driver = new ChromeDriver();
	}

//	@After
//	public void close() {
//		driver.quit();
//	}
}
