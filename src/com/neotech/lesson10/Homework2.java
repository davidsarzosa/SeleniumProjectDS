package com.neotech.lesson10;

import org.openqa.selenium.By;

import utils.BaseClass;
import utils.ConfigsReader;

public class Homework2 extends BaseClass {

//	=================   Lesson 09 HW 2 =================================
//	TC: Delete Orders
//
//	1) Open chrome browser
//	2) Go to "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx"
//	3) Login to the application
//	4) Click on the checkbox of all orders with product FamilyAlbum
//	5) Delete Selected orders
//	6) Verify the orders have been deleted
//	7) Quit the browser

	public static void main(String[] args) throws InterruptedException {

		setUp();

		driver.findElement(By.xpath("//input[@name='ctl00$MainContent$username']"))
				.sendKeys(ConfigsReader.getProperty("username2"));
		driver.findElement(By.xpath("//input[@name='ctl00$MainContent$password']"))
				.sendKeys(ConfigsReader.getProperty("password2"));
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
		Thread.sleep(2000);
		
		
		
		
		

		tearDown();

	}

}
