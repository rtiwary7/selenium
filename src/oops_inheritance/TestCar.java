package oops_inheritance;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle v1 = new Car(11);//Top Casting
		v1.engine();
		v1.fuel();
		//v1.testdrive();Method hiding--- Vehicle class billing method was called
		Car.testdrive();//method hiding car--testdrive
		Vehicle.testdrive();// vehicle--testdrive
//		Vehicle v2 = new Vehicle(21);
//		v2.bill	
		
		
		BMW b = new BMW();
		b.start();// overridden
		b.stop();// inherited
		b.fuel();// inherited
		b.autoParking();// individual
		b.engine();
		b.autoStart();
		

		System.out.println("-----");

		Car c = new Car(12);
		c.start();
		c.stop();
		c.fuel();
		c.engine();

		System.out.println("-----");
		Audi a = new Audi(13);
		a.theftSafety();
		a.start();
		a.stop();
		a.fuel();
		a.engine();

		System.out.println("-----");
		Truck t = new Truck();
		t.heavyLoading();

		System.out.println("-----");

		// Top casting
		Car c1 = new BMW();// child class object can be referred by parent class ref variable
		c1.start();
		c1.stop();
		c1.engine();
		c1.fuel();

		// down casting:
		//BMW b1 = (BMW) new Car();

	}

}
