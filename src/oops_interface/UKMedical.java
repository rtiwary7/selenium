package oops_interface;

public interface UKMedical extends WHO {
	
	void dentalServices();//by default methods are public and abstract
	
	

	public void entServices();

	public void emergencyServices();
	default void medicalDevelopment(){
		System.out.println("UK -- medicalDevelopment");
	}

}
