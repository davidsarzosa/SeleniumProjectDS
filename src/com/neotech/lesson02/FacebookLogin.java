package com.neotech.lesson02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException {

		// go to the www.facebook.com
		// Fill out the username
		// full out the password
		// click log in
		// Open the browser

		WebDriver driver = new ChromeDriver();

		// go to the url
		driver.get("https://www.facebook.com/");

		// Lets send the UserName
		// 1. Locate the username box

		// Create a WebElement object and locate the username text box
		WebElement usernameBox = driver.findElement(By.id("email"));
		// send the email to the user
		usernameBox.sendKeys("neo@gmail.com");

		Thread.sleep(10000);

		// 2. locate the password box and send the password

		driver.findElement(By.id("pass")).sendKeys("password"); // locate the password box and send the password

		Thread.sleep(4000);
		// 3. click on the login button
		driver.findElement(By.id("u_0_5_sk")).click();
		// cannot use this one, why ?
		driver.findElement(By.name("login")).click();

		Thread.sleep(3000);

		driver.quit();

		// We do need to use web connection to perform this king of test, so
		// do not try to run the code w/o connection. 
		

	}

}
