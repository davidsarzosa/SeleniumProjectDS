package com.neotech.lesson13;

import org.openqa.selenium.By;

import utils.CommonMethods;
import utils.ConfigsReader;

public class Homework2 extends CommonMethods {
//	/*
//	Go to https://hrm.neotechacademy.com/
//	Log in using our custom methods
//	Go to PIM menu
//	Add an employee
//	Go to Employee List
//	Get the list of the employees (Using tables - tr and td) 
//	Loop to search for the employee you added
//	When you find the employee - click on it.
//	Take a screenshot
//	 */

	public static void main(String[] args) throws InterruptedException {

		setUp();

		// Loging
		sendText(driver.findElement(By.id("txtUsername")), ConfigsReader.getProperty("username"));
		sendText(driver.findElement(By.id("txtPassword")), ConfigsReader.getProperty("password"));
		click(driver.findElement(By.xpath("//div[@class='button-holder']")));

		wait(2);

		// Navigate to PIM
		click(driver.findElement(By.id("menu_pim_viewPimModule")));
		// Click on Add Employee
		click(driver.findElement(By.id("menu_pim_addEmployee")));
		// Add employee data

		// Probably we need to wait were!!

		sendText(driver.findElement(By.id("first-name-box")), "Consuelo");
		sendText(driver.findElement(By.id("last-name-box")), "Moya Silva");

			
		wait(3);

		// Add employee Data

		tearDown();

	}

}
