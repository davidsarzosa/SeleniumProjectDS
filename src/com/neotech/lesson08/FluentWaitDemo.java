package com.neotech.lesson08;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import utils.BaseClass;

public class FluentWaitDemo extends BaseClass {

	public static void main(String[] args) {
		// https://neotech.vercel.app/waits
		setUp();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));

		// Explicit waits:
		// WebDriverWait
		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		// fluentWait
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(15));
		wait.pollingEvery(Duration.ofSeconds(1));
		wait.ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("button1")));

		WebElement button = driver.findElement(By.id("button1"));
		System.out
				.println("The invisible button is now available --> " + button.getText() + " " + button.isDisplayed());
		button.click();
		tearDown();

	}

}
