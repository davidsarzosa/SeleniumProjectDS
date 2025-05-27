package com.neotech.lesson04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckBoxDemo {

	public static final String url = "https://demoqa.com/radio-button";

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.navigate().to(url);
		driver.manage().window().maximize();
		WebElement yesR = driver.findElement(By.xpath("//label[@for='yesRadio']"));
		yesR.click();
		// Thread.sleep(3000);
		driver.findElement(By.xpath("//label[@for='impressiveRadio']")).click();
		// Thread.sleep(3000);
		driver.navigate().to("https://artoftesting.com/samplesiteforselenium");
		WebElement maleRadio = driver.findElement(By.xpath("//input[@value='male']"));
		maleRadio.click();
		// Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='female']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@value='Automation']")).click();
		Thread.sleep(3000);
		WebElement dropdown = driver.findElement(By.id("testingDropdown"));
		dropdown.click();
		Thread.sleep(2000);
		Select select = new Select(dropdown);
		select.selectByVisibleText("Performance");
		Thread.sleep(2000);
		
		

	}

}
