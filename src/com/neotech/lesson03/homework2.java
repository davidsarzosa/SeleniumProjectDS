package com.neotech.lesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class homework2 {
	/*
	 * 
	 * Open chrome browser Go to "https://www.facebook.com/" Click on Sign Up link
	 * Enter first name Enter last name Enter email address Re-enter email address
	 * Click on Sign Up button
	 */
	public static final String url = "https://www.facebook.com/";

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get(url);
		// //*[@id="facebook"]/body
		Thread.sleep(3000);
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(3000);

		driver.findElement(By.name("firstname")).sendKeys("Kaylee");
		driver.findElement(By.name("lastname")).sendKeys("Lindburg");
		driver.findElement(By.name("reg_email__")).sendKeys("kayleee.linburg@gmail.com");
		//driver.findElement(By.className("_5dbc _8esb img sp_98fCI7IVTTz sx_54513f")).click();
		driver.findElement(By.id("password_step_input")).sendKeys("Odessa.2024");
		driver.findElement(By.name("websubmit")).click();

		Thread.sleep(4000);

		driver.quit();

	}
}
