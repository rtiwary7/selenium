package ConstructorConcept;

import java.util.ArrayList;

public class Customer {
	
	String fistname;
	String lastname;
	boolean isPrime;
	String phone;
	String address;
	String email;
	ArrayList<String> ordersList;
	
	public Customer(ArrayList<String> ordersList) {
		this.ordersList = ordersList;
	}

	public Customer(String fistname, String lastname, boolean isPrime,
			String phone, String address, String email,
			ArrayList<String> ordersList) {
		this.fistname = fistname;
		this.lastname = lastname;
		this.isPrime = isPrime;
		this.phone = phone;
		this.address = address;
		this.email = email;
		this.ordersList = ordersList;
	}
	
	

}
