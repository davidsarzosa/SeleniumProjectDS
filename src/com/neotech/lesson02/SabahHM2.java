package com.neotech.lesson02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SabahHM2 {

	public static void main(String[] args) throws InterruptedException {

		/*
		 * HW2: Opening Page on Firefox Browser Open Firefox browser Navigate to
		 * “https://www.redfin.com/” Verify that you have navigated to
		 * (https://www.redfin.com/) End the Session (close the browser).
		 */

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.redfin.com/");

		Thread.sleep(1000);
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://www.redfin.com/";

		if (actualURL.equals(expectedURL)) {
			System.out.println("Test Passed!! ");
		} else {
			System.out.println("Test Failed!! ");

		}

		System.out.println("ActualURL " + actualURL);
		System.out.println("ExpectedURL" + expectedURL);
		
		
		// Best practices is always to close the driver before we start driving some code. 
		
		
		
		driver.quit();

	}

}
