package com.bridgelabz.webelementinterfacemethod;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class RunSeleniumCodeInDiffBrowser {
	@Test
	public void runSeleniumCodeInDiffBrowser() throws InterruptedException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("For Chrome browser press 1");
		System.out.println("For firefox browser press 2");
		System.out.println("Enter your choice : ");
		int num = scanner.nextInt();

		switch (num) {
		case 1:
			System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver_win32\\chromedriver.exe");
			WebDriver webdriver = new ChromeDriver();

			webdriver.get("https://www.facebook.com/");
			webdriver.manage().window().maximize();
			webdriver.findElement(By.name("email")).sendKeys("ashwinishirsath1221@gmail.com");
			Thread.sleep(2000);
			webdriver.findElement(By.name("pass")).sendKeys("ashwini1221");
			Thread.sleep(2000);
			webdriver.findElement(By.name("login")).click();
			Thread.sleep(2000);
			webdriver.close();
			break;
		case 2:
			System.setProperty("webdriver.gecko.driver", "C:\\Driver\\geckodriver-v0.31.0-win64\\geckodriver.exe");
			WebDriver webdriver1 = new FirefoxDriver();

			webdriver1.get("https://www.facebook.com/");
			webdriver1.manage().window().maximize();
			webdriver1.findElement(By.name("email")).sendKeys("ashwinishirsath1221@gmail.com");
			Thread.sleep(2000);
			webdriver1.findElement(By.name("pass")).sendKeys("ashwini1221");
			Thread.sleep(2000);
			webdriver1.findElement(By.name("login")).click();
			Thread.sleep(2000);
			webdriver1.close();
			break;
		default:
			System.out.println("Selected number is not valid");
			break;
		}
	}

	public static void main(String[] args) throws InterruptedException {
		RunSeleniumCodeInDiffBrowser run = new RunSeleniumCodeInDiffBrowser();
		run.runSeleniumCodeInDiffBrowser();
	}
}
