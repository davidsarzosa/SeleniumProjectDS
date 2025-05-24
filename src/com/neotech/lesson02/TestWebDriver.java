package com.neotech.lesson02;

import java.util.List;
import java.util.Scanner;

public class TestWebDriver {
	static I_WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		// What if instead of me deciding which browser to use, I ask the user

		Scanner scan = new Scanner(System.in);

		System.out.println("Which browser to use ? ");
		String browser = scan.next();

		if (browser.equals("chrome")) {
			driver = new C_ChromeDriver();

		} else if (browser.equals("firefox")) {
			driver = new C_FireFoxDriver();

		} else {
			driver = new C_ChromeDriver();
			System.out.println("There is no such browser! I will use chrome! ");
		}

		driver.get("https://www.dell.com/");
		String actualURL = driver.getTittle();
		System.out.println(actualURL);
		driver.quit();

	}

}
