package lec10_java_conditional_statements;

/*
Conditional Statement:
Conditional Statements allow the program to behave differently based on condition. 
Example: if, else, else if, switch.
Regarding condition: First condition is if
Generally we don't use 2 if condition (code wise OK), 
rather we use if as first condition and else or else if as second condition. 
Generally the true statement is written at the end.
When we write else, no condition is necessary to write,
Whatever you want to print, it will be printed. either it is true or false, correct or incorrect
But if we wish to write a second condition , we have to use ‘else if’, not ‘else’. 

Even number: A number divided by 2 with remainder 0.
Example - 56 : 8/2 --- quotient 28, remainder 0
Odd number: A number divided by 2 with remainder 1.
Example - 37 : 9/2 --- quotient 18, remainder 1
 */

public class CompareNumber06 {

	public static void main(String[] args) {
		int val1 = 45;

		if (val1 % 2 == 0) {
			System.out.println(val1 + " is an even number");
		} else if (val1 % 2 == 1) {
			System.out.println(val1 + " is an odd number");
		}
	}
}

//TODO Nested if else (later)
// Can do it in this loop, if val1 is odd and greater than val2 

// TODO Ternary Operator (later)
// https://www.w3schools.com/java/java_conditions.asp
