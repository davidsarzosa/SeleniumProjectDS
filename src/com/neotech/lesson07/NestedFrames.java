package com.neotech.lesson07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.BaseClass;

public class NestedFrames extends BaseClass {

	// https://neotech.vercel.app/iframe/nested

	public static void main(String[] args) throws InterruptedException {
		setUp();
		// move to the parent frame

		driver.switchTo().frame(driver.findElement(By.id("parent-frame")));
		// Thread.sleep(1000);

		// Switch to the child frame
		driver.switchTo().frame(driver.findElement(By.id("child-frame")));

		// Get the text of the child frame
		WebElement p = driver.findElement(By.tagName("p"));
		String text = p.getText();
		System.out.println("The text inside Child Frame is -> " + text);
		tearDown();
	}

}
