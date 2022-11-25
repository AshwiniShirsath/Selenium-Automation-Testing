package com.bridgelabz.implicitexplicitfluent;

import java.awt.AWTException;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicitDemo {
	@Test

	public static void explicitDemo() {
		ExplicitDemo explicitDemo = new ExplicitDemo();
		try {
			explicitDemo.explicitTest();
		} catch (InterruptedException | AWTException | IOException e) {
			e.printStackTrace();

		}
	}

	private void explicitTest() throws InterruptedException, AWTException, IOException {
		System.setProperty("webdriver.gecko.driver", "C:\\Driver\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver webdriver = new FirefoxDriver();
		webdriver.get("https://google.com/ncr");
		webdriver.findElement(By.name("q")).sendKeys("chees" + Keys.ENTER);
		WebElement firstResult = new WebDriverWait(webdriver, Duration.ofSeconds(10))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//a/h3")));
		System.out.println(firstResult.getText());
		webdriver.close();
	}

}
