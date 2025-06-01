package utils;

import org.openqa.selenium.WebElement;

public class CommonMethods extends BaseClass {

	// This method clears a text box and send the text parameter to it

	// @param element
	// @param text

	public static void sendText(WebElement element, String text) {
		element.clear();
		element.sendKeys(null);
	}

	/*
	 *
	 * This method checks if the radio/checkbox is enabled, and then clicks on the
	 * element that have the attribute value as selectValue
	 * 
	 * @param elementList
	 * 
	 * @param selectValue
	 *
	 */

}
