package com.neotech.lesson12;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.google.common.io.Files;

import utils.CommonMethods;
import utils.ConfigsReader;

public class ScreenshotDemo extends CommonMethods {

	public static void main(String[] args) {
		// https://hrm.neotechacademy.com/

		setUp();

		// lets log in
		sendText(driver.findElement(By.id("txtUsername")), ConfigsReader.getProperty("username"));
		sendText(driver.findElement(By.id("txtPassword")), ConfigsReader.getProperty("password"));
		click(driver.findElement(By.xpath("//button[@type='submit']")));

		wait(5);

		// I want to take a screenshot of the dashboard;
		// These are the manual steps
		// 1. open the screenshot taking app
		// 2. take the screenshot
		// 3. save the screenshot

		// create an object that can take screenshots
		TakesScreenshot ssDriver = (TakesScreenshot) driver;

		// lets take the screenshot using our new ssDriver object
		File screenShot = ssDriver.getScreenshotAs(OutputType.FILE);

		// lets save the screenshot
		try {
			File screenShotsDir = new File("screenshots/HRM");

			// check if the screenshots and HRM folders exist
			if (!screenShotsDir.exists()) {
				// if not, create the folders
				screenShotsDir.mkdirs();
			}

			File screenShotLocation = new File("screenshots/HRM/dashboard1.png");
			Files.copy(screenShot, screenShotLocation);
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Unable to save the screenshot!");
		}

		tearDown();

	}

}
