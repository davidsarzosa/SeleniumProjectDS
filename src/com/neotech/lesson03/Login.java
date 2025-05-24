package com.neotech.lesson03;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {

	// this is just to keep saved the url

	public static final String url = "https://sis.neotechacademy.com/";

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get(url);

		// send the username and password
		driver.manage().window().maximize();
		driver.findElement(By.id("tUsername")).sendKeys("Admin");
		driver.findElement(By.id("tPassword")).sendKeys("Neotech$123");
		driver.findElement(By.id("bLogin")).click();
		// Thread.sleep(2000);

		driver.findElement(By.linkText("Students")).click();
		// Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().to("https://sis.neotechacademy.com/RP/Reports/Reports.aspx");
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(4000);
		driver.quit();

	}

}
