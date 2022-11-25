package com.bridgelabz.handlingpopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

public class HiddenDivisionPopup_CalendarPopup_cleartrip_selectTodaysDate {
	@Test()
	public static void hiddenDivisionPopup_CalendarPopup_cleartrip_selectTodaysDate() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Driver\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver webdriver = new FirefoxDriver();

		FirefoxOptions option = new FirefoxOptions();
		option.addArguments("--disable-notifications");
		option.addArguments("--disable-geolocation");
		option.addArguments("--ignore-certificate-errors");
		webdriver.get("https://www.cleartrip.com/");
		Thread.sleep(2000);
		webdriver.findElement(By.xpath("(//input[@placeholder='Pick a date'])[1]")).click();
		Thread.sleep(2000);
		webdriver.findElement(By.linkText("24")).click();
		webdriver.close();
	}
}
