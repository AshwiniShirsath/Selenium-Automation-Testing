package com.bridgelabz.webelementinterfacemethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class VerifyUNtextboxisEnabledinFacebook {
	@Test
	public static void verifyUNtextboxisEnabledinFacebook() {
		System.setProperty("webdriver.gecko.driver", "C:\\Driver\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver webdriver = new FirefoxDriver();

		webdriver.get("https://www.facebook.com/");
		WebElement UN = webdriver.findElement(By.id("email"));
		if (UN.isEnabled()) {
			System.out.println("Username text box is enabled");
		} else {
			System.out.println("Username text box is disabled");
		}
		WebElement pass = webdriver.findElement(By.id("pass"));
		if (UN.isEnabled()) {
			System.out.println("Password text box is enabled");
		} else {
			System.out.println("Password text box is disabled");
		}
		webdriver.close();
	}
}
