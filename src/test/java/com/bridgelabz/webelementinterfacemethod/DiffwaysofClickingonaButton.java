package com.bridgelabz.webelementinterfacemethod;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DiffwaysofClickingonaButton {
	@Test
	public static void diffwaysofClickingonaButton() {
		System.setProperty("webdriver.gecko.driver", "C:\\Driver\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver webdriver = new FirefoxDriver();

		webdriver.get("https://demo.vtiger.com");
		String xp = "//span[@id='loginspan']";
		webdriver.findElement(By.xpath(xp)).click();
		webdriver.findElement(By.xpath("//button[@type='submit']")).sendKeys(Keys.ENTER);
		webdriver.findElement(By.xpath(xp)).submit();
		
		webdriver.close();
	}
}
