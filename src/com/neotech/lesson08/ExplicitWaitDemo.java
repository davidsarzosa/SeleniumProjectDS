package com.neotech.lesson08;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.BaseClass;

public class ExplicitWaitDemo extends BaseClass {
	public static void main(String[] args) {

		// https://neotech.vercel.app/waits
		setUp();

		// Explicit Way:
		// There is a Selenium method/class that is coming for explicit way

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("button1")));

		WebElement button = driver.findElement(By.id("button1"));
		System.out.println("The invisible button is now available " + button.isDisplayed());

		button.click();
		tearDown();

	}

}
