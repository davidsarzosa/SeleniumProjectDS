package com.neotech.lesson03;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class homework1 {

	static final String url = "https://demo.guru99.com/test/newtours/";

	public static void main(String[] args) throws InterruptedException {

		/*
		 * HW1: Open chrome browser Go to "https://demo.guru99.com/test/newtours/" Click
		 * on Register Link Fill out ALL required info Click Submit User successfully
		 * registered (Create the script using different locators)
		 */

		WebDriver driver = new ChromeDriver();

		driver.get(url);
		driver.findElement(By.partialLinkText("REGIS")).click();
		Thread.sleep(2000);

		driver.findElement(By.name("firstName")).sendKeys("Consuelo");
		driver.findElement(By.name("lastName")).sendKeys("Moya");
		driver.findElement(By.name("phone")).sendKeys("0998184264");
		driver.findElement(By.id("userName")).sendKeys("consuelomoya@gmail.com");

		// Completing the mailing information

		driver.findElement(By.name("address1")).sendKeys("Florencio E 14-93");
		driver.findElement(By.name("city")).sendKeys("Puembo");
		driver.findElement(By.name("state")).sendKeys("Pichincha");
		driver.findElement(By.name("postalCode")).sendKeys("0101002");
		WebElement countrySelect = driver.findElement(By.name("country"));
		Select selectCountry = new Select(countrySelect);
		selectCountry.selectByVisibleText("ECUADOR");
		// driver.findElement(By.className("robots")).click();
		Thread.sleep(2000);

		List<WebElement> popups = driver.findElements(By.xpath("//*[@id='cbox']/div/div/div/div/div/div[1]"));

		if (popups.isEmpty()) {
			popups.get(0).click();
			System.out.println("PopUp closed after selection country! ");
		}

		driver.findElement(By.name("submit")).click();

	}

}