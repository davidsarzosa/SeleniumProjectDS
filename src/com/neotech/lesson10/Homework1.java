package com.neotech.lesson10;

import java.util.List;

import org.apache.commons.io.FileSystemUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.BaseClass;
import utils.ConfigsReader;

public class Homework1 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
//	1) Open chrome browser
//	2) Go to "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx"
//	3) Login to the application
//	4) Verify customer "Susan McLaren" is present in the table
//	5) Click on customer details
//	6) Update customers last name and credit card info
//	7) Verify updated customers name and credit card number is displayed in table
//	8) Close browser

		setUp();

		driver.findElement(By.xpath("//input[@id='ctl00_MainContent_username']"))
				.sendKeys(ConfigsReader.getProperty("username2"));
		driver.findElement(By.xpath("//input[@id='ctl00_MainContent_password']"))
				.sendKeys(ConfigsReader.getProperty("password2"));
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
		// Thread.sleep(4000);

		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr"));
		String expected = "Susan McLaren";

		// ones we have found the elements that contains --> rows now we can loop them
		// and print the text

		for (int i = 0; i < rows.size(); i++) {
			// now we need to get the text of each element --> what is the element ? String!
			String rowText = rows.get(i).getText();

			// We can print all the rows as a test of the test to make sure we are getting
			// the correct values before we continue
			// System.out.println(rowText);

			if (rowText.contains(expected)) {

				// Click on the details
				System.out.println("Test Passed! Susan McLaren is there");
				break;
			}
		}

		driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[6]/td[13]/input")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_txtName']")).clear();
		driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_txtName']")).sendKeys("Susan Bunny");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox6']")).clear();
		driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox6']")).sendKeys("9685385739485");
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_UpdateButton")).click();
		Thread.sleep(1000);

		List<WebElement> rows2 = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr"));
		String expected2 = "Susan Bunny";

		// ones we have found the elements that contains --> rows now we can loop them
		// and print the text

		for (int i = 0; i < rows2.size(); i++) {
			// now we need to get the text of each element --> what is the element ? String!
			String rowText2 = rows2.get(i).getText();

			// We can print all the rows as a test of the test to make sure we are getting
			// the correct values before we continue
			// System.out.println(rowText);

			if (rowText2.contains(expected2)) {

				// Click on the details
				System.out.println("Test Passed! Susan Bunny is there");
				break;
			}
		}

		tearDown();

	}

}
