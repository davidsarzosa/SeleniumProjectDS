package com.neotech.lesson04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxes {

	public static final String url = "https://www.neotech.vercel.app/sing-up";

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to(url);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		// lets locate the elements multiple times 
		driver.findElement(By.linkText("Search")).click();
		Thread.sleep(3000);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
