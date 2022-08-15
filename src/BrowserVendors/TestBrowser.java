package BrowserVendors;

import Browser.BrowserUtil;


public class TestBrowser {
	
	public static void main (String[] args){
		BrowserUtil br = null;
		 
		String browserName = "chrome";
		//cross browser logic 
//		if(browserName.equals("chrome")) {
//			br = new Chrome();
//		}
//		else if(browserName.equals("firefox")) {
//			br = new Firefox();
//		}
//		else if(browserName.equals("safari")) {
//			br = new Safari();
//		}
//		else {
//			System.out.println("please pass the right browser.....");
//		}
//		
//		br.click();
		
		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			br = new Chrome();
			break;
			
		case "firefox":
			br = new Firefox();
			break;
			
		case "safari":
			br = new Safari();
			break;

		default:
			System.out.println("please pass the right browser.....");
			break;
			
			
		}
	
		br.click();
	}
	

}
