package com.neotech.lesson01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFireFoxDriver {

	public static void main(String[] args) throws InterruptedException {

		// Do I need to re-attach the libraries ?
		// No, we already added the external Jar files
		// (Language biding)

		// Do I have to download the driver ?
		// on previous versions of Selenium we had to download the driver for all the
		// Browsers we wanted to use.

		// now, Selenium handles that itself.

		// Open the FireFox Browser

		// WebDriver driver = new ChromeDriver();

		WebDriver driver = new FirefoxDriver();

		// We want to go to the neotechacademy URL
		driver.get("https://www.neotechacademy.com/");

		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://www.neotechacademy.com/";

		// we can put a if condition and check if the URL is the same

		if (actualURL.equals(expectedURL)) {
			System.out.println("Title: " + driver.getTitle());
		} else {
			System.out.println("The URL is wrong! ");
		}

		Thread.sleep(10000); // I will use this to stop the code for some seconds and see the web

		// But never forget to close the WebDriver

		driver.quit(); // Closing the browser

		
	}

}
