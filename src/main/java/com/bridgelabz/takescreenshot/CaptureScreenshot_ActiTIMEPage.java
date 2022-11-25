package com.bridgelabz.takescreenshot;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CaptureScreenshot_ActiTIMEPage {
	
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.gecko.driver", "C:\\Driver\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver webdriver = new FirefoxDriver();
		Date d = new Date(0);

		String date1 = d.toString();
		System.out.println(date1);

		String date2 = date1.replaceAll(":", "_"); // 12_04_2023  -> 12:04:2023
		System.out.println(date2);

		webdriver.get("https://www.facebook.com/");

		TakesScreenshot takesScreenshot = (TakesScreenshot) webdriver; // Typecasting the webdriver into takeScreenshot

		File srcFile = takesScreenshot.getScreenshotAs(OutputType.FILE); //  

		File destFile = new File(".\\screenshot\\" + date2 + "__actiTIMELoginPage.png");

		FileUtils.copyFile(srcFile, destFile);

		webdriver.close();
	}
}
