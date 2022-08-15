package Builder_Pattern;

public class AmazonShop {
	
	public AmazonShop login()
	{
		System.out.println("login to app");
		this.addToCart("invalid");
		return this;
	}
	
	public AmazonShop login(String username, String pwd)
	{
		System.out.println("valid_details");
		return this;
	}
	
	public AmazonShop search() {
		System.out.println("display all the products");
		return this;
	}
	
	public AmazonShop search(String productName, String color) {
		System.out.println("display all the products with : " + productName + " " + color);
		return this;
	}
	
	public AmazonShop search(String productName, String color, int price) {
		System.out.println("display all the products with : " + productName + " " + color + " " + price);
		return this;
	}
	
	public AmazonShop addToCart(String productName) {
		System.out.println("add to cart: " + productName);
		return this;
	}
	
	public AmazonShop doPayment(String cc, int cvv) {
		System.out.println("make payment with : " + cc + " " + cvv);
		return this;
	}
	
	public AmazonShop doPayment(String upiNumber) {
		System.out.println("make payment with : " + upiNumber) ;
		return this;
	}
	
	public AmazonShop generateOrderId() {
		System.out.println("your order id is : " + 12345);
		return this;
	}
	
	public AmazonShop logout() {
		System.out.println("logout....");
		return this;
	} 

}
