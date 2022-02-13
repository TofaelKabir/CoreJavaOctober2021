package lec09_02_different_type_of_method;

public class Calculator02 {
	// Global variable or class variable
	// default type of access modifier is used
	int a = 60; 
	int b = 32;
	
	// return type method
	public int addition() {
		int total1 = a+b;
		System.out.println("Addition of a and b is: "+total1);
		return total1;
	}
	
	// return type method
	public int subtraction() {
		int total2 = a-b;
		System.out.println("Subtraction of a and b is: "+total2);
		return total2;
	}
	
}
