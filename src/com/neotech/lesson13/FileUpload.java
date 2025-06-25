package com.neotech.lesson13;

import org.openqa.selenium.By;

import utils.CommonMethods;

public class FileUpload extends CommonMethods {

	// https://the-internet.herokuapp.com/

	public static void main(String[] args) {

		setUp();

		click(driver.findElement(By.linkText("File Upload")));
		// Keep in mind! Selenium CANNOT control the explorer/finder windows

		// To UpLoad a file we will send the file path to the input element

		String filePath = System.getProperty("user.dir") + "/screenshots/Lesson13/Homework2.png";
		wait(2);
		sendText(driver.findElement(By.id("file-upload")), filePath);
		wait(2);
		click(driver.findElement(By.id("file-submit")));
		wait(2);

		tearDown();

	}

}
