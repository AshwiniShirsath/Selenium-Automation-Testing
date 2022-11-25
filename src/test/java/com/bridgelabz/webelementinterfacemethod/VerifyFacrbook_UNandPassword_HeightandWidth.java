package com.bridgelabz.webelementinterfacemethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class VerifyFacrbook_UNandPassword_HeightandWidth {

	@Test
	public static void verifyfacebook_UNandPassword_HeightandWidth() {
	System.setProperty("webdriver.gecko.driver", "C:\\Driver\\geckodriver-v0.31.0-win64\\geckodriver.exe");
	WebDriver webdriver = new FirefoxDriver();

	webdriver.get("https://www.facebook.com/");
	WebElement unTB = webdriver.findElement(By.id("email"));
	int username_height = unTB.getSize().getHeight();
	int username_width = unTB.getSize().getWidth();
	System.out.println(username_height);
	System.out.println(username_width);
	WebElement pwdTB = webdriver.findElement(By.name("pass"));
	int password_height = pwdTB.getSize().getHeight();
	int password_width = pwdTB.getSize().getWidth();
	System.out.println(password_height);
	System.out.println(password_width);
	if (username_height==password_height && username_width==password_width) {
	System.out.println("Username and password fields are aligned");
	}  
	else
	{
		System.out.println("Username and password fields are NOT aligned");
	}	
	
	webdriver.close();
	
	}
}
