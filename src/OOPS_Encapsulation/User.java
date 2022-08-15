package OOPS_Encapsulation;

public class User {
	
	private String name;
	private int age;
	private boolean isActive;

	public User(String name, int age, boolean isActive){
		 this.name=name;
		 this.age=age;
		 this.isActive=isActive;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	 
}
