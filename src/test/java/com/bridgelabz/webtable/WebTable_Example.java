package com.bridgelabz.webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class WebTable_Example {
	
	@Test
	public static void webTable_Example() {
		System.setProperty("webdriver.gecko.driver", "C:\\Driver\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver webdriver = new FirefoxDriver();
		webdriver.get("C:\\Users\\Ashwini\\Desktop");		//Count Total number of rows present in the table
		List<WebElement> allRows = webdriver.findElements(By.xpath("//tr"));
		int totalRows = allRows.size();
		System.out.println("total number of rows present in the table is :"+ totalRows);
		//count total number of columns
		List<WebElement> allColumns = webdriver.findElements(By.xpath("//th"));
		int totalColumns = allColumns.size();
		System.out.println("Total number of columns in the table is :" + totalColumns);
		//Count number of cells present in the table
		List<WebElement> allCells = webdriver.findElements(By.xpath("//th|//td"));
		int totalCells = allCells.size();
		System.out.println("Total number of cells present in the table is :" + totalCells);
		//Print ONLY the numbers
		int countNumberValue = 0;
		int sum=0;
		for (WebElement cell : allCells) {
		String cellValue = cell.getText();
		try{
		int number = Integer.parseInt(cellValue);
		System.out.print(" "+number);
		countNumberValue++;
		sum = sum+number;
		}catch (Exception e) {
		}
		}
		System.out.println("Total count of numeric values is :"+countNumberValue);
		System.out.println("Total sum of all the numeric values is :"+sum);
		//close the browser
		webdriver.close();
	}
}
