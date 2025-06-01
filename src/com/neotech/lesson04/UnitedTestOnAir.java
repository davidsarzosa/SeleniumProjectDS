package com.neotech.lesson04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnitedTestOnAir{
	public static final String url = "https://www.unitedwifi.com/content/home/index.html";

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.navigate().to(url);
		Thread.sleep(2000);

		List<WebElement> allLinks = driver.findElements(By.tagName("link"));
		int count = 0;

		Thread.sleep(3000);
		for (WebElement link : allLinks) {
			if (!link.getText().isEmpty()) {
				System.out.println("href" + link.getAttribute("hred"));
				count++;
			}
		}

		System.out.println("The total nuber of all link tags is " + allLinks.size());
		System.out.println("The total number of all link tags with text is " + count);

		String HomePageTittle = driver.getTitle();
		System.out.println(HomePageTittle);
		driver.findElement(By.xpath("//div[@id='home-tile-wifi']")).click();
		Thread.sleep(9000);
		String WifiPageTittle = driver.getTitle();
		System.out.println(WifiPageTittle);

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("daalejandrosm@gmail.com");
		driver.findElement(By.id("continue-button")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='MileagePlusNumberInput']")).sendKeys("acm1pt007");
		driver.findElement(By.cssSelector("#continue-button")).click();
		Thread.sleep(6000);

		driver.findElement(By.xpath("//div[@id='portalHeader']")).click();
		Thread.sleep(5000);

		driver.quit();

//		WebElement ReturnToMenu = driver.findElement(By.cssSelector("#ualogo"));
//		ReturnToMenu.click();
//		Thread.sleep(5000);
//
//		driver.quit();

	}

}
