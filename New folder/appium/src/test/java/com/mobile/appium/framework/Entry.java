package com.mobile.appium.framework;

public class Entry {

	public static void main(String[] args) {
		MobileDriver md = new MobileDriver("F:/Gopi Mobile Project/config.txt");
		md.createDriver();
	}

}
