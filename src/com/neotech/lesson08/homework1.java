package com.neotech.lesson08;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import utils.BaseClass;

public class homework1 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

//	1) Launch the browser and open the site "https://neotech.vercel.app/email"
//	2) Click on link "Click Here". When the user clicks on the "Click Here" link, new child window opens.
//	3) On the Child Window, Enter your email ID and submit.
//	4) Then Access Credentials will be Displayed on submitted page. You will see the child window is open in new tab.
//	5) Close the Child window on which credentials are displayed. Switch to the parent window.
//	6) Quit all browsers

		setUp();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='email/account']")).click();
		Thread.sleep(2000);
		Set<String> allWHandles = driver.getWindowHandles();
		// System.out.println(allWHandles);
		Iterator<String> it = allWHandles.iterator();
		String window1 = it.next();
		String window2 = it.next();
		System.out.println("Window 1 --> " + window1);
		System.out.println("Window 2 --> " + window2);
		Thread.sleep(2000);
		driver.switchTo().window(window2);
		driver.findElement(By.xpath("//input[@id='emailid']")).sendKeys("kaylee.lindburg@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(2000);
		driver.quit();
		Thread.sleep(2000);

		tearDown();

	}

}
