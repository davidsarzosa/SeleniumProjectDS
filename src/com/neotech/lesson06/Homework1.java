package com.neotech.lesson06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.BaseClass;

public class Homework1 extends BaseClass {

//	HW1: Orange HRM Application Login:
//		Open Chrome browser
//		Go to https://hrm.neotechacademy.com/
//		Enter valid username and password
//		Click on login button
//		Then verify that "span with id account-name" has the text "Jacqueline White".
//		Quit the browser
	public static void main(String[] args) throws InterruptedException {

		setUp();

		// Write the code

		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.cssSelector("#txtPassword")).sendKeys("Neotech@123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		WebElement jqel = driver.findElement(By.cssSelector("#account-name"));
		String JaquiName = jqel.getText();
		Thread.sleep(2000);
		if (JaquiName.equals("Jacqueline White")) {
			System.out.println("Teste Passed!!");
		} else {
			System.out.println("displaying this when getting text " + JaquiName);
		}
		Thread.sleep(2000);

		tearDown();

	}
}
