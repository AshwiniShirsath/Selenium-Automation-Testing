package com.bridgelabz.actionclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ContextClickusingActionsClass {
	@Test()
	public static void contextClickusingActionsClass() throws AWTException, InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Driver\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver webdriver = new FirefoxDriver();

		webdriver.manage().window().maximize();
		// enter the url
		webdriver.get("https://www.facebook.com/");
		// find the ActiTIME Inc. link
		WebElement link = webdriver.findElement(By.xpath("//a[normalize-space()='Forgotten password?']"));

		Actions actions = new Actions(webdriver);
		actions.contextClick(link).perform();
		Thread.sleep(3000);

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_W);
		r.keyRelease(KeyEvent.VK_W);

		webdriver.quit();
	}
}