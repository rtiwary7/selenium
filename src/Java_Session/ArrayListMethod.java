package Java_Session;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> empList = new ArrayList<String>();
		empList.add("Nidhi");//0
		empList.add("Sachin");//1
		empList.add("Saurabh");//2
		empList.add("Pooja");//3
		empList.add("Tom");//4
		empList.add("Peter");//5
		empList.add("Nidhi");//6
		
		empList.set(5, "Aman");//replaces the element at the given index
		System.out.println(empList);//[Nidhi, Sachin, Saurabh, Pooja, Tom, Aman, Nidhi]
		Collections.swap(empList, 0, 5);
		System.out.println(empList);//[Aman, Sachin, Saurabh, Pooja, Tom, Nidhi, Nidhi]
		Collections.reverse(empList);
		System.out.println(empList);//[Nidhi, Nidhi, Tom, Pooja, Saurabh, Sachin, Aman]
		Collections.sort(empList);
		System.out.println(empList);//[Aman, Nidhi, Nidhi, Pooja, Sachin, Saurabh, Tom]

		for(int i=0; i<empList.size(); i++) {
		System.out.println(empList.get(i));
	}
	
	System.out.println("-------");

	for(int i=empList.size()-1; i>=0; i--) {
		System.out.println(empList.get(i));
	}
	
	
	


	}

}
