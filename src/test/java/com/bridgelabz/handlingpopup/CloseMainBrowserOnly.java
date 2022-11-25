package com.bridgelabz.handlingpopup;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CloseMainBrowserOnly {
	@Test
	public static void closeMainBrowserOnly() {
		System.setProperty("webdriver.gecko.driver", "C:\\Driver\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver webdriver = new FirefoxDriver();
		webdriver.get("https://www.naukri.com/");
		// get the window handle id of the parent browser window
		String parentWindowhandleID = webdriver.getWindowHandle();
		Set<String> allWindowHandles = webdriver.getWindowHandles();

		String title = webdriver.getTitle();
		int count = allWindowHandles.size();
		System.out.println("Number of browser windows opened on the system is : " + count);
		for (String windowHandle : allWindowHandles) {
			// switch to each browser window
			webdriver.switchTo().window(windowHandle);
			/*
			 * compare the window id with the Parent browser window id, if both are equal,
			 * then only close the main browser window.
			 */
			if (windowHandle.equals(parentWindowhandleID)) {
				webdriver.close();
				System.out.println("Main Browser window with title -->" + title + " --> is closed");
			}
		}
	}
}
