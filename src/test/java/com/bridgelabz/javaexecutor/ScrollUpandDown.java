package com.bridgelabz.javaexecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ScrollUpandDown {
	@Test
	public static void scrollUpandDown() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Driver\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver webdriver = new FirefoxDriver();

		webdriver.get("https://www.selenium.dev/downloads/");
		// typecasting driver object to JavascriptExecutor interface type
		JavascriptExecutor js = (JavascriptExecutor) webdriver;
		for (int i = 1; i < 10; i++) {
			// scroll down on the webpage
			js.executeScript("window.scrollBy(0, 1000)");
			Thread.sleep(2000);
		}
		for (int i = 1; i < 10; i++) {
			// scroll up on the webpage
			js.executeScript("window.scrollBy(0, -1000)");
			Thread.sleep(2000);
		}
		webdriver.close();
	}
}
