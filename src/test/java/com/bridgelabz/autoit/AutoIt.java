package com.bridgelabz.autoit;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AutoIt {
	@Test
	public static void autoIt() throws InterruptedException, AWTException, IOException {
		System.setProperty("webdriver.gecko.driver", "C:\\Driver\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver webdriver = new FirefoxDriver();
		webdriver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		// Press Control + P from keyboard using Robot class
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_P);
		r.keyRelease(KeyEvent.VK_P);
		r.keyRelease(KeyEvent.VK_CONTROL);
		// Using Runtime class, to run the .exe file
		Runtime run = Runtime.getRuntime();
		run.exec("C:\\Users\\Ashwini\\Desktop\\Autoit\\CancelOnPrintOnWindowPopup.exe");
		// close the browser
		webdriver.close();
	}
}
