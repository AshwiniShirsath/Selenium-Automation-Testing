package com.bridgelabz.javaexecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class EnterText_intoDisabledTextbox {
	@Test
	public static void enterText_intoDisabledTextbox() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Driver\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver webdriver = new FirefoxDriver();

		webdriver.get("https://www.facebook.com/");
		webdriver.get("file:///C:/Users/Ashwini/Desktop/home.html");
		//Typecast the driver object to JavascriptExecutor interface type
		JavascriptExecutor js = (JavascriptExecutor) webdriver;
		Thread.sleep(2000);
		//enter "admin" in first textbox using javascript
		js.executeScript("document.getElementById('t1').value='admin'");
		Thread.sleep(2000);
		//clear the value in second textbox using javascript
		js.executeScript("document.getElementById('t2').value=''");
		//enter "manager" in second textbox using javascript
		js.executeScript("document.getElementById('t2').value='manager'");
		//change the second text box to button type using Javascript
		js.executeScript("document.getElementById('t2').type='button'");
		webdriver.close();
	}
}