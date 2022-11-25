package com.bridgelabz.findingnumberoftags;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FindingTagsWithSelenium {
	@Test
	public void findTagByName() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Driver\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver webdriver = new FirefoxDriver();

		webdriver.get("https://www.facebook.com/");
		webdriver.manage().window().maximize();
		webdriver.findElement(By.name("email")).sendKeys("ashwinishirsath1221@gmail.com");
		Thread.sleep(2000);

		webdriver.findElement(By.name("pass")).sendKeys("ashwini1221");
		Thread.sleep(2000);

		webdriver.findElement(By.name("login")).click();
		Thread.sleep(2000);

		List<WebElement> tag1 = webdriver.findElements(By.tagName("a"));
		System.out.println("Size of 'a' tag : " + tag1.size());
		List<WebElement> tag2 = webdriver.findElements(By.tagName("span"));
		System.out.println("Size of 'span' tag : " + tag2.size());
		List<WebElement> tag3 = webdriver.findElements(By.tagName("div"));
		System.out.println("Size of 'div' tag : " + tag3.size());
		List<WebElement> tag4 = webdriver.findElements(By.tagName("input"));
		System.out.println("Size of 'input' tag : " + tag4.size());
		List<WebElement> tag5 = webdriver.findElements(By.tagName("script"));
		System.out.println("Size of 'script' tag : " + tag5.size());
		List<WebElement> tag6 = webdriver.findElements(By.tagName("link"));
		System.out.println("Size of 'link' tag : " + tag6.size());
		List<WebElement> tag7 = webdriver.findElements(By.tagName("body"));
		System.out.println("Size of 'body' tag : " + tag7.size());
		List<WebElement> tag8 = webdriver.findElements(By.tagName("head"));
		System.out.println("Size of 'head' tag : " + tag8.size());
		int totalNoTags = tag1.size() + tag2.size() + tag3.size() + tag4.size() + tag5.size() + tag6.size()
				+ tag7.size();
		System.out.println("Total number of tags : " + totalNoTags);
		webdriver.close();
	}
}
