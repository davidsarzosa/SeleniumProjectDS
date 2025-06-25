package com.neotech.lesson10;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.BaseClass;

public class CalendarDemo extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		// https://www.delta.com/

		setUp();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// Thread.sleep(3000);

		driver.findElement(By.id("calDepartLabelCont")).click();
		Thread.sleep(2000);

		// Let us select July 27 for departure
		String CurrentMonth = driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']")).getText();
		// if it is July, Click on a date
		// if it not, the click next
		while (!CurrentMonth.equals("July")) {
			// I need to click next
			driver.findElement(By.xpath("//span[text()='Next']")).click();

			// update the month value after moving to the next one
			CurrentMonth = driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']")).getText();
		}
		Thread.sleep(4000);

		// now select the day
		List<WebElement> days = driver.findElements(By.xpath("//table[@class='dl-datepicker-calendar']//td"));

		// Let us iterate over all days and once we find our day, click on it and then
		// break out of the loop
		for (WebElement day : days) {
			String dayNum = day.getText();
			if (dayNum.equals("27")) {
				day.click();
				break;
			}
		}
		Thread.sleep(4000);

		// Now let us select the return date as September 17
		String returnMonth = driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']")).getText();

		while (!returnMonth.equals("September")) {
			// I need to click next
			driver.findElement(By.xpath("//span[text()='Next']")).click();

			// update the month value after moving to the next one
			returnMonth = driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']")).getText();

		}
		Thread.sleep(4000);

		// now we iterate to get the day

		List<WebElement> returnDays = driver.findElements(By.xpath("//table[@class='dl-datepicker-calendar']//td"));

		for (WebElement day : returnDays) {
			String dayNum = day.getText();
			if (dayNum.equals("17")) {
				day.click();
				break;

			}
		}

		Thread.sleep(4000);

		driver.findElement(By.xpath("//button[@class='donebutton']")).click();

		Thread.sleep(4000);

		tearDown();

	}

}
