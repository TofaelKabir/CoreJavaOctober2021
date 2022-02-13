package lec09_02_different_type_of_method;

public class Calculator01 {
	// Global variable or class variable
	// default type of access modifier is used, no reason, just for practice
	int a = 50; 
	int b = 30;
	
	// void type method
	public void addition() {
		int total1 = a+b;
		System.out.println("Addition of a and b is: "+total1);
	}
	
	// void type method
	public void subtraction() {
		int total2 = a-b;
		System.out.println("Subtraction of a and b is: "+total2);
	}
	
}
