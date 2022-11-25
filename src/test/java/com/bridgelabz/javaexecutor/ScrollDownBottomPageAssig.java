package com.bridgelabz.javaexecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ScrollDownBottomPageAssig {
	@Test
	public static void scrollDownBottomPage() throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\Driver\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver webdriver = new FirefoxDriver();

		// Launch the application
		webdriver.get("https://www.selenium.dev/downloads/");

		JavascriptExecutor js = (JavascriptExecutor) webdriver;

		// This will scroll the web page till end.
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(2000);
		webdriver.close();
	}

}
