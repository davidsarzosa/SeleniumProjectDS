package com.neotech.lesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	/*
	 * TC 1: Facebook login: Open chrome browser Go to “https://www.facebook.com/”
	 * Enter valid username and valid password and click login User successfully
	 * logged in
	 */

	public static final String url = "https://www.facebook.com";
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		driver.findElement(By.cssSelector("#email")).sendKeys("David A Sarzosa");
		driver.findElement(By.cssSelector("#pass")).sendKeys("Austin.2024");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button[data-testid='royal-login-button'")).click();
		Thread.sleep(7000);
		driver.quit();
		
		
		
		
		
		
		
		
		

	}

}
