package com.neotech.lesson05;

import utils.BaseClass;

public class OpenOrangeHRM3 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		// setUp your environment
		setUp();

		// Write your test code here
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(2000);

		// closing the browser
		tearDown();

	}

}
