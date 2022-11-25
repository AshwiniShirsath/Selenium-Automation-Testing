package com.bridgelabz.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NameLocatorsDemo {

	@Test
	public static void nameLoginPageLocatorsDemo() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Driver\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver webdriver = new FirefoxDriver();

		webdriver.get("https://www.facebook.com/");
		webdriver.manage().window().maximize();

		webdriver.findElement(By.name("email")).sendKeys("ashwinishirsath1221@gmail.com");
		Thread.sleep(2000);

		webdriver.findElement(By.name("pass")).sendKeys("ashwini1221");
		Thread.sleep(2000);

		webdriver.findElement(By.name("login")).click();
		Thread.sleep(2000);

		webdriver.close();
	}

	@Test
	public static void nameRegistrationLocatorsDemo() throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\Driver\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver webdriver = new FirefoxDriver();

		webdriver.get("https://www.facebook.com/");
		webdriver.manage().window().maximize();
		webdriver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(2000);

		webdriver.findElement(By.name("firstname")).sendKeys("Ashwini");
		Thread.sleep(2000);

		webdriver.findElement(By.name("lastname")).sendKeys("Shirsath");
		Thread.sleep(2000);

		webdriver.findElement(By.name("reg_email__")).sendKeys("ashwinishirsath1221@gmail.com");
		Thread.sleep(2000);

		webdriver.findElement(By.name("reg_email_confirmation__")).sendKeys("ashwinishirsath1221@gmail.com");
		Thread.sleep(2000);

		webdriver.findElement(By.name("reg_passwd__")).sendKeys("ashwini1221");
		Thread.sleep(2000);

		webdriver.findElement(By.name("birthday_day")).sendKeys("12");
		Thread.sleep(2000);

		webdriver.findElement(By.name("birthday_month")).sendKeys("April");
		Thread.sleep(2000);

		webdriver.findElement(By.name("birthday_year")).sendKeys("1994");
		Thread.sleep(2000);

		webdriver.findElements(By.name("sex")).get(0).click();
		Thread.sleep(2000);

		webdriver.findElement(By.name("websubmit")).click();
		Thread.sleep(2000);
		webdriver.close();

	}

	@Test
	public static void xPathLoginPageLocatorsDemo() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Driver\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver webdriver = new FirefoxDriver();

		webdriver.get("https://www.facebook.com/");
		webdriver.manage().window().maximize();

		webdriver.findElement(By.xpath("//*[@name='email']")).sendKeys("ashwinishirsath1221@gmail.com");
		Thread.sleep(2000);

		webdriver.findElement(By.xpath("//*[@name='pass']")).sendKeys("ashwini1221");
		Thread.sleep(2000);

		webdriver.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(2000);

		webdriver.close();
	}
	
	@Test
	public static void relativeXPathRegistrationLocatorsDemo() throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\Driver\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver webdriver = new FirefoxDriver();

		webdriver.get("https://www.facebook.com/");
		webdriver.manage().window().maximize();
		webdriver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(2000);

		webdriver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("Ashwini");
        Thread.sleep(2000);
        
        webdriver.findElement(By.xpath("//*[@name='lastname']")).sendKeys("Shirsath");
        Thread.sleep(2000);

        webdriver.findElement(By.xpath("//*[@name='reg_email__']")).sendKeys("ashwinishirsath1221@gmail.com");
		Thread.sleep(2000);

        webdriver.findElement(By.xpath("//*[@name='reg_email_confirmation__']")).sendKeys("ashwinishirsath1221@gmail.com");
		Thread.sleep(2000);

		webdriver.findElement(By.xpath("//*[@name='reg_passwd__']")).sendKeys("ashwini1221");
		Thread.sleep(2000);

        webdriver.findElement(By.xpath("//*[@name='birthday_day']")).sendKeys("12");
		Thread.sleep(2000);

		webdriver.findElement(By.xpath("//*[@name='birthday_month']")).sendKeys("April");
		Thread.sleep(2000);
       
		webdriver.findElement(By.xpath("//*[@name='birthday_year']")).sendKeys("1994");
		Thread.sleep(2000);

		webdriver.findElements(By.xpath("//input[@value='1']")).get(0).click();
		Thread.sleep(2000);

		webdriver.findElement(By.xpath("//button[@name='websubmit']")).click();
		Thread.sleep(2000);
		webdriver.close();

	}
	

	@Test
	public static void cssSelectorLoginPageLocatorsDemo() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Driver\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver webdriver = new FirefoxDriver();

		webdriver.get("https://www.facebook.com/");
		webdriver.manage().window().maximize();

		webdriver.findElement(By.cssSelector("#email")).sendKeys("ashwinishirsath1221@gmail.com");
		Thread.sleep(2000);

		webdriver.findElement(By.cssSelector("#pass")).sendKeys("ashwini1221");
		Thread.sleep(2000);

		webdriver.findElement(By.cssSelector("#loginbutton")).click();
		Thread.sleep(2000);

		webdriver.close();
	}
	
	@Test
	public static void cssSelectorRegistrationLocatorsDemo() throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\Driver\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver webdriver = new FirefoxDriver();

		webdriver.get("https://www.facebook.com/");
		webdriver.manage().window().maximize();
		webdriver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(2000);

		webdriver.findElement(By.cssSelector("#u_2_b_oF")).sendKeys("Ashwini");
        Thread.sleep(2000);
        
        webdriver.findElement(By.cssSelector("#u_2_d_aN")).sendKeys("Shirsath");
        Thread.sleep(2000);

        webdriver.findElement(By.cssSelector("#u_2_g_5T")).sendKeys("ashwinishirsath1221@gmail.com");
		Thread.sleep(2000);

        webdriver.findElement(By.cssSelector("#u_2_j_3t")).sendKeys("ashwinishirsath1221@gmail.com");
		Thread.sleep(2000);

		webdriver.findElement(By.cssSelector("#password_step_input")).sendKeys("ashwini1221");
		Thread.sleep(2000);

        webdriver.findElement(By.cssSelector("#day")).sendKeys("12");
		Thread.sleep(2000);

		webdriver.findElement(By.cssSelector("#month")).sendKeys("April");
		Thread.sleep(2000);
       
		webdriver.findElement(By.cssSelector("#year")).sendKeys("1994");
		Thread.sleep(2000);

		webdriver.findElements(By.cssSelector("label[for='u_2_4_FR']")).get(0).click();
		Thread.sleep(2000);

		webdriver.findElement(By.cssSelector("#u_2_s_Qf")).click();
		Thread.sleep(2000);
		webdriver.close();

	}

}
