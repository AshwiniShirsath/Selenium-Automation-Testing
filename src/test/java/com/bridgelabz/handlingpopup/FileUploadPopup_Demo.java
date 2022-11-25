package com.bridgelabz.handlingpopup;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FileUploadPopup_Demo {
	@Test
	public static void fileUploadPopup_Demo() throws InterruptedException, AWTException {
		System.setProperty("webdriver.gecko.driver", "C:\\Driver\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver webdriver = new FirefoxDriver();
		webdriver.get("http://nervgh.github.io/pages/angular-file-upload/examples/simple/");
		Thread.sleep(2000);
		webdriver.findElement(By.xpath("//input[@multiple=' ']")).sendKeys("C:\\Selenium\\doc.xlsx");
		Thread.sleep(2000);
		webdriver.findElement(By.xpath("//button[@ng-click=\"item.upload()\"]")).click();
		Thread.sleep(2000);
		webdriver.close();
	}
}
