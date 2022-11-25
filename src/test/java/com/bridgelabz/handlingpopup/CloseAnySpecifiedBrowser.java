package com.bridgelabz.handlingpopup;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CloseAnySpecifiedBrowser {
	@Test()
	public static void closeAnySpecifiedBrowser() {
		System.setProperty("webdriver.gecko.driver", "C:\\Driver\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver webdriver = new FirefoxDriver();
		webdriver.get("https://www.naukri.com/");
		// Set the expected title of the browser window which you want to close
		String expected_title = "Tech Mahindra";
		Set<String> allWindowHandles = webdriver.getWindowHandles();
		int count = allWindowHandles.size();
		System.out.println("Number of browser windows opened on the system is : " + count);
		for (String windowHandle : allWindowHandles) {
			// switch to each browser window
			webdriver.switchTo().window(windowHandle);
			String actual_title = webdriver.getTitle();
			// Checks whether the actual title contains the specified expected title
			if (actual_title.contains(expected_title)) {
				webdriver.close();
				System.out.println("Specified Browser window with title -->" + actual_title + " --> is closed");
			}
		}
	}
}