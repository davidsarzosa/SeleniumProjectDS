package com.neotech.lesson02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SabahHM {

	public static void main(String[] args) throws InterruptedException {

		/*
		 * HW1: Amazon Page Title Verification: Open chrome browser Go to
		 * “https://www.amazon.com/” Verify Title “Amazon.com: Online Shopping for
		 * Electronics, Apparel, Computers, Books, DVDs & more” is displayed End the
		 * Session (close the browser).
		 */

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.com/");
		String actualTitle = driver.getTitle();
		String expectedTitle = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";

		if (expectedTitle.equals(actualTitle)) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Failed! ");
		}

		Thread.sleep(5000);

		driver.quit();

	}

}
