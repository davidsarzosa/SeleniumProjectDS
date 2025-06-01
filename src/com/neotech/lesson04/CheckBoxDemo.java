package com.neotech.lesson04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckBoxDemo {

	public static final String url = "https://neotech.vercel.app/sign-up";

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.navigate().to(url);
		driver.manage().window().maximize();
		WebElement maleR = driver.findElement(By.xpath("//input[@id='male']"));
		maleR.click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#female")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='wednesday']")).click();
		Thread.sleep(3000);

		// If I don't know which elements to check prior, then i will get all
		// those elements, and then use loop + if to select them

		List<WebElement> elements = driver.findElements(By.xpath("//div[@class='inline_grid choices']/label"));

		// lets assume I want to click on: Female, Saturday, and Sunday!

		for (WebElement element : elements) {
			String text = element.getText();

			if (text.equals("Female")) {
				element.click();

			} else if (text.equals("Saturday")) {
				element.click();

			}

			Thread.sleep(1000);

			driver.quit();

		}
	}
}
