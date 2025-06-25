package com.neotech.lesson09;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.BaseClass;
import utils.ConfigsReader;

public class DynamicTable extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		setUp();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// login to the application: enter UserName and passwords
		driver.findElement(By.id("txtUsername")).sendKeys(ConfigsReader.getProperty("username"));
		driver.findElement(By.id("txtPassword")).sendKeys(ConfigsReader.getProperty("password"));

		// click login button
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		// locate and and click on the PIM menu
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		driver.findElement(By.id("menu_pim_viewEmployeeList")).click();

		Thread.sleep(5000);
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='employeeListTable']/tbody/tr"));

		String expected = "Linda";

		for (int i = 0; i < rows.size(); i++) {
			String rowText = rows.get(i).getText();

			if (rowText.contains(expected)) {
				// Click on the name
				// Get a list of all items
				List<WebElement> ThirdColumnData = driver
						.findElements(By.xpath("//table[@id='employeeListTable']/tbody/tr/td[3]"));

				ThirdColumnData.get(i).click();
				break;
			}
		}
		Thread.sleep(5000);

		tearDown();

	}
}
