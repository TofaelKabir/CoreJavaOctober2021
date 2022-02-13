package lec04_java_variables;

public class Address02 {
	// First Variable, Then Constructor and then Method
	// And they should be above main method
	// Variable is also called field

	// String = type of variable, MyName is the name of the String type variable
	// Here the variable initialized, how? We give a value for the variable Name
	// String type variable is initialized inside double quotation
	public String MyName = "Mohammad Sharkar";
	// int (integer) = type of variable, houseNumber is the name of the int type variable
	// Here the variable initialized, how? We give a value for the variable Name
	// int type variable is initialized without any quotation
	public int houseNumber = 625;
	// char (character) = type of variable, houseLocation is the name of the char type variable
	// Here the variable initialized, how? We give a value for the variable Name
	// char type variable is initialized inside single quotation
	public char houseLocation = 'W';
	
	public int streetNumber = 57;
	public String streetType = "th st";
	public String state = "NY -";
	public int zipCode = 10019;
	// boolean = type of variable, inUSA is the name of the booolean type variable
	// Here the variable initialized, how? We give a value for the variable Name
	// boolean type variable is initialized without any quotation
	public boolean inUSA = true;
	
	public static void main(String[] args) { // remove double slash from next line to see the error
		// System.out.println(MyName); // why it is showing error? 
		// important interview question: Can you call a non static variable or method inside main method?
		// MyName variable is non-static variable, a non static variable (or non-static method) can't call inside a static method.

	}

}
