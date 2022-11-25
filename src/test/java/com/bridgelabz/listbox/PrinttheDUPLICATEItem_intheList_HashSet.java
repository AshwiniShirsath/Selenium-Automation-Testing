package com.bridgelabz.listbox;
/*
 * Program: Write a script to print the duplicate item in the list ?
 */
import java.util.HashSet;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class PrinttheDUPLICATEItem_intheList_HashSet {
	@Test
	public static void printtheDUPLICATEItem_intheList_HashSet() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Driver\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver webdriver = new FirefoxDriver();
		webdriver.get("file:///C:/Users/Ashwini/Desktop/ListBox_Breakfast.html");
		webdriver.manage().window().maximize();
		WebElement listbox = webdriver.findElement(By.id("mtr"));
		Select s = new Select(listbox);
		List<WebElement> allOptions = s.getOptions();
		int count1 = allOptions.size();
		System.out.println("Number of elements in the list is :" + count1);
		HashSet<String> allElementText = new HashSet<String>();
		for (int i = 0; i < count1; i++) {
			String text = allOptions.get(i).getText();
			/*
			 * allElementText.add(text) returns true if the element is not already added,
			 * and it returns false if the same element is trying to be added twice.
			 */
			if (!allElementText.add(text)) {
				System.out.println(text + " is the duplicate item in the list box");
			}
		}
		System.out.println(allElementText.size());
		// it will print all the unique values in the HashSet object
		System.out.println(allElementText);
		Thread.sleep(2000);
		webdriver.close();
	}
}
