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
		// Thread.sleep(3000);
		driver.findElement(By.cssSelector("a[href*='Personal.aspx']")).click();
		Thread.sleep(3000);

		driver.quit();

//		
//		🛠 Step 2: Use CSS Selector Syntax
//		What You Want to Match	CSS Selector Example	Notes
//		Tag name	input	All <input> elements
//		By ID	#loginButton	id="loginButton"
//		By Class	.form-control	class="form-control"
//		By Attribute	input[type="text"]	Any input with type text
//		Tag + Class	input.form-control	input with class
//		Tag + ID	input#email	input with ID email
//		Descendant (any level inside)	.form-group input	Input inside form-group
//		Direct Child	form > input	Only direct children
//		Adjacent Sibling	label + input	The input right after a label
//		Attribute starts with	input[name^="user"]	name starts with "user"
//		Attribute ends with	input[name$="name"]	name ends with "name"
//		Attribute contains	input[name*="ser"]	name contains "ser"
//
//		

	}

}
