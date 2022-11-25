package com.bridgelabz.atomatecaptcha;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AutomateCaptchaInSelenium {
	@Test
	public void clickOnRecaptchaCheckBokInSelenium() {
		System.setProperty("webdriver.gecko.driver", "C:\\Driver\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver webdriver = new FirefoxDriver();
		webdriver.get("https://www.irctc.co.in/nget/train-search");

		webdriver.manage().window().maximize();
		webdriver.manage().deleteAllCookies();

		JavascriptExecutor executor = (JavascriptExecutor) webdriver;
		for (int i = 1; i < 10; i++) {
			executor.executeScript("window.scrollBy(0, 1000)");
		}
		webdriver.findElement(By.xpath("//button[text()='OK']")).click();
		webdriver.findElement(By.xpath("//a[@aria-label='Click here to Login in application']")).click();

		System.out.println("Start with login captcha");
		webdriver.findElement(By.xpath("//input[@placeholder='User Name']")).sendKeys("MaithliAnnamalai");
		webdriver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Mylikanna45");

		WebDriverWait wait = new WebDriverWait(webdriver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//input[@id='nlpAnswer']")));

		wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("SIGN"))).click();

		System.out.println("Clicked the checkbox");
		webdriver.quit();
	}

}
