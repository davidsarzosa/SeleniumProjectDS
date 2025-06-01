package com.neotech.lesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	/*
	 * TC 1: Facebook login: Open chrome browser Go to “https://www.facebook.com/”
	 * Enter valid username and valid password and click login User successfully
	 * logged in
	 */

	public static final String url = "https://www.facebook.com/";

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Jhon");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Wick123");
		Thread.sleep(1000);

		// It is important to mention that the first part of the button never change
		// driver.findElement(By.xpath("//button[contains(@id,'u_0_')]")).click();

		// normal common relative xpath
		driver.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(3000);
		driver.quit();

	}

}
