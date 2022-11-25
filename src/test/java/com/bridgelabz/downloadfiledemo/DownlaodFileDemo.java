package com.bridgelabz.downloadfiledemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DownlaodFileDemo {
	
	public void downloadSeleniumFile() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Driver\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver webdriver = new FirefoxDriver();

		webdriver.get("https://www.facebook.com/");
		webdriver.manage().window().maximize();
		Thread.sleep(2000);
		webdriver.get("https://www.selenium.dev/downloads/");
		Thread.sleep(2000);
		webdriver.findElement(By.xpath(
				"//a[@href='https://github.com/SeleniumHQ/selenium/releases/download/selenium-4.4.0/selenium-server-4.4.0.jar']"))
				.click();
		Thread.sleep(3000);
		webdriver.close();

	}
}
