package com.neotech.lesson13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.CommonMethods;

public class Homework1 extends CommonMethods {

//	
//	/*
// 	Open chrome browser
//	Go to https://demo.guru99.com/test/drag_drop.html
//	Drag the following blocks in different ways
//	Drag BANK to DEBIT SIDE
//	Drag SALES to CREDIT SIDE
//	Drag 5000 to DEBIT SIDE
//	Drag 5000 to CREDIT SIDE
//	Close the browser 
// 
// */

	public static void main(String[] args) {
		setUp();
		
		// Location of the bank to be dragged
		WebElement from1 = driver.findElement(By.xpath("//li[@class='block14 ui-draggable']"));
		
		// Locate the debit side to place the Bank
		WebElement to1 = driver.findElement(By.xpath("//ol[@class='field14 ui-droppable ui-sortable']"));

		// Locate the credit side to place the Sales
		WebElement from2 = driver.findElement(By.id("credit1"));

		// Locate the debit side to place the 5000
		WebElement to2 = driver.findElement(By.id("amt7"));

		// Locate the 500
		WebElement from3 = driver.findElement(By.id("fourth"));

		// Locate the credit side to the plave 5000
		WebElement to3 = driver.findElement(By.id("amt7"));

		// Locate the credit side to place 5000
		WebElement to4 = driver.findElement(By.id("amt8"));

		// To do an action, We need an Actions object

		Actions action = new Actions(driver);
		action.dragAndDrop(from1, to1).perform();
		wait(3);
		action.dragAndDrop(from2, to2).perform();
		wait(3);
		action.dragAndDrop(from3, to3).perform();
		wait(3);

		action.clickAndHold(from3).moveToElement(to4).release().perform();
		// same as: actions.dragAndDrop(from3,to4).perform();

		// Verify that perfect! is displayed
		if (driver.findElement(By.linkText("Perfect!")).isDisplayed()) {
			System.out.println("Test Passed!! ");
		} else {
			System.out.println("Test Failed!! ");
		}
		
		
		tearDown();

	}

}
