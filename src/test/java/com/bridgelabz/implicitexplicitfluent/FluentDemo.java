package com.bridgelabz.implicitexplicitfluent;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

public class FluentDemo {
	@Test
	public static void fluentDemo() {
		FluentDemo fluentDemo = new FluentDemo();
		try {
			fluentDemo.fluenttTest();
		} catch (InterruptedException | AWTException | IOException e) {
			e.printStackTrace();

		}
	}

	private void fluenttTest() throws InterruptedException, AWTException, IOException {
		System.setProperty("webdriver.gecko.driver", "C:\\Driver\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver webdriver = new FirefoxDriver();
		webdriver.get("https://www.facebook.com/");

		Wait<WebDriver> wait = new FluentWait<WebDriver>(webdriver)
//			    .withTimeout(10, TimeUnit.SECONDS)
//				.pollingEvery(5, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);

		WebElement clickseleniumlink = wait.until(new Function<WebDriver, WebElement>() {

			@Override
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.xpath(
						"html/body/div[1]/section/div[2]/div/div[1]/div/div/div/div[2]/div[2]/div/div/div/div/div[2]/div/div/a/i"));
			}

		});

		webdriver.close();
	}

}
