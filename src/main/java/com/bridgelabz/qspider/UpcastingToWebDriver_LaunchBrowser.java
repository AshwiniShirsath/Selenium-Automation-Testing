package com.bridgelabz.qspider;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UpcastingToWebDriver_LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Driver\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver webdriver = new FirefoxDriver();
		
		webdriver.get("https://www.facebook.com/");
		String title = webdriver.getTitle();
		System.out.println("the title of page the is:" + title);
		String currentUrl = webdriver.getCurrentUrl();
		System.out.println("the url of page the is:" + currentUrl);
		String pageSource = webdriver.getPageSource();
		System.out.println("the source code of the page is:" + pageSource);
		Thread.sleep(2000);
		String windowHandle = webdriver.getWindowHandle();
		System.out.println("the windowhandle of the page is:" + windowHandle);
	    Options manage = webdriver.manage();
	    System.out.println("the option of the page is:" + manage);
	    Navigation navigate = webdriver.navigate();  // It return Navigation type thats why we r storing in navigation type variable
	    System.out.println("the navigate of the page is:" + navigate);
	    Thread.sleep(2000);
	    webdriver.close();
	    webdriver.quit();
	}
}
