package org.amazon.resources;

import java.io.File;
import java.io.IOException;

import org.amazon.stepdefinition.Hook;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver = Hook.driver;

	public void sendUrl(String url) {
		driver.get(url);
	}

	public String printValue(WebElement e, String v) {
		String v1 = e.getAttribute(v);
		return v1;
	}

	public void enterText(WebElement e, String text) {
		e.sendKeys(text);
	}

	public String text(WebElement e) {
		String txt = e.getText();
		return txt;
	}

	public void maximize() {
		driver.manage().window().maximize();
	}

	public void btnClick(WebElement e) {
		e.click();
	}

	public void quit() {
		driver.quit();
	}

	public void dragDrop(WebElement s, WebElement dest) {
		Actions acc = new Actions(driver);
		acc.dragAndDrop(s, dest).perform();

	}

	public String getValue(WebElement s) {
		String string = s.getAttribute("value");
		return string;
	}

	public void dropDown(WebElement e, String i) {
		Select s = new Select(e);
		s.selectByVisibleText(i);
	}
	
	public void screenShot() throws IOException {
		TakesScreenshot tk=(TakesScreenshot) driver;
         File src = tk.getScreenshotAs(OutputType.FILE);
         File dest = new File("/Users/Nivethaa/Desktop/ScreenShot/amazon.jpg");
         FileUtils.copyFile(src, dest);
	}

}
