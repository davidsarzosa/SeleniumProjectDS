package com.neotech.lesson06;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.BaseClass;

public class MultipleSelectorDropDown extends BaseClass {

	// We have another link to add to the configsReader.file --> that is coming
	// through extending BaseClass by accessing the Constants class

	// link -> https://demo.seleniumeasy.com/basic-select-dropdown-demo.html
	public static void main(String[] args) throws InterruptedException {

		setUp();

		WebElement multiSelectDdElement = driver.findElement(By.id("multi-select"));
		Select multiSelectDD = new Select(multiSelectDdElement);

		// lets check if multi selection is enabled ?

		boolean isMultiSelect = multiSelectDD.isMultiple();
		System.out.println("The drop down is multi select: " + isMultiSelect);

		if (isMultiSelect) {
			List<WebElement> options = multiSelectDD.getOptions();

			for (WebElement opt : options) {
				String text = opt.getText();
				System.out.println("The visible text is " + text);

				multiSelectDD.selectByVisibleText(text);
				Thread.sleep(2000);

			}

		}

		// de-select the first item in dropDown
		multiSelectDD.deselectByIndex(0);
		Thread.sleep(2000);

		// de-select all items
		multiSelectDD.deselectAll();
		Thread.sleep(2000);
		tearDown();

	}
}
