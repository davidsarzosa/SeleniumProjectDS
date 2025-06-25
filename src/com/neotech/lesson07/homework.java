package com.neotech.lesson07;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.BaseClass;

public class homework extends BaseClass {
//	Homework 1:
//        Amazon Department List Verification
//        Open chrome browser
//        Go to "http://amazon.com/"
//        Verify how many department options available.
//        Print each department 
//        Select Computers
//        Quit browser

	public static void main(String[] args) throws InterruptedException {

		setUp();
		WebElement allDd = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		Thread.sleep(10000);
		Select selectDd = new Select(allDd);
		Thread.sleep(1000);

		List<WebElement> options = selectDd.getOptions();
		for (WebElement option : options) {
			System.out.println(option.getText());
		}
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//select[@id='searchDropdownBox']")).click();
		selectDd.selectByVisibleText("Computers");
		Thread.sleep(3000);

		tearDown();

	}

}
