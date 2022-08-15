package oops_inheritance;

public class Audi extends Car {
	
	public Audi(int wheels) {
		super(7);
		// TODO Auto-generated constructor stub
		System.out.println("audi" + wheels);
	}

	public void theftSafety() {
		System.out.println("Audi -- theftSafety");
	}


}
