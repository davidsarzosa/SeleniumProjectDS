package com.neotech.lesson02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class homework01 {

//		HW1: Amazon Page Title Verification: 
//		Open chrome browser
//		Go to “https://www.amazon.com/”
//		Verify Title “Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more” is displayed
//		End the Session (close the browser).

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.com/");

		String actualURL = driver.getCurrentUrl();
		String spectedURL = "https://www.amazon.com/";
		String actualTitle = driver.getTitle();

		if (actualTitle.equals("Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more")) {
			System.out.println("Test passed");
		} else {
			System.out.println("Different Tittle displeyed");
		}
		Thread.sleep(10000);

		driver.quit();

	}

}
