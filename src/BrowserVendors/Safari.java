package BrowserVendors;

import Browser.BrowserUtil;

public class Safari extends BrowserUtil{
	
	@Override
	public void click() {
		System.out.println("Firefox -- clicking....");
	}

	public void launchURL() {
		System.out.println("https://google.com");
	}

}
