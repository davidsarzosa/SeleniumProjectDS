package com.neotech.lesson02;

public interface I_WebDriver {

	// any variable I declare will be public static final
	// any method I declare will be public abstract

	/*
	 * This method is sooo kuuul kuuul
	 * 
	 * You give it the url and it will take you there!!
	 * 
	 * @param url
	 * 
	 * 
	 */
	public void get(String url);

	public String getTittle();

	public String getCurrentUrl();

	public void close();

	public void quit();

	// The most important here is to remember here is that
	// method and variables because they are abstract

	// any variable will be public static final
	// any method I declare will be public abstract

}
