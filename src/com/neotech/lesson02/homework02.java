package com.neotech.lesson02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class homework02 {

	public static void main(String[] args) {

		/*
		 * HW2: Opening Page on Firefox Browser Open Firefox browser Navigate to
		 * “https://www.redfin.com/” Verify that you have navigated to
		 * (https://www.redfin.com/) End the Session (close the browser).
		 * 
		 */

		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.redfin.com/");
		String CurrenetURL = driver.getCurrentUrl();
		String ExpectedURL = "https://www.redfin.com/";

		if (CurrenetURL.equals(ExpectedURL)) {
			System.out.println("Test passed ");
		} else {
			System.out.println("Wrong URL ");
		}

		// This will be the last step
		driver.quit(); // closing the browser
		
		
		

	}

}
