package com.neotech.lesson07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.BaseClass;

public class FrameDemo extends BaseClass {

	// https://jqueryui.com/tooltip/
	// as always we will start the setUp()
	public static void main(String[] args) throws InterruptedException {

		setUp();

		// If we try to run this without switching to frame, then we get a
		// NoSuchElementException
		// Because the element inside the frame

		// I have to switch to the frame before using any element inside it
		// 1. switch to frame by index
		driver.switchTo().frame(0);
		WebElement age = driver.findElement(By.id("age"));
		age.sendKeys("44");
		Thread.sleep(2000);

		// We are currently inside the frame, I cannot click unless I come back from the
		// frame

		// We need to switch to the default page
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Button")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		// 2. Switch to frame by name or Id
		// driver.switchTo().frame("FrameName");

		// 3. Switch to frame by WebElement
		WebElement frameEl = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frameEl);
		age.clear();
		age.sendKeys("40");
		Thread.sleep(3000);
		age.clear();
		Thread.sleep(3000);
		age.sendKeys("30");
		Thread.sleep(3000);

		// Switch back to the main content
		driver.switchTo().defaultContent();

		tearDown();
		// I will save this for later is the Iframe xPATH
		// iframe[@class='demo-frame']

	}

}
