package com.bridgelabz.downloadfiledemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Xpaths_Independent_dependent_actitime_setbydefault {
	@Test
	public static void xpaths_Independent_dependent_actitime_setbydefault() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Driver\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver webdriver = new FirefoxDriver();

		webdriver.get("https://www.facebook.com/");
		webdriver.findElement(By.id("email")).sendKeys("ashwinishirsath1221@gmail.com");
		webdriver.findElement(By.name("pass")).sendKeys("ashwini1221");
		// click on login button
		webdriver.findElement(By.xpath("//button[contains(@name,'login')]")).click();
		Thread.sleep(2000);

		webdriver.getTitle();

		webdriver.findElement(By.xpath("//span[text()='Ashwini']")).click();
		webdriver.close();
	}
}