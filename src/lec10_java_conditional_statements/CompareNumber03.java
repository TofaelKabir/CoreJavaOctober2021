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
 */

public class CompareNumber03 {

	public static void main(String[] args) {
		int val1 = 73;
		int val2 = 45;

		if (val1 < val2) {
			System.out.println(val1 + " is less than " + val2);
		} else if (val1 > val2) {
			System.out.println(val1 + " is Greater than " + val2);
		}

	}
}
