package Java_Session;

import java.util.ArrayList;
import java.util.Arrays;

public class LoginPage {
	
	String username="rajan";
	String password = "tiwary";
	boolean isActive;
	double bmi;
	int age;
	char gender;
	String st[] = {"tom", "lisa", "peter"};
	ArrayList<String> s1= new ArrayList<String>();
	
	//s1.add("true");---
	
//	LoginPage a = new LoginPage();\
//	a.s1.add("123");
	
	public void test(String[] ai)
	{
		System.out.println("test");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LoginPage lp = new LoginPage();
		lp.s1.add("name");
		
		System.out.println(lp.age);
		String s[]=new String[0];
		
		lp.test(s);
		
		System.out.println(lp.st.length);
		System.out.println(Arrays.toString(lp.st));
		for(String e : lp.st) {
			System.out.println(e);
		}
		System.out.println(lp.s1);

	}

}
