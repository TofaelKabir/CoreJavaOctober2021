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

Java Logical Operators: 
Logical operators are used to determine the logic between variables or values. example below:

&&  Logical and operator (Returns true if both statements are true, x < 5 &&  x < 10)
||   Logical or operator (Returns true if one of the statements is true, x < 5 || x < 4)
!    Logical not operator [Reverse the result, returns false if the result is true, (!(x < 5 && x < 10))] 
  
 */

public class CompareNumber08 {

	public static void main(String[] args) {
		int val1 = 45;
		int val2 = 45;

		if (val1 % 2 == 0 && val1 < val2) {
			System.out.println(val1 + " is an even number and less than " + val2);
		} else if (val1 % 2 == 0 && val1 > val2) {
			System.out.println(val1 + " is an even number and greater than " + val2);
		} else if (val1 % 2 == 1 && val1 < val2) {
			System.out.println(val1 + " is an odd number and less than " + val2);
		} else if (val1 % 2 == 1 && val1 > val2) {
			System.out.println(val1 + " is an odd number and greater than " + val2);
		} else if (val1 % 2 == 0 && val1 != val2) {
			System.out.println(val1 + " is an even number and not equal to " + val2);
		} else if (val1 % 2 == 0 && val1 == val2) {
			System.out.println(val1 + " is an even number and equal to " + val2);
		} else if (val1 % 2 == 1 && val1 != val2) {
			System.out.println(val1 + " is an odd number and not equal to " + val2);
		} else if (!(val1 % 2 == 1 && val1 == val2)) {
			System.out.println(val1 + " is not an off number and not equal to " + val2);
		} else if (val1 % 2 == 0 && val1 >= val2) {
			System.out.println(val1 + " is an even number and greater than (or equal to)  " + val2);
		} else if (val1 % 2 == 0 && val1 <= val2) {
			System.out.println(val1 + " is an even number and less than (or equal to) " + val2);
		} else if (val1 % 2 == 1 && val1 == val2) {
			System.out.println(val1 + " is an odd number and equal to " + val2);
		}
	}
}
