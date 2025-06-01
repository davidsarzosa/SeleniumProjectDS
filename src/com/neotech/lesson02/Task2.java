package com.neotech.lesson02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task2 {

	public static void main(String[] args) throws InterruptedException {

		// Lets try to open some firefox and then
		WebDriver driver = new FirefoxDriver();

		/*
		 * 1 Navigate to "https://www.zillow.com/" 2
		 * 
		 */

		driver.get("https://www.zillow.com/");
		driver.findElement(By.linkText("Rent")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("__c11n_pfg12")).sendKeys("Chicago");
		Thread.sleep(4000);

		driver.quit();

	}

}
