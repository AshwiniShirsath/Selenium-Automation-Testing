package com.bridgelabz.webtable;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AutosuggestionEx_GoogleSearch {
	@Test
	public static void autosuggestionEx_GoogleSearch() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Driver\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver webdriver = new FirefoxDriver();
		webdriver.get("http://www.google.com");
		// Enter Selenium in google search text box
		webdriver.findElement(By.id("lst-ib")).sendKeys("selenium");
		Thread.sleep(2000);
		List<WebElement> allOptions = webdriver.findElements(By.xpath("//*[contains(text(),'selenium')]"));
		int count = allOptions.size();
		System.out.println("Number of values present in the dropdown is : " + count);
		String expectedValue = "selenium interview questions";
		// Print all the auto suggestion values
		for (WebElement option : allOptions) {
			String text = option.getText();
			System.out.println(" " + text);
			// Click on Java Interview Questions
			if (text.equalsIgnoreCase(expectedValue)) {
				option.click();
				break;
			}
		}
		webdriver.close();
	}
}
