package com.bridgelabz.javaexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NavigatetoBottomofthePage {
	@Test
	public static void navigatetoBottomofthePage() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Driver\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver webdriver = new FirefoxDriver();

		webdriver.get("https://www.selenium.dev/downloads/");
		//webdriver.findElement(By.id("close")).click();
		// select an element which is present at the bottom of the page
		WebElement element = webdriver.findElement(By.id("footerLogo"));
		int x = element.getLocation().getX();
		int y = element.getLocation().getY();
		System.out.println("X coordinate is :" + x + " and Y coordinate is :" + y);
		JavascriptExecutor js = (JavascriptExecutor) webdriver;
		js.executeScript("window.scrollBy(" + x + "," + y + ")");
		Thread.sleep(2000);
		element.click();
		Thread.sleep(2000);
		webdriver.close();
	}
}
