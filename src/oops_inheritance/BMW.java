package oops_inheritance;

public class BMW extends Car{
	
	public BMW(){
		super(5);
		System.out.println("bmw" + wheels);
	}
	@Override
	public void start() {
		System.out.println("BMW -- start");
	}
	
	@Override
	public void engine() {
		System.out.println("BMW -- engine");
	}

	public void autoParking() {
		System.out.println("BMW -- auto parking");
	}
	
	public void autoStart() {
		System.out.println("BMW -- auto start");
	}
}
