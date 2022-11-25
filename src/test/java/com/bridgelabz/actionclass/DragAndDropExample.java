package com.bridgelabz.actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDropExample {
	@Test
	public void dragAndDropExample() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Driver\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver webdriver = new FirefoxDriver();

		webdriver.manage().window().maximize();
		webdriver.get(
				"https://www.facebook.com/?stype=lo&jlou=AfcZ9Ci1s2iT3FcOJdEvhsYGuKSkhD7ojjO-Kp_t-I2gYh85zPFQYSzgCILP0E4Zo57xRlwAc19Ziy_v24RwoQymJUIU6xaQt_EbRhgM2HZPHQ&smuh=54178&lh=Ac9fjHV5HtSAXqn-RSI");
		String xp1 = "//input[contains(@id,'email')]";
		WebElement block1 = webdriver.findElement(By.xpath(xp1));
		String xp2 = "//input[contains(@name,'pass')]";
		WebElement block3 = webdriver.findElement(By.xpath(xp2));
		Actions actions = new Actions(webdriver);
		Thread.sleep(2000);
		actions.dragAndDrop(block1, block3).perform();
		webdriver.close();

	}
}
