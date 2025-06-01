package com.neotech.lesson06;

import org.openqa.selenium.support.ui.Select;

public class Review {

	// So we can create a DropDown options first we need to create the button to
	// access the dropDown element so we create a DD element
	// has to be found the same way we can find any other element

	// EXAMPLE of the execution

	// WebElement yearDdEelement = driver.findElement(By.id("dAcademicYear_list"));
	// --> Now that you have the Year of the element -- > yearDdEelement you need to
	// put them into a Select class that comes with Selemenium

	// Select yearDd = new Select(yearDdEelement);
	// and now finally we can find that DropDown by many different options

	// THIS IS THE MOST IMPORTAT FROM DROPDOWNDEMO CLASS //
	// --------------------------------------------
//	/*
//	 * 
//	// yearDd.selectByInder(0)
//	// yearDd.selectByValue("10")
//	// yearDd.selectByVisibleText("2019-2020")

//	
//	 /*

	// SECOND CLASS DROPDOWNDEMO2 -----------

	// The most important from this class is understand how to bring to the code the
	// multi selection

	// 1st we need to check if there is a MultiSelection --> .isMultiple(); method
	// from Selenium will help
	// 2 create a Select Element with in the MultiSelection(Element)
	// 3 We can check now if MultiSelection + isMultiple() by declaring a boolean
	// 4 put them into a List directly after (if condition)
	// <List>(WebElement) --> options multiselectDD.options(); --> will give you the
	// options
	// you can use now multiSelectDD.deselectByindex(0) method
	// but also the multiselectDD.deselectAll(); method

	// DROPDOWN DEMO! ---- The most important is:

	/*
	 * Ones the DropDownElement it's being selected we need to create a Select
	 * Element to be able to access the element
	 * 
	 * passing the signature of the WebElement
	 * 
	 * Select yeardDd = new Select(yDropDElement) Then we can access to all the
	 * elements by using the Selenium options
	 * 
	 * selectByIndex(); selectByValue(); selectByVisibleText()
	 * 
	 */

	/*
	 * We can put the whole Select Element into LIST by  using getOptions()
	 * method from Selenium we can use each loop or for each loop : 
	 * 
	 * List<WebElement> options = yearDd.getOptions();
	 * for((int i = 0; i < options.size(); i++) {
			yearDd.selectByIndex(i);
			System.out.println(options.get(i).getText());)
	 * 
	 * 
	 */

}
