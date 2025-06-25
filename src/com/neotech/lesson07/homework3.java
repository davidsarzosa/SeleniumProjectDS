package com.neotech.lesson07;

import java.util.List;

import org.apache.xmlbeans.impl.soap.Text;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.BaseClass;

public class homework3 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

//			Homework 3:
//	        Open chrome browser
//	        Go to "https://semantic-ui.com/modules/dropdown.html"
//	        Scroll down to "Multiple Selection"
//	        Click on drop down and select "CSS" and "HTML"
//	        Verify value has been selected
//	        Deselect 1 of the options from the dropdown
//	        Quit browser
		setUp();

		// Scroll down to multiple selection

		driver.findElement(By.xpath("//div[@class='ui fluid dropdown selection multiple']")).click();
		Thread.sleep(1000);

		// Selection of the multiple skills
		driver.findElement(By.xpath("//div[@class='menu transition visible']/div[text()='HTML']")).click();
		driver.findElement(By.xpath("//div[@class='menu transition visible']/div[text()='CSS']")).click();
		Thread.sleep(1000);

		List<WebElement> selectedElements = driver.findElements(By.xpath("//a[@class='ui label transition visible']"));

		for (WebElement el : selectedElements) {
			String text = el.getText();
			// or
			String attributeText = el.getAttribute("data-value");
			System.out.println(text + " vs " + attributeText);
			if (text.contains("CSS")) {
				System.out.println("Test Passed!");
			}

		}

		driver.findElement(By.xpath("//a[@data-value='html']")).click();
		Thread.sleep(5000);

		tearDown();

	}

}
