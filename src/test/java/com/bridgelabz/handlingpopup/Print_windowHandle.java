package com.bridgelabz.handlingpopup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Print_windowHandle {
	@Test
	public static void print_windowHandle() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Driver\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver webdriver = new FirefoxDriver();
		webdriver.get("https://www.facebook.com/");
		// get the window handle id of the browser
		String windowHandle = webdriver.getWindowHandle();
		System.out.println(windowHandle);
		webdriver.close();
	}
}
