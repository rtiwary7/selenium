package oops_interface;

public interface USMedical extends WHO {
	
	// can not have any method body
	// no method body --> Abstract method
	// only method prototype --only method declaration
	// can not have method buss logic
	// can not create the object of interface in java

	int min_fee = 10;
	int max_fee=90;

	public void cardioServices();
	
	public void cardioServices(int a);

	public void neuroServices();

	public void physioServices();

	public void emergencyServices();
	
	// after jdk 1.8: two major changes:

	// 1. can have static method with method body:
	public static void billing(){
		System.out.println("USMedical---billing");
	}
	
	//2. can have default method with method body:
	default void medicalDevelopment(){
		System.out.println("USMedical---medicalDevelopment");
	}

}
