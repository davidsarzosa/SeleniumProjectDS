package com.neotech.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.BaseClass;

public class LoginPage extends BaseClass {
	
	public WebElement username = driver.findElement(By.id("txtUsername"));
	public WebElement password = driver.findElement(By.id("txtPassword"));
	public WebElement loginBtn = driver.findElement(By.xpath("//button"));
	
	
	
	
}
