package com.neotech.lesson06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.BaseClass;

public class Homework2 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

//		TC 2: Orange HRM Application Negative Login: 
//		Open Chrome browser
//		Go to https://hrm.neotechacademy.com/
//		Enter valid username
//		Leave password field empty
//		Verify error message with text "Password cannot be empty" is displayed.

		setUp();

		// TC
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.cssSelector("#txtPassword")).sendKeys("");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);

		WebElement emptyPass = driver.findElement(By.cssSelector("#txtPassword-error"));
		String passEmpty = emptyPass.getText();
		System.out.println("accessing without password messgae is --> " + passEmpty);

		if (passEmpty.contains("Password cannot be empty")) {
			System.out.println("Test Passed!! ");
		} else {
			System.out.println("Test Failed!!");
		}

		tearDown();

	}
}
