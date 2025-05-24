package com.neotech.lesson02;

public class C_FireFoxDriver implements I_WebDriver {

	public C_FireFoxDriver() {
		System.out.println("FireFox  is opening");
	}

	@Override
	public void get(String url) {
		System.out.println("FireFox  navigates to the " + url);

	}

	@Override
	public String getTittle() {
		System.out.println("Chrome will get the tittle");
		return "Page tittle";
	}

	@Override
	public String getCurrentUrl() {
		System.out.println("FireFox will get the current url! ");
		return " Current URL ";
	}

	@Override
	public void close() {
		System.out.println("FireFox is clossing");

	}

	@Override
	public void quit() {
		System.out.println("FireFox is clossing");
	}

}
