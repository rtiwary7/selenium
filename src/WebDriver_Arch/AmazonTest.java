package WebDriver_Arch;

public class AmazonTest {
	
	public static WebDriver driver;
	public String browser ="FireFox";
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String browser="Chrome";
		
		if (browser.equals("Chrome")){
			driver = new ChromeDriver();
		}
		
		else if (browser.equals("FireFox")){
			driver = new FirefoxDriver();
		}
		
		else if (browser.equals("Safari")){
			driver = new Safari();
		}
		
		else 
		{
			System.out.println("please pass the right browser name : " + browser);
		}
		
		driver.get("https://www.amazon.com");
		
		driver.click("Sign In");
		
		driver.sendKeys("emailID", "naveen@gmail.com");
		driver.sendKeys("password", "naveen@123");
		driver.click("Login");
		String title = driver.getTitle();
		System.out.println("page title is : " + title);
		
		//act vs exp result: checkpoint/ verification point
		if(title.equals("Amazon Shopping")) {
			System.out.println("correct title: PASS");
		}
		else {
			System.out.println("in correct title: FAIL");
		}
		//Automation testing = Automation Steps + Checkpoint(verfiction/Assertion/Soft/Hard/Act vs Exp Result) 
		
		driver.close();
		

	}

}
