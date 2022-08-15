package WebDriver_Arch;

public class Safari implements WebDriver{

	public Safari() {
		System.out.println("Launch Google Chrome.....");
	}

	@Override
	public void findElement() {
		System.out.println("find element.....");
	}

	@Override
	public void findElements() {
		System.out.println("find elements.....");

	}

	@Override
	public void click(String element) {
		System.out.println("click on : " + element);
	}

	@Override
	public void sendKeys(String element, String value) {
		System.out.println("send keys to the element: " + element + " value: " + value);
	}

	@Override
	public void get(String url) {
		System.out.println("launch url: " + url);
	}

	@Override
	public String getTitle() {
		String title = "Amazon Shopping";
		return title;
	}

	@Override
	public void close() {
		System.out.println("close the browser.....");
	}
}
