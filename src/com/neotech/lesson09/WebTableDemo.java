package com.neotech.lesson09;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.BaseClass;

public class WebTableDemo extends BaseClass {

	// lets initiate the browser

	public static void main(String[] args) {
		setUp();

		System.out.println("----------Table Header----------");

		// to create a WebElement of a table we do need to find all elements
		List<WebElement> hearderData = driver.findElements(By.xpath("//table[@id='task-table']"));

		// Now all the table is in the data then what ?
		// Then now we can use Iterator to get all text and loop the table
		Iterator<WebElement> it = hearderData.iterator();
		while (it.hasNext()) {
			String headerText = it.next().getText();
			System.out.print(headerText + " | ");

		}
		System.out.println();

		// Lest find the number of rows
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr"));
		System.out.println("Table has " + rows.size() + " rows ");

		// what does this do ?
		System.out.println(rows.get(0).getText());

		// lets print the content of each td
		List<WebElement> tds = driver.findElements(By.xpath("//table[@id='task-table']/tbody//td"));

		System.out.println();
		for (WebElement td : tds) {
			System.out.println(td.getText());
		}
		tearDown();

	}

}
