package ConstructorConcept;

import java.util.ArrayList;
import java.util.Arrays;

public class Booking {
	
	String name="abc";
	String userid;
	ArrayList<Integer> bookingList;
	int a[]= new int[5];
	int m[]= {1,2,3};
	
	

	public Booking(ArrayList<Integer> bookingList, int[] a) {
		this.bookingList = bookingList;
		this.a = a;
	}

	public Booking(String name, String userid, ArrayList<Integer> bookingList) {
		//this.name = name;
		this.userid = userid;
		this.bookingList = bookingList;
	}
	
	

	public Booking(int[] a, int[] m) {
		this.a = a;
		this.m = m;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(5001);
		ar.add(5002);
		ar.add(5011);
		ar.add(5022);

		Booking b1 = new Booking("Naveen", "101", ar);
		System.out.println(b1.name + " " + b1.bookingList);
		
		
		
		System.out.println(b1.bookingList.size());
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		Booking b2 = new Booking("Neel", "102", ar1);
		
		int b[]=new int[3];
		b[0]=1;
		b[1]=5;
		
		Booking b3 = new Booking(ar1,b);
		System.out.println(b3.name + " " + b1.bookingList);
		System.out.println(b3.bookingList.size());
		//System.out.println(b3.bookingList.get(0));
		//System.out.println(b3.a);
		
		Booking b4 = new Booking(b,b);
		System.out.println(Arrays.toString(b4.m));
		
		//TestComp t1 = new Test

	}

}
