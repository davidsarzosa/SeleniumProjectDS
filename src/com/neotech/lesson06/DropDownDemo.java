package com.neotech.lesson06;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.BaseClass;

public class DropDownDemo extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		// all the links needs to come from configuration.properties file through the
		// ConfisReader

		// https://sis.neotechacademy.com/Default.aspx

		setUp();

		driver.findElement(By.id("tUsername")).sendKeys("Admin");
		driver.findElement(By.id("tPassword")).sendKeys("Neotech@123");
		Thread.sleep(2000);

		WebElement yDropDElement = driver.findElement(By.id("dAcademicYear_list"));
		// Create a Select object out of DropDown WebElement
		Select yearDd = new Select(yDropDElement);

		// Select by Index
		yearDd.selectByIndex(1);
		Thread.sleep(2000);

		// Select By Value
		yearDd.selectByValue("10");
		Thread.sleep(2000);

		// Select by visible text
		yearDd.selectByVisibleText("2019-2020");

		// lets get the options of the Select Object
		// by options we mean all the options inside the
		// DropDown Element

		// Este paso es indespensable para poder hacer el loop de cualquier manera
		List<WebElement> options = yearDd.getOptions();

		for (int i = 0; i < options.size(); i++) {
			yearDd.selectByIndex(i);
			System.out.println(options.get(i).getText());
			Thread.sleep(2000);
		}

		// Lets do it with a each for loop
		for (WebElement option : options) {
			yearDd.selectByVisibleText(option.getText());
			Thread.sleep(2000);
		}

		tearDown();

	}

}
