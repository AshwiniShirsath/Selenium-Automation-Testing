package com.bridgelabz.webelementinterfacemethod;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class RemoveValuefromText_usingClearMethod {
	@Test
	public static void removeValuefromText_usingClearMethod() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Driver\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver webdriver = new FirefoxDriver();

		webdriver.get("https://www.facebook.com/");
		webdriver.findElement(By.id("email")).sendKeys("Ashwini");
		Thread.sleep(2000);
		String value = webdriver.findElement(By.id("email")).getAttribute("value");
		System.out.println("Value present inside the text box is : " + value);
		webdriver.findElement(By.id("email")).clear();
		Thread.sleep(2000);
		webdriver.findElement(By.id("email")).sendKeys("ashwinishirsath1221@gmail.com");
		Thread.sleep(2000);
		webdriver.findElement(By.id("email")).sendKeys(Keys.CONTROL + "a" + Keys.DELETE); //
		webdriver.findElement(By.id("email")).sendKeys(Keys.CONTROL + "a");
		webdriver.findElement(By.id("email")).sendKeys(Keys.DELETE);
		Thread.sleep(2000);
		webdriver.close();
	}
}
