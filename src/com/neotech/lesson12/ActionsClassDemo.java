package com.neotech.lesson12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.CommonMethods;

public class ActionsClassDemo extends CommonMethods {

	public static void main(String[] args) {

		// https://www.amazon.com/
		setUp();

		wait(5);

		Actions action = new Actions(driver);

		WebElement singIn = driver.findElement(By.id("nav-link-accountList"));
		// no action will be done unless .perform(): is called
		action.moveToElement(singIn).perform();

		wait(3);
		// now lets check if the cursor is moved to the right location
		WebElement div = driver.findElement(By.id("nav-flyout-ya-newCust"));

		if (div.getText().contains("Start")) {
			System.out.println("Menu is displayed! ");
		} else {
			System.out.println("Menu is not displayed! ");
		}

		// how can I right click ?
		action.contextClick();

		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));

		action.moveToElement(searchBox).perform();
		wait(3);
		action.click().perform();
		wait(3);
		action.sendKeys("books").perform();
		wait(3);
		action.doubleClick().perform();

		wait(3);

		tearDown();

	}
}
