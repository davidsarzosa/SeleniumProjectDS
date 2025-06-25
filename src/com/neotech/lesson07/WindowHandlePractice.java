package com.neotech.lesson07;

import java.util.Set;

import org.openqa.selenium.By;

import utils.BaseClass;

public class WindowHandlePractice extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		// https://demoqa.com/browser-windows
		setUp();
		// Print title and get the main window handle
		System.out.println("Title --> " + driver.getTitle());
		String mainWH = driver.getWindowHandle();

		Thread.sleep(2000);
		driver.findElement(By.id("tabButton")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("windowButton")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("messageWindowButton")).click();
		Thread.sleep(2000);

		// Where is the focus of the driver ??
		// Main page
		// How can I get all the handles ?
		Set<String> allHandles = driver.getWindowHandles();
		System.out.println("Number of handles " + allHandles.size());

		for (String handle : allHandles) {
			if (!handle.equals(mainWH)) {
				// Switch to that page
				driver.switchTo().window(handle);
				Thread.sleep(3000);
				// System.out.println("Title --> " + driver.getTitle());
				// In this case they have no title

				// close that page
				driver.close();
			}
		}

		tearDown();

	}

}
