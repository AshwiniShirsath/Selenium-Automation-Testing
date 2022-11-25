package com.bridgelabz.listbox;
/*
 * Program: Write a script to check whether listbox has duplicate or not ?
 */
import java.util.HashSet;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ChecklisthasDUPLICATEvalues_HashSet {
	@Test
	public static void checklisthasDUPLICATEvalues_HashSet() throws InterruptedException {
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
			System.out.println(text);
			allElementText.add(text);
		}
		int count2 = allElementText.size();
		System.out.println("Number of elements in the hashset is :" + count2);
		if (count1 == count2) {
			System.out.println("list box has NO duplicate values");
		} else {
			System.out.println("list box has duplicate values");
		}
		System.out.println(allElementText);
		webdriver.close();
	}
}
