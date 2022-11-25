package com.bridgelabz.actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseHover {
	@Test
	public void mouseHover() {

		System.setProperty("webdriver.gecko.driver", "C:\\Driver\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver webdriver = new FirefoxDriver();
		webdriver.manage().window().maximize();
		webdriver.get("https://www.facebook.com/");
		webdriver.manage().window().maximize();
		Actions action = new Actions(webdriver);
		WebElement AreaOfExpertise = webdriver
				.findElement(By.xpath("//a[contains(@class,'_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy')]"));
		action.moveToElement(AreaOfExpertise).perform();
		WebElement cloudApp = webdriver.findElement(By.linkText("Sign Up"));
		action.moveToElement(cloudApp).click().perform();
		webdriver.close();
	}
}
