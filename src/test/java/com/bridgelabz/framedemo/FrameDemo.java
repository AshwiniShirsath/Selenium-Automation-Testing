package com.bridgelabz.framedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FrameDemo {
	@Test
	public static void frameDemo() {
		System.setProperty("webdriver.gecko.driver", "C:\\Driver\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver webdriver = new FirefoxDriver();
		
		webdriver.get("file:///C:/Users/Ashwini/Desktop/page2.html");
		// using index of the frame - [ int value] [ index of frames starts with zero]
		webdriver.switchTo().frame(0);
		webdriver.findElement(By.id("t1")).sendKeys("a");
		webdriver.switchTo().defaultContent();
		webdriver.findElement(By.id("t2")).sendKeys("a");
		// using id attribute of the frame -string
		webdriver.switchTo().frame("f1");
		webdriver.findElement(By.id("t1")).sendKeys("b");
		webdriver.switchTo().defaultContent();
		webdriver.findElement(By.id("t2")).sendKeys("b");
		// using name attribute of the frame -string
		webdriver.switchTo().frame("n1");
		webdriver.findElement(By.id("t1")).sendKeys("c");
		webdriver.switchTo().defaultContent();
		webdriver.findElement(By.id("t2")).sendKeys("c");
		// using address of the frame -webelement
		WebElement f = webdriver.findElement(By.className("c1"));
		webdriver.switchTo().frame(f);
		webdriver.findElement(By.id("t1")).sendKeys("d");
		webdriver.switchTo().defaultContent();
		webdriver.findElement(By.id("t2")).sendKeys("d");
		webdriver.close();
	}
}
