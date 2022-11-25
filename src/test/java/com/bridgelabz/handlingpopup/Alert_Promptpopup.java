package com.bridgelabz.handlingpopup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Alert_Promptpopup {
	@Test
	public static void alert_Promptpopup() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Driver\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver webdriver = new FirefoxDriver();
		//Enter the url
		webdriver.get("http://www.tizag.com/javascriptT/javascriptprompt.php");
		//find this button : "Say my name"
		webdriver.findElement(By.xpath("//input[@value='Say my name!']")).click();
		Thread.sleep(2000);
		//Switch to alert pop up 
		Alert alert = webdriver.switchTo().alert();
		Thread.sleep(2000);
		//print the text present on the alert pop up
		System.out.println(alert.getText());
		Thread.sleep(2000);
		//enter your name in the text box present on the alert pop up
		alert.sendKeys("Ashwini");
		Thread.sleep(2000);
		//click on OK button
		alert.accept();
		Thread.sleep(2000);
		//print the text present on the second alert pop up
		System.out.println(alert.getText());
		//click on Cancel button
		alert.dismiss();
		webdriver.close();
	}
}
