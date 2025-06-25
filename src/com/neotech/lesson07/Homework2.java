package com.neotech.lesson07;

import org.openqa.selenium.By;

import utils.BaseClass;

public class Homework2 extends BaseClass {

//	Homework 2:
//        Alert text verification
//        Open chrome browser
//        Go to https://demoqa.com/
//        Click on "Alerts, Frame & Windows" link
//        Click on "Alerts" links on the left side
//        Click on button to see Alert
//        Verify alert box with text "You clicked a button" is present
//        Click on 3rd button in the page
//        Verify alert box with text "Do you confirm action?" is present and click "confirm"
//        Click on 4 th button in the page and enter your name and click ok.
//        Quit browser

	public static void main(String[] args) throws InterruptedException {

		//// div[@class='category-cards']//div[3]
		setUp();
		driver.findElement(By.xpath("//h5[text() = 'Alerts, Frame & Windows']")).click();
		Thread.sleep(2000);

		tearDown();

	}

}
