package oops_inheritance;

public class Car extends Vehicle {
	
	//int final price =12;
	
	public Car(int wheels){
		super(8);
		Car.wheels=6;
		System.out.println("cars" + " " + Car.wheels);
		Vehicle.wheels=wheels;
		System.out.println("cars" + " " + Car.wheels);
		System.out.println("Vehicle" +" " + Vehicle.wheels);
		
		System.out.println("=====================");
	}
	
	@Override
	public void start()
	{
		System.out.println("Car--start");
	}
	
	
	public void fourSeater()
	{
		System.out.println("Car--fourSeater");
	}

	@Override
	public void engine() {
		// TODO Auto-generated method stub
		System.out.println("Car--engine");
	}
	
	//method hiding
	public static void testdrive(){
		System.out.println("Car---testdrive");
	}
	
//	@Override
//	private void billpay(){
//		System.out.println("car---billpay");
//	}
	//final method cannot be overridden
//	public final void tax(){
//		System.out.println("vehicle--tax");
//		}

}
