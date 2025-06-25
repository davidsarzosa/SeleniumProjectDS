package com.neotech.lesson08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.BaseClass;

public class homework2 extends BaseClass {

//	=================   HW_2_Handling Frames =================================
//
//			1) Launch the browser and open the site "https://neotech.vercel.app/iframe/multi2"
//			2) Verify on the page header "Not a Friendly Topic" displayed
//			3) Click on the Inner Frame Check box
//			4) Choose Dog from Animals dropdown
//			5) Quit the browser
//	
//	
//	

	public static void main(String[] args) throws InterruptedException {

		setUp();

		WebElement header = driver.findElement(By.tagName("h2"));
		System.out.println(header.getText());

		if (header.isDisplayed()) {
			System.out.println("Test Passed!! ---> " + " Header --> " + header.getText());
		} else {
			System.out.println("Failed!! the header is --> " + header);
		}

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='nested1']")));
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='child-frame']")));
		driver.findElement(By.xpath("//input[@id='inner-frame-check-box']")).click();
		Thread.sleep(1000);
		driver.switchTo().frame(driver.findElement(By.xpath("//body[@class='main']")));
		Thread.sleep(1000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='animals']")));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//select[@id='animal-select']//option[2]")).click();
		Thread.sleep(3000);

		tearDown();
	}
}
