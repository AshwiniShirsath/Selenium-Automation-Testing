package com.bridgelabz.webelementinterfacemethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class VerifyUNandPMDalignment {
	
	@Test
	public static void verifyUNandPMDalignment() {
		System.setProperty("webdriver.gecko.driver", "C:\\Driver\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver webdriver = new FirefoxDriver();

		webdriver.get("https://www.facebook.com/");

		WebElement unTB = webdriver.findElement(By.id("email"));
		int un_x = unTB.getLocation().getX();
		int un_width = unTB.getSize().getWidth();
		int un_height = unTB.getSize().getHeight();
		WebElement pwTB = webdriver.findElement(By.name("pass"));
		int pw_x = pwTB.getLocation().getX();
		int pw_width = pwTB.getSize().getWidth();
		int pw_height = pwTB.getSize().getHeight();
		if (un_x == pw_x && un_width==pw_width && un_height==pw_height) {
		System.out.println("Username and password text box are aligned");
		} else {
		System.out.println("Username and password text box are NOT aligned");
		System.out.println(unTB);
		System.out.println(pw_height);
		System.out.println(un_x+un_width+un_height);
		System.out.println(pw_height);
		System.out.println(pw_width+pw_x);
		}
		webdriver.close();
	}
}
