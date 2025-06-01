package com.neotech.lesson06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import utils.BaseClass;

public class AlertDemo extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		setUp();

		driver.findElement(By.name("cusid")).sendKeys("12345");
		driver.findElement(By.name("submit")).click();
		Thread.sleep(2000);

		// switchTo() method is used to switch into the Alert box
		Alert simpleAlert = driver.switchTo().alert();

		// lest dismiss the alert
		String alertText = simpleAlert.getText();
		System.out.println("The simple alext sayds " + alertText);
		Thread.sleep(2000);
		simpleAlert.dismiss(); // clicking on Cancel on Alert box

		Thread.sleep(2000);

		// lets create the alert again by clicking on the button
		driver.findElement(By.name("submit")).click();
		Alert secondAlert = driver.switchTo().alert();
		Thread.sleep(2000);
		secondAlert.accept();
		Thread.sleep(2000);

		// lest Handle the last alert
		Alert lastAlert = driver.switchTo().alert();
		System.out.println(lastAlert.getText());
		Thread.sleep(2000);

		lastAlert.accept();
		Thread.sleep(2000);

		driver.switchTo().alert().accept();

		tearDown();

	}

}
