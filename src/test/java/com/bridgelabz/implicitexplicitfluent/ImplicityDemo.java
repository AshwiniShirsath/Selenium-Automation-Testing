package com.bridgelabz.implicitexplicitfluent;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ImplicityDemo {
	@Test
	public static void implicityDemo() {
		ImplicityDemo implicityDemo = new ImplicityDemo();
		try {
			implicityDemo.implicitTest();
		} catch (InterruptedException | AWTException | IOException e) {
			e.printStackTrace();

		}
	}

	private void implicitTest() throws InterruptedException, AWTException, IOException {
		System.setProperty("webdriver.gecko.driver", "C:\\Driver\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver webdriver = new FirefoxDriver();

		webdriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		webdriver.get("https://www.facebook.com/");
		System.out.println(webdriver.getTitle());

		webdriver.findElement(By.partialLinkText("Create New")).click();

		webdriver.findElement(By.name("firstname")).sendKeys("Ashwini");

		webdriver.findElement(By.name("lastname")).sendKeys("Shirsath");

		webdriver.findElement(By.name("reg_email__")).sendKeys("ashwinishirsath1221@gmail.com");

		webdriver.findElement(By.name("reg_email_confirmation__")).sendKeys("ashwinishirsath1221@gmail.com");

		webdriver.findElement(By.name("reg_passwd__")).sendKeys("ashwini1221");

		webdriver.findElement(By.name("birthday_day")).sendKeys("12");

		webdriver.findElement(By.name("birthday_month")).sendKeys("April");

		webdriver.findElement(By.name("birthday_year")).sendKeys("1994");

		webdriver.findElements(By.name("sex")).get(0).click();

		webdriver.findElement(By.name("websubmit")).click();
		webdriver.close();

	}
}
