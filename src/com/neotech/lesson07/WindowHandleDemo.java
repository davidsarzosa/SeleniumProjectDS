package com.neotech.lesson07;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import utils.BaseClass;

public class WindowHandleDemo extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		setUp();
		// https://accounts.google.com/signup

		System.out.println("Title --> " + driver.getTitle());
		System.out.println("Window Handle " + driver.getWindowHandle());
		Thread.sleep(2000);

		driver.findElement(By.linkText("Help")).click();
		// driver.findElement(By.xpath("//li[@class='qKvP1b'][1]/a")).click();
		Thread.sleep(3000);

		Set<String> allWHandles = driver.getWindowHandles();
		// System.out.println(allWHandles);
		System.out.println("Number of Handles --> " + allWHandles.size());

		Iterator<String> it = allWHandles.iterator();
		String window1 = it.next();
		String window2 = it.next();
		System.out.println("Window 1 ---> " + window1);
		System.out.println("Window 2 ---> " + window2);

		Thread.sleep(3000);

		// It might look like the driver directly moved to the new tab.
		// That is not true!!
		// We need to switch the attention of the driver to the new page using the
		// handle

		// switch to the other window
		driver.switchTo().window(window2);
		String title2 = driver.getTitle();
		System.out.println("Title 2 --> " + title2);
		Thread.sleep(3000);

		// This will close the window the driver is currently focused on
		driver.close();
		Thread.sleep(3000);
		tearDown();

	}

}
