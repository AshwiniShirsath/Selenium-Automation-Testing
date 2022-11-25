package com.bridgelabz.autoit;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FileUploadUsingAutoIT {
	@Test
	public static void fileUploadUsingAutoIT() throws IOException, InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Driver\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.filemail.com/share/upload-file");
		Thread.sleep(3000);
		driver.findElement(By.id("addBtn")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\Ashwini\\Desktop\\Autoit\\UploadFile.exe");
		// WebElement btnSubmit =
		// driver.findElement(By.xpath("//button[normalize-space()='Upload all']"));
		// btnSubmit.click();
	}
}
