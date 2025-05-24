package com.neotech.lesson02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) throws InterruptedException {

		/*
		 * Open chrome browser Go to "https://demo.guru99.com/test/newtours/" Click on
		 * Register Link
		 * 
		 * Fill out just First Name: Last Name: Phone: Email: And Click Submit
		 * 
		 */

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		Thread.sleep(1000);

		// driver.findElement(By.linkText("REGISTER")).click();
		// find an element with an anchor tag <a ... that includes the text Rgist
		driver.findElement(By.partialLinkText("STER")).click();
		driver.findElement(By.name("firstName")).sendKeys("Kaylee");
		driver.findElement(By.name("lastName")).sendKeys("Lindburg");
		driver.findElement(By.name("phone")).sendKeys("7372917338");
		driver.findElement(By.id("userName")).sendKeys("kaylee.lindburg@gmail.com");

		Thread.sleep(5000);
		driver.findElement(By.name("submit")).click();
		Thread.sleep(5000);
		driver.quit();

	}

}
