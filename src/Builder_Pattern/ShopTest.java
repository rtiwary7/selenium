package Builder_Pattern;

public class ShopTest {
	
	
	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		AmazonShop app = new AmazonShop();
		app.login().login("rajan", "pwd").login().
		search("shoes", "black").addToCart("abc").doPayment("1234").logout();
		
		//
		app.login("naveen@gmail.com", "naveen123")
				.search()
						.logout();
		//
		app.login("naveen@gmail.com", "naveen123")
				.doPayment("121212121", 121)
					.generateOrderId()
							.logout();
		
		//
		app.login("naveen@gmail.com", "naveen123")
				.logout();
		
		//
		app.login("naveen@gmail.com", "naveen123");
		
		//
		app.login()
				.search("iPh12", "white")
						.addToCart("iPh12")
							.doPayment("naveen@hdfc")
									.generateOrderId()
											.logout();
		
		
		
		

	}
	
	public void main( String abc){
		
		
	}
	public void main(){
		this.main("223");
	}
	
	

}
