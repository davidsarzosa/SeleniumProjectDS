package com.neotech.lesson02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserComands {

	public static void main(String[] args) throws InterruptedException {

		// Lets determinate some commands with Selenium

		// 1. Open chrome browser
		// 2. Navigate to "https://www.zillow.com/";
		// 3. Navigate to "https://www.google.com/"
		// 4. Navigate Back to Zillow Page
		// 5. Refresh current page
		// 6. Verify URL contains "Zillow"

		// Lets get started

		WebDriver driver = new FirefoxDriver();

		// 1st way to get the url : use .get();
		// driver.get("//www.zillow.com/"); // this does not maintain the browser
		// history

		// 2nd Way: use .navigate().to
		driver.navigate().to("https://www.zillow.com/"); // it will maintain the browser if you want to come back to the
		// browser
		Thread.sleep(6000);

		// Maximize the screen --> there is 2 ways
		// driver.manage().window().maximize();
		driver.manage().window().fullscreen();
		// then lets wait for another 4 seconds --> Thread.sleep(4000);
		Thread.sleep(4000);

		driver.navigate().to("https://www.google.com/");
		Thread.sleep(4000);

		// Get back to the previous page.
		driver.navigate().back();

		Thread.sleep(4000);
		driver.navigate().refresh();

		String url = "https://www.zillow.com/";
		String currentURL = driver.getCurrentUrl();

		if (url.equals(currentURL)) {
			System.out.println("Test Passed!!! ");
		} else {
			System.out.println("Test Failed!! ");
			System.out.println("Current URL " + currentURL);
			System.out.println("Expected URL " + url);

		}

		// Lets close the driver for good practices

		driver.quit();
	}

}
