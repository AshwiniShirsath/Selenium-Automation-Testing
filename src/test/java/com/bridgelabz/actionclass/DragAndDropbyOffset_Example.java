package com.bridgelabz.actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDropbyOffset_Example {
	@Test
	public void dragAndDropbyOffset_Example() {
		System.setProperty("webdriver.gecko.driver", "C:\\Driver\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver webdriver = new FirefoxDriver();
		
		webdriver.get(
				"https://www.facebook.com/?stype=lo&jlou=AfcZ9Ci1s2iT3FcOJdEvhsYGuKSkhD7ojjO-Kp_t-I2gYh85zPFQYSzgCILP0E4Zo57xRlwAc19Ziy_v24RwoQymJUIU6xaQt_EbRhgM2HZPHQ&smuh=54178&lh=Ac9fjHV5HtSAXqn-RSI");
		webdriver.manage().window().maximize();
		String xp1 = "//input[contains(@id,'email')]";
		WebElement block1 = webdriver.findElement(By.xpath(xp1));
		String xp2 = "//input[contains(@name,'pass')]";
		WebElement block3 = webdriver.findElement(By.xpath(xp2));
		Actions actions = new Actions(webdriver);
		actions.dragAndDropBy(block1, block3.getLocation().getX() + 5, block3.getSize().getHeight() + 5).perform();
	}
}
