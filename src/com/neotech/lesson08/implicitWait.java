package com.neotech.lesson08;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.BaseClass;

public class implicitWait extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		// https://neotech.vercel.app/waits
		setUp();

		// implicit wait ---
		// findElement(); and .findElements(); immediately will try to locate the
		// element
		// if they send the request faster then the element is loaded, then we get a
		// NoSuchElementException
		// how would we declare a pageLoadTimeout()??
		// before get() or navigate().to().
		// driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));

		// If we use implicit wait, we are telling
		// the NoSuchElementException
		// by default, implicit wait is 0 second.

		// defining an implicit wait of 15 seconds
		// - right after the driver is initialized
		// - this wait will be for every element we try to find until the driver is
		// quits

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		// will wait Up TO 15 seconds

		// how would we declare a pageLoadTimeout()??
		// before get() or navigate().to().

		WebElement button = driver.findElement(By.id("button1"));
		button.click();

		// Thread.sleep(10000); // will always spend 10 sencons her eand will only be
		// for this line
		
		Thread.sleep(4000);
		tearDown();

	}

}
