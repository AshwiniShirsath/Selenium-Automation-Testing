package com.bridgelabz.webelementinterfacemethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class EnterTextintoFocussedElement {
	@Test
	public static void enterTextintoFocussedElement() {
		System.setProperty("webdriver.gecko.driver", "C:\\Driver\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver webdriver = new FirefoxDriver();

		webdriver.get("https://www.facebook.com/");
		webdriver.switchTo().activeElement().sendKeys("ashwinishirsath1221@gmail.com");
		webdriver.close();
	}

}
