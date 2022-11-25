package com.bridgelabz.handlingpopup;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CloseParentWindow {
	@Test()
	public static void closeParentWindow() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Driver\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver webdriver = new FirefoxDriver();
		webdriver.get("https://www.naukri.com/");
		String parentID = webdriver.getWindowHandle();
		webdriver.findElement(By.xpath("//a[contains(text(),'Register now')]")).click();
		Set<String> allwindowHandleSet = webdriver.getWindowHandles();
		for (String windowHandle : allwindowHandleSet) {
			webdriver.switchTo().window(windowHandle);
			if (windowHandle.equals(parentID)) {
				webdriver.close();
			}
		}
		webdriver.quit();
	}

}
