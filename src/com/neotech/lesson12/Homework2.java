package com.neotech.lesson12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class Homework2 extends CommonMethods {

	public static void main(String[] args) {

		// WindowHandleDemo at com.neotech.lesson07 using the CommonMethods.java
		// https://accounts.google.com/signup

		setUp();

		System.out.println("Title --> " + driver.getTitle());
		System.out.println("Windows Hanldle -- > " + driver.getWindowHandle());
		wait(1);

		WebElement helpBtn = driver.findElement(By.linkText("Help"));
		helpBtn.click();

		switchToChildWindow();
		wait(1);

		String title2 = driver.getTitle();
		System.out.println("Title --> " + title2);

		wait(1);
		// Close the child window
		//driver.close();

		driver.switchTo().defaultContent();
		driver.close();
		wait(1);
		
		// Driver does not automatically switch back to parent window
		//System.out.println("Title --> " + driver.getTitle());

		tearDown();

	}

}
