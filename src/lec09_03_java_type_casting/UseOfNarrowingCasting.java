package lec09_03_java_type_casting;

// Narrowing casting must be done manually by placing the type in parentheses in front of the value
public class UseOfNarrowingCasting {
	public static void main(String[] args) {
	    double myDouble = 9.78723;
	    int myInt = (int) myDouble; // Manual casting: double to int

	    System.out.println(myDouble);   // Outputs 9.78723 -- double
	    System.out.println(myInt);      // Outputs 9 -- int
	  }

}
