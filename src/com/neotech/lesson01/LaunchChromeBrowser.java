package com.neotech.lesson01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {

	public static void main(String[] args) throws InterruptedException {

		// open the browser
		WebDriver driver = new ChromeDriver();

		// Go to the URL

		driver.get("https://coding.neotechacademy.com/profile");

		// Do what ever test you need
		// this would be where the actions take place
		// for now I just want o ode to stop here, so that i can see the page loading
		Thread.sleep(10000); // this is stooping the execution for 10 seconds

		// Always close the browser
		driver.quit();
		
		
		
		

	}

}
