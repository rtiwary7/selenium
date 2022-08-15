package oops_inheritance;

public class Vehicle {
	
	static int wheels =6;
	final int p=12;//final means variable is constant
	
	//private static final String s1="";
	
	public Vehicle(int wheels){
		this.wheels=wheels;
		System.out.println("vehicle" + wheels);
		
	}
	public void start()
	{
		System.out.println("Vehicle--start");
	}
	
	public void stop(){
		System.out.println("Vehicle--stop");
	}
	
	public void fuel(){
		System.out.println("Vehicle--fuel");
	}
	
	public void engine() {
		// TODO Auto-generated method stub
		System.out.println("Car--engine");
		Vehicle v2 = new Vehicle(21);
		v2.billpay();
	}
	
	public static void testdrive(){
		System.out.println("Vehicle---testdrive");
	}
	
	//private method cannot be overridden
	private void billpay(){
		System.out.println("Vehicle---billpay");
	}
	
	//final method cannot be overridden
	public final void tax(){
		System.out.println("vehicle--tax");
		}
}
