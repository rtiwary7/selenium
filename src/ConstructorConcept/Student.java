package ConstructorConcept;

public class Student {
	
	String name;
	String subject;
	String section;
	int age;
	double salary;
	boolean isPerm;
	
	public Student(String name)
	{
		this.name=name;
	}

	public Student(String name, int age, double salary, boolean isPerm) { 
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.isPerm = isPerm;
	}

	public Student(String name, String subject) {
		this.name = name;
		this.subject = subject;
	}

	public Student(String name, String subject, String section) {
		
		this.name = name;
		this.subject = subject;
		this.section = section;
	}

	

	
	
	
	
	

}
