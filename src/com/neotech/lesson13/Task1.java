package com.neotech.lesson13;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.google.common.io.Files;

import utils.CommonMethods;

public class Task1 extends CommonMethods {

	public static void main(String[] args) {
		// http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwFileUpload

		setUp();

		String filePath = System.getProperty("user.dir") + "/screenshots/Lesson13/Homework2.png";

		// Send the location of the file to the input
		sendText(driver.findElement(By.id("gwt-debug-cwFileUpload")), filePath);

		wait(3);

		click(driver.findElement(By.xpath("//button[@class='gwt-Button']")));

		System.out.println(" Alert Text -- > " + getAlertText());

		acceptAlert();

		// TakeScreenShot

		// Open the camera app -- cast the driver as TS
		TakesScreenshot ts = (TakesScreenshot) driver;

		// Take the photo

		File sf = ts.getScreenshotAs(OutputType.FILE);

		try {
			Files.copy(sf, new File("screenshots/Lesson13/FileUpload.png"));

		} catch (Exception e) {
			e.printStackTrace();

		}

		tearDown();

	}
}
