package com.bridgelabz.javaexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ScrollUpandDowntospecificElementonWebpage {
	@Test
	public static void scrollUpandDowntospecificElementonWebpage() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Driver\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver webdriver = new FirefoxDriver();
		
		webdriver.get("https://www.selenium.dev/downloads/");
		// click on the close icon of the yellow color background pop up
		//webdriver.findElement(By.id("close")).click();
		// find the Applitools element on the webpage
		WebElement ele = webdriver.findElement(By.xpath("//img[contains(@src,'applitools')]"));
		// get the X-coordinate and store in a variable
		int x = ele.getLocation().getX();
		// get the Y-coordinate and store in a variable
		int y = ele.getLocation().getY();
		JavascriptExecutor js = (JavascriptExecutor) webdriver;
		// Scroll to Applitools element’s x and y coordinate
		js.executeScript("window.scrollBy(" + x + ", " + y + ")");
		Thread.sleep(2000);
		webdriver.close();
	}
}
