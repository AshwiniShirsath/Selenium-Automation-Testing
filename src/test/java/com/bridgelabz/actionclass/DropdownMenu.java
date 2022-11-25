package com.bridgelabz.actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DropdownMenu {
	@Test
	public void dropdownMenu() {
		System.setProperty("webdriver.gecko.driver", "C:\\Driver\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver webdriver = new FirefoxDriver();
		webdriver.manage().window().maximize();
		webdriver.get("https://www.facebook.com/");
		String xp = "//a[contains(@class,'_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy')]";
		WebElement menu = webdriver.findElement(By.xpath(xp));
		Actions actions = new Actions(webdriver);
		actions.moveToElement(menu).perform();
		WebElement submenu = webdriver.findElement(By.linkText("Sign Up"));
		submenu.click();
		webdriver.close();
	}
}
