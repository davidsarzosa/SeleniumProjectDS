package com.neotech.lesson08;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.BaseClass;

public class Task1 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

//		
//		-- Verify element is present --
//	    Open chrome browser
//	    Go to "https://the-internet.herokuapp.com/"
//	    Click on the "Dynamic Loading" link
//	    Click on "Example 1..." and click on "Start"
//	    Verify element with text "Hello World!" is displayed
//	    Close the browser 

		setUp();
		// Thread.sleep(1000);
		driver.findElement(By.linkText("Dynamic Loading")).click();
		// Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='content']/div/a[1]")).click();
		// Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='start']")).click();
		// Thread.sleep(1000);

		driver.findElement(By.xpath("//div[@id='start']/button")).click();

		// Lets try it explicit way
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(11));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@id='finish']/h4")));
		WebElement helloWorld = driver.findElement(By.xpath("//div[@id='finish']/h4"));
		System.out.println("The visibility of the text is displayed? " + helloWorld.isDisplayed() + " It is --> "
				+ helloWorld.getText());

		//Thread.sleep(4000);
		tearDown();

	}

}
