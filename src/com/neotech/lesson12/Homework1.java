package com.neotech.lesson12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class Homework1 extends CommonMethods {
	public static void main(String[] args) {

		// FrameDemo at com.neotech.lesson07 using the CommonMethods.java
		// https://neotech.vercel.app/iframe

		setUp();

		switchToFrame(0); // this will be switching the frames by index

		WebElement age = driver.findElement(By.xpath("//input[@id='age']"));

		// "age" element can send the text after cleaning the textbox
		// element and create an object of that element

		sendText(age, "29"); // --> This will be sending the keys there
		wait(2);

		// now coming back to the default content
		driver.switchTo().defaultContent();
		WebElement frameEl = driver.findElement(By.tagName("iframe"));
		switchToFrame(frameEl); // this will be switching the frames by WebElement

		sendText(age, "31");
		wait(2);

		// 3. Switch to frame by name or Id
		// driver.switchTo().frame("name or id ");

		tearDown();
		
		
	}

}
