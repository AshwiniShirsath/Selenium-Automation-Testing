package com.bridgelabz.listeners;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(com.bridgelabz.listeners.Listener.class)

public class ListenersDemo {
 
		public static String baseUrl = "https://www.facebook.com/";
		static String driverPath = "C:\\Driver\\geckodriver-v0.31.0-win64\\geckodriver.exe";
		public static WebDriver webdriver;

		@Test(priority = 0)
		public static void launchBrowser() {
			System.out.println("Launch Firefox browser");
			System.setProperty("webdriver.gecko.driver", driverPath);
			webdriver = new FirefoxDriver();
			webdriver.get(baseUrl);
			webdriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			WebElement element = webdriver.findElement(By.linkText("Create New Account"));
			element.click();
		}

		@Test(dataProvider = "dp", priority = 1)
		public void signUp(String firstName, String lastName) throws InterruptedException {
			webdriver.findElement(By.name("firstname")).click();
			webdriver.findElement(By.name("firstname")).sendKeys(firstName);
			System.out.println("first name execute");
			webdriver.findElement(By.name("lastname")).click();
			webdriver.findElement(By.name("lastname")).sendKeys(lastName);
			System.out.println("last name execute");
			Reporter.log(firstName + "-->" + lastName, true);
			Thread.sleep(2000);
			webdriver.findElement(By.name("websubmit")).click();
			webdriver.close();
		}

		@DataProvider
		public Object[][] dp() {
			Object[][] data = new Object[1][2];
			data[0][0] = "Ashwini";
			data[0][1] = "Shirsath";
			return data;

		}

	}
