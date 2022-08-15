package ConstructorConcept;

public class Employee {
	
	String name;
	int age;
	double salary;
	boolean isPerm;
	
	//constructor of the class
	//const... name will be same as the class name
	//const... looks like a function but not a function
	//const... can not return any value, there is no return type
	//const... will be called when you create the object of the class
	//const... can be overloaded
	//const... is used to initialize the class vars
	//const.. is used to create the object on the basis of given parameters
	//const... is helping to prevent of creating unnecessary object
	
	public Employee(String s1,int i){
		name = s1;
		age=i;
	}
	

	public Employee(String name, int age, double salary, boolean isPerm) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.isPerm = isPerm;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee("neel",53);
		System.out.println(e1.name + " " + e1.age);
			
		
	}

}
