package lec04_java_variables;

public class Address03 {
	// First Variable, Then Constructor and then Method
	// And they should be above main method
	// Variable is also called field

	// String = type of variable, MyName is the name of the String type variable
	// Here the variable initialized, how? We give a value for the variable Name
	// String type variable is initialized inside double quotation
	public static String MyName = "Mohammad Sharkar";
	// int (integer) = type of variable, houseNumber is the name of the int type variable
	// Here the variable initialized, how? We give a value for the variable Name
	// int type variable is initialized without any quotation
	public static int houseNumber = 625;
	// char (character) = type of variable, houseLocation is the name of the char type variable
	// Here the variable initialized, how? We give a value for the variable Name
	// char type variable is initialized inside single quotation
	public static char houseLocation = 'W';
	
	public static int streetNumber = 57;
	public static String streetType = "th st";
	public static String state = "NY -";
	public static int zipCode = 10019;
	// boolean = type of variable, inUSA is the name of the booolean type variable
	// Here the variable initialized, how? We give a value for the variable Name
	// boolean type variable is initialized without any quotation
	public static boolean inUSA = true;
	
	public static void main(String[] args) { 
		// if a variable is non static, it can't be executed inside the main
		// method, it will show error
		// To call A Variable - you don't need to put it inside double quotation, Just
		// call the variables by name directly
		System.out.println(MyName); 
		System.out.println(houseNumber); 
		System.out.println(houseLocation); 
		System.out.println(streetNumber); 
		System.out.println(streetType); 
		System.out.println(state); 
		System.out.println(zipCode); 
		System.out.println(inUSA); 		
	}

}
