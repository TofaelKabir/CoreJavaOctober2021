package lec13_java_conditional_statements;

// high level code, no need to study now, but if you see the code somewhere you can recognize by this

public class CompareNumber11 {

	public static void main(String[] args) {
		int age = 20;
		if (age<18) {
			System.out.println("You can't vote");
		} else {
			System.out.println("You can vote");
		}

		// We can write the above code by below way
		// Short-hand if else condition
		// There is also a short-hand if else, which is known as the ternary operator 
		// because it consists of three operands. It can be used to replace multiple lines of code with a single line. It is often used to replace simple if else statements
		// To learn more: https://www.w3schools.com/java/java_conditions.asp
		
		String outcome= (age<18)? "You can't vote" : "You can vote";
		System.out.println(outcome);
		
		int number=13;    
	    //Using ternary operator  
	    String output=(number%2==0)? "even number":"odd number";    
	    System.out.println(output);  
		
	}

}
