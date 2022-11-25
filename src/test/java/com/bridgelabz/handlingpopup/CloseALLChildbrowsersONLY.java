package com.bridgelabz.handlingpopup;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CloseALLChildbrowsersONLY {
	@Test
	public static void closeALLChildbrowsersONLY() {
		System.setProperty("webdriver.gecko.driver", "C:\\Driver\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver webdriver = new FirefoxDriver();

		webdriver.get("https://www.naukri.com/");
		// get the window handle id of the parent browser window
		String parentWindowhandleID = webdriver.getWindowHandle();
		Set<String> allWindowHandles = webdriver.getWindowHandles();
		int count = allWindowHandles.size();
		System.out.println("Number of browser windows opened on the system is : " + count);
		for (String windowHandle : allWindowHandles) {
			// switch to each browser window
			webdriver.switchTo().window(windowHandle);
			String title = webdriver.getTitle();
			/*
			 * compare the window id of all the browsers with the Parent browser window id,
			 * if it is not equal, then only close the browser windows.
			 */
			if (!windowHandle.equals(parentWindowhandleID)) {
				webdriver.close();
				System.out.println("Child Browser window with title -->" + title + " --> is closed");
				webdriver.close();
			}
		}
	}
}