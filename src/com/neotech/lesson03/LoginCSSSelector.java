package com.neotech.lesson03;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginCSSSelector {

	public static final String url = "https://sis.neotechacademy.com";

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		// send the username and pasword
		driver.findElement(By.id("tUsername")).sendKeys("Admin");
		driver.findElement(By.id("tPassword")).sendKeys("Neotech$123");
		// lets pass for a second
		Thread.sleep(3000);

		// To select CSS Selector you select (( input with a period "." and classvalue =
		// "buttonBig";
		driver.findElement(By.cssSelector("input.buttonBig")).click();
		//Thread.sleep(3000);
		driver.findElement(By.cssSelector("a[href*='Personal.aspx']")).click();
		Thread.sleep(3000);

		driver.quit();

	}

}
