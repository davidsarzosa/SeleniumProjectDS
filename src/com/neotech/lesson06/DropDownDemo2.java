package com.neotech.lesson06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.BaseClass;

public class DropDownDemo2 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		// new URL https://demoqa.com/select-menu
		// This is coming directly from the configuration.properties through --> The
		// BaseClass --> opening a public static class from ConfigsReader class

		setUp();

		// one line
		// Select colorDD = new Select(driver.findElement(By.id("oldSelectMenu")));

		// Locate the WebElement first
		WebElement colorDdElement = driver.findElement(By.id("oldSelectMenu"));

		Select colorDD = new Select(colorDdElement);
		colorDD.selectByIndex(1);
		Thread.sleep(3000);

		WebElement modernGroup = driver.findElement(By.id("withOptGroup"));
		modernGroup.click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[contains(text(),'Group1, option2')]")).click();
		Thread.sleep(3000);

		tearDown();

	}

}
