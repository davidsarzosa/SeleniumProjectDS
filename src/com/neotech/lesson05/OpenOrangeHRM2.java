package com.neotech.lesson05;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utils.ConfigsReader;
import utils.Constants;

public class OpenOrangeHRM2 {

	public static void main(String[] args) throws InterruptedException {

		ConfigsReader.readProperties(Constants.CONFIGURATION_FILEPATH);
		String browser = ConfigsReader.getProperty("browser");

		WebDriver driver = null;
		// System.out.println(browser);
		switch (browser.toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		default:
			break;

		}

		// This is my testing part
		String url = ConfigsReader.getProperty("url");
		String title = driver.getTitle();
		System.out.println(title);

		Thread.sleep(2000);
		driver.quit();

	}

}
