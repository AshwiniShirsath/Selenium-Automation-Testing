package com.bridgelabz.handlingpopup;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class HandleTabs_using_getWindowHandles {
	@Test
	public static void handleTabs_using_getWindowHandles() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Driver\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver webdriver = new FirefoxDriver();

		webdriver.get("https://www.irctc.co.in/nget/train-search");
		webdriver.findElement(By.xpath("//button[contains(@class,'btn btn-primary')]")).click();
		String parentwindowHandle = webdriver.getWindowHandle();
		webdriver.findElement(By.xpath("//i[contains(@class,'fa fa-align-justify')]")).click();
		webdriver.findElement(By.xpath("/html/body/app-root/app-home/div[1]/app-header/div[3]/p-sidebar/div/nav/ul/li[4]/a/label")).click();
		Set<String> allwhs = webdriver.getWindowHandles();
		for (String wh : allwhs) {
			webdriver.switchTo().window(wh);
		}
		String childtitle = webdriver.getTitle();
		System.out.println("Title of the child tab is :" + childtitle);
		Thread.sleep(2000);
		webdriver.switchTo().window(parentwindowHandle);
		webdriver.close();
	}
}
