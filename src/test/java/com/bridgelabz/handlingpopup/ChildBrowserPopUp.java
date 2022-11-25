package com.bridgelabz.handlingpopup;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ChildBrowserPopUp {
	@Test
	public static void childBrowserPopUp() {
		System.setProperty("webdriver.gecko.driver", "C:\\Driver\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver webdriver = new FirefoxDriver();

		webdriver.get("https://www.naukri.com/");
		// using getWindowHandles(), get a set of window handle IDs
		Set<String> allWindowHandles = webdriver.getWindowHandles();
		// using size(), get the count of total number of browser windows
		int count = allWindowHandles.size();
		System.out.println("Number of browser windows opened on the system is : " + count);
		for (String windowHandle : allWindowHandles) {
			// switch to each browser window
			webdriver.switchTo().window(windowHandle);
			String title = webdriver.getTitle();
			// print the window handle id of each browser window
			System.out.println("Window handle id of page -->" + title + " --> is : " + windowHandle);
			// close all the browsers one by one
			webdriver.close();
		}
		/*
		 * Instead of using driver.close(), we can use driver.quit() to close all the
		 * browsers at once
		 */
		// driver.quit()
	}
}
