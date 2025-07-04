package com.neotech.lesson09;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.BaseClass;
import utils.ConfigsReader;

public class DynamicTableAnotherWay extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		setUp();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// login to the application: enter username and password

		driver.findElement(By.id("txtUsername")).sendKeys(ConfigsReader.getProperty("username"));
		driver.findElement(By.id("txtPassword")).sendKeys(ConfigsReader.getProperty("password"));
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		// locate the element PIM
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		driver.findElement(By.xpath("//a[@id='menu_pim_viewEmployeeList']")).click();

		Thread.sleep(4000);
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='employeeListTable']/tbody/tr"));
		String expected = "Linda";

		for (int i = 0; i < rows.size(); i++) {
			String rowText = rows.get(i).getText();

			if (rowText.contains(expected)) {
				String lindaXpath = "//table[@id='employeeListTable']/tbody/tr[\" + (i + 1) + \"]/td[3]";
				WebElement lindaBox = driver.findElement(By.xpath(lindaXpath));

				lindaBox.click();
				// break out of the loop since I found what I was looking for
				break;

			}
		}

		Thread.sleep(5000);
		tearDown();

	}

}
