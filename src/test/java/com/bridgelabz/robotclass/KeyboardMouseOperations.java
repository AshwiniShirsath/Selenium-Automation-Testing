package com.bridgelabz.robotclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class KeyboardMouseOperations {
	@Test
	public static void keyboardMouseOperations() throws InterruptedException, AWTException {

		System.setProperty("webdriver.gecko.driver", "C:\\Driver\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver webdriver = new FirefoxDriver();

		webdriver.navigate().to("https://www.facebook.com/");
		Thread.sleep(5000);

		Robot robot = new Robot();

		robot.mouseMove(300, 500);

		robot.keyPress(KeyEvent.VK_ALT);

		robot.keyPress(KeyEvent.VK_F);

		robot.keyRelease(KeyEvent.VK_F);

		robot.keyRelease(KeyEvent.VK_ALT);
		Thread.sleep(3000);

		robot.keyPress(KeyEvent.VK_W);

		robot.keyRelease(KeyEvent.VK_W);
		Thread.sleep(3000);

		// webdriver.close();

		webdriver.quit();
	}

}
