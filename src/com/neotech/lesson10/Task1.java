package com.neotech.lesson10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.BaseClass;
import utils.ConfigsReader;

public class Task1 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

//	 	1) Open chrome browser
//		2) Go to https://hrm.neotechacademy.com/
//		3) Login into the application
//		4) Select Discipline
//		5) Select Disciplinary Cases
//		6) Click on Filter (Up-Right next to Help)
//		7) Select from June 6, 2024 to July 15, 2024
//		8) Click on Search
//		9) Validate that there are no rows in result table
//		10) Quit the browser

		setUp();

		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(ConfigsReader.getProperty("username"));
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(ConfigsReader.getProperty("password"));
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		// Thread.sleep(1000);
		driver.findElement(By.xpath("//li[@id='menu_discipline_defaultDisciplinaryView']")).click();
		// Thread.sleep(1000);
		driver.findElement(By.id("menu_discipline_viewDisciplinaryCases")).click();
		// Thread.sleep(1000);

		WebElement iframe = driver.findElement(By.xpath("//iframe[@id='noncoreIframe']"));
		driver.switchTo().frame(iframe);

		driver.findElement(By.xpath("//a[@id='searchModal']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@id='DisciplinaryCaseSearch_createdDateFrom']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//div[@class='select-wrapper picker__select--month']/input")).click();
		driver.findElement(By.xpath("//div[@class='select-wrapper picker__select--month']/input")).click();
		
		
		Thread.sleep(4000);
		
		

		tearDown();

	}

}
