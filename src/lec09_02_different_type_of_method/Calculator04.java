package lec09_02_different_type_of_method;

public class Calculator04 {
	// Global variable or class variable
	// default type of access modifier is used
	byte a = 4; 
	byte b = 2;
	
	// return type method
	public byte division() {
		byte total1 = (byte) (a/b);
		System.out.println("Division of a and b is: "+total1);
		return total1;
	}
	
	
}
