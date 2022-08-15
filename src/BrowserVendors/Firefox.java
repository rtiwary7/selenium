package BrowserVendors;

import Browser.BrowserUtil;

public class Firefox extends BrowserUtil {
	
	@Override
	public void click() {
		System.out.println("Firefox -- clicking....");
	}

	public void launchURL() {
		System.out.println("https://google.com");
	}

}
