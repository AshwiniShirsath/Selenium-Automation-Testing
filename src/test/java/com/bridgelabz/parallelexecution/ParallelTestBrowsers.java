package com.bridgelabz.parallelexecution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallelTestBrowsers {
    @Test
    public void   fireFoxBrowser() throws InterruptedException {
    	System.setProperty("webdriver.gecko.driver", "C:\\Driver\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.name("email")).sendKeys("ashwinishirsath1221@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.name("pass")).sendKeys("ashwini1221");
        Thread.sleep(2000);
        driver.findElement(By.name("login")).click();
        Thread.sleep(2000);
        driver.close();
    }
    @Test
    public void chromeBrowserExecution() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver_win32 (4)\\chromedriver.exe");
        WebDriver driver2 = new ChromeDriver();
      
        driver2.get("https://www.facebook.com/");
        driver2.manage().window().maximize();
        driver2.findElement(By.name("email")).sendKeys("ashwinishirsath1221@gmail.com");
        Thread.sleep(2000);
        driver2.findElement(By.name("pass")).sendKeys("ashwini1221");
        Thread.sleep(2000);
        driver2.findElement(By.name("login")).click();
        Thread.sleep(2000);
        driver2.close();
    }
    @Test
    public void microsoftEdgeExecution() throws InterruptedException {
        System.setProperty("webdriver.edge.driver","C:\\Driver\\IEDriverServer_x64_4.3.0\\IEDriverServer.exe");
        WebDriver driver3 = new EdgeDriver();
       
        driver3.get("https://www.facebook.com/");
        driver3.manage().window().maximize();
        driver3.findElement(By.name("email")).sendKeys("ashwinishirsath1221@gmail.com");
        Thread.sleep(2000);
        driver3.findElement(By.name("pass")).sendKeys("ashwini1221");
        Thread.sleep(2000);
        driver3.findElement(By.name("login")).click();
        Thread.sleep(2000);
        driver3.close();
    }
}