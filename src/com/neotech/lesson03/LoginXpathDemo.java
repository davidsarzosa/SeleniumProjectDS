package com.neotech.lesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginXpathDemo {

	public static final String url = "https://sis.neotechacademy.com";

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get(url);

		// send the username and password
		// this time we will locate the elements using Xpath

		// if we open the full xpath
		// driver.findElement(By.xpath(
		// "/html/body/form/table[1]/tbody/tr/td[2]/table[2]/tbody/tr/td[2]/table/tbody/tr[3]/td/table/tbody/tr[1]/td[3]/input"))
		// .sendKeys("Admin");

		// when the Xpath starts with // it means that the xpath is relative
		// targets by unique value, and will no break easy

//		✅ Summary – How You Convert Absolute XPath to Relative
//		Inspect the element.
//
//		Find a unique attribute like id, name, class, etc.
//
//		Use a relative XPath like:
//		//input[@id='tUsername']
//
//		Optionally, use CSS selectors:
//		#tUsername
//
//		Avoid /html/body/... unless nothing else works.

		// YOU CAN CREATE MULTIPLE RELATIVE XPATHS 
		 driver.findElement(By.xpath("//input[@class='tBoxMid']")).sendKeys("Admin");
		// driver.findElement(By.xpath("//input[@id='tUsername']")).sendKeys("Admin");
		// driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Admin");
	
		// YOU CAN CREATE MULTIPLE RELATIVE XPATHS 
		// driver.findElement(By.xpath("//input[@id='tPassword']")).sendKeys("Neotech$123");
		//driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Neotech$123");
		 driver.findElement(By.xpath("//input[@name='tPassword']")).sendKeys("Neotech$123");
		driver.findElement(By.xpath("//input[@id='bLogin']")).click();

		// again remember if only get the absolute xpath is easy to break and you can
		// not really relay on this path
		// they way to use relative xpath is basically create one with a unique value
		// id, name, className etc
		// different unique relative xpath for username

		Thread.sleep(4000);
		driver.quit();
		
		
		
		// Extra 
//		🔍 Example — Common Working XPaths
//		✅ Will Work
//		xpath
//		Copy
//		Edit
//		//input[@id='email']            ← ✅ ID is unique
//		//button[text()='Submit']       ← ✅ Exact text match
//		//div[@class='menu']//a         ← ✅ Finds <a> inside .menu
//		//a[contains(text(), 'Forgot')] ← ✅ Partial text

	}

}
