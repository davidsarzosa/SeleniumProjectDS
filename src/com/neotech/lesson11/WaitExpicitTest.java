package com.neotech.lesson11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class WaitExpicitTest extends CommonMethods {

	public static void main(String[] args) {

		setUp();

		waitForVisibility(By.id("button1"));
		WebElement button = driver.findElement(By.id("button1"));

		System.out.println("The invisible button is now available : " + button.isDisplayed());

		button.click();
		// click(button);
		
		tearDown();

	}

}
