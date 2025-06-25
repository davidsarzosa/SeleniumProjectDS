package com.neotech.lesson12;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.google.common.io.Files;

import utils.CommonMethods;
import utils.ConfigsReader;

public class Task1 extends CommonMethods {

//	go to https://hrm.neotechacademy.com/
//	enter username
//	leave password blank
//	submit the form
//	and take a screenshot of the error page

	public static void main(String[] args) {

		setUp();

		// login to the application

		sendText(driver.findElement(By.xpath("//input[@id='txtUsername']")), ConfigsReader.getProperty("username"));
		sendText(driver.findElement(By.xpath("//input[@id='txtPassword']")), ConfigsReader.getProperty("password"));

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		// Create an object that can take screenshot
		TakesScreenshot ssDriver = (TakesScreenshot) driver;
		// lets take the screenshot using the ssDrriver object
		File screenShot = ssDriver.getScreenshotAs(OutputType.FILE);

		try {
			File screenShotDir = new File("screenshots/HRM");

			// check if the directory exists
			if (!screenShotDir.exists()) {
				// create the folders
				screenShotDir.mkdir();
			}
			File screenshotLocation = new File("screenshots/HRM/blank_password_error.png");
			Files.copy(screenShot, screenshotLocation);

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Unable to take the screenshot! ");
		}

		/////////////////////////////////////
		/// To take a screenshot we need to create an object that takes screenshots
		/// TakeScreenshot ssDriver = (TakesScreenshot) driver
		/// // ssDriver is the OBJECT that will take the pictures
		/// now we can use that object that Selenium let you use
		/// But you need to store it into a File so you will create the file
		/// File screenShot = ssdriver.getScreenshotAs(OutpuType.FILE);
		////////////////////////////////////////

		tearDown();

	}
}
