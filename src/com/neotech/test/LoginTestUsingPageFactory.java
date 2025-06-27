package com.neotech.test;

import com.neotech.pages.DashboardPageUsingPageFactory;
import com.neotech.pages.LoginPageUsingPageFactory;

import utils.CommonMethods;
import utils.ConfigsReader;

public class LoginTestUsingPageFactory extends CommonMethods {

	public static void main(String[] args) {

		setUp();
		LoginPageUsingPageFactory loginPage = new LoginPageUsingPageFactory();
		DashboardPageUsingPageFactory dashboard = new DashboardPageUsingPageFactory();

		// enter user name
		sendText(loginPage.username, ConfigsReader.getProperty("username"));

		// enter password
		sendText(loginPage.password, ConfigsReader.getProperty("password"));

		// click on login button
		click(loginPage.loginBtn);

		wait(5);

		// verify if the logo is displated or not
		if (dashboard.logo.isDisplayed()) {
			System.out.println("Test Passed! ");
		} else {
			System.out.println("Test Failed!! ");
		}

		// verify the logged in user is "Jacqueline White"

		String exceptedName = "Jacqueline White";
		String actualName = dashboard.accountName.getText();

		if (actualName.equals(exceptedName)) {
			System.out.println(exceptedName + "logged in.");
		} else {
			System.out.println(exceptedName + " did NOT log in! ");
		}

		wait(3);

		tearDown();

	}

}
