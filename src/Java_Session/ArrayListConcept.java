package Java_Session;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList : default class in java (JDK)
		//collections: dynamic array
		//order/index based arraylist
		
		//create the object of arraylist:
		
		ArrayList<Integer> marks= new ArrayList<Integer>();
		System.out.println(marks.size());//Vc=10, Pc=0--marks.size prints Pc
		marks.add(0);
		marks.add(22);
		marks.add(100);
		marks.add(89);
		marks.add(34);
		marks.add(12);
		marks.add(null);
		marks.add(98);
		System.out.println(marks);//[0, 22, 100, 89, 34, 12, null, 98]

		//		to print all the vlaues from the arraylist: for loop:
		for (int i=0;i<marks.size();i++)
		{
			System.out.println(marks.get(i));
		}
		System.out.println("---------------------");
		ArrayList<String> name= new ArrayList<String>();
		name.add("Nidhi");
		name.add("Vikky");
		name.add(null);
		name.add("Sachin");
		//name.add(1);
		//for each loop
		for ( String emp : name)
		{
			System.out.println(emp);
			
		}
		
		//AR : store emp data: name(string), age(int), sal(double), isPerm(true), gender(char)
				//
				ArrayList<Object> empDataList = new ArrayList<Object>();
				empDataList.add("Tom");//0
				empDataList.add(20);//1
				empDataList.add(12.33);//2
				empDataList.add(true);//3
				empDataList.add('m');//4
				
				System.out.println(empDataList.size());
				for(int k=0; k<empDataList.size(); k++) {
					System.out.println(empDataList.get(k));
				}
				
				//If we want to remove the value, we can use empDataList.remove(index);  
				
				for(Object e : empDataList) {
					System.out.println(e);
				}
				
				//
				ArrayList<String> empList = new ArrayList<String>();//vc = 10
				empList.add("Nidhi");//0
				empList.add("Sachin");//1
				empList.add("Saurabh");//2
				empList.add("Pooja");//3
				empList.add("Tom");
				empList.add("Peter");
				empList.remove(3);
				for(String e : empList) {
					System.out.println(e);
					System.out.println("break");
						if(e.equals("Pooja")) {
							System.out.println("50 % bonus");
							break;
						}
				}
				
				
			}

		
		

	}


