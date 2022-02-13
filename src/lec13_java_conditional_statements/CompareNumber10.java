package lec13_java_conditional_statements;

import java.util.Scanner;

// Nested if condition 

public class CompareNumber10 {

	public static void main(String[] args) {
		System.out.println("Please put value here: ");
		Scanner scanner = new Scanner(System.in);

		int val1 = scanner.nextInt();
		int val2 = scanner.nextInt();

		if (val1 % 2 == 0) {
			if (val1 < val2) {
				if (val2 % 2 == 0) { // we can add this in other condition also
					System.out.println(val1 + " is an even number and is less than " + val2+", "+val2 +" is an even number too");
				} else {
					System.out.println(val1 + " is an even number and is less than " + val2+", "+val2 +" is an odd number");
				}
			} else if (val1 > val2) {
				System.out.println(val1 + " is an even number and is greater than " + val2);
			} else if (val1 == val2) {
				System.out.println(val1 + " is an even number and is equal to " + val2);
			} else if (val1 >= val2) {
				System.out.println(val1 + " is an even number and greater than (or equal to) " + val2);
			} else if (val1 <= val2) {
				System.out.println(val1 + " is an even number and less than (or equal to) " + val2);
			} else if (val1 != val2) {
				System.out.println(val1 + " is an even number and not equal to " + val2);
			} else if (!(val1 > val2)) {
				System.out.println(val1 + " is an even number and is not greater than " + val2);
			}
		} else if (val1 % 2 == 1) {
			if (val1 < val2) {
				System.out.println(val1 + " is an odd number and is less than " + val2);
			} else if (val1 > val2) {
				System.out.println(val1 + " is an odd number and is greater than " + val2);
			} else if (val1 == val2) {
				System.out.println(val1 + " is an odd number and is equal to " + val2);
			} else if (val1 >= val2) {
				System.out.println(val1 + " is an odd number and greater than (or equal to) " + val2);
			} else if (val1 <= val2) {
				System.out.println(val1 + " is an odd number and less than (or equal to) " + val2);
			} else if (val1 != val2) {
				System.out.println(val1 + " is an odd number and not equal to " + val2);
			} else if (!(val1 > val2)) {
				System.out.println(val1 + " is an odd number and is not greater than " + val2);
			}
		}
		scanner.close(); // formalities, but if you don't use, no change.

	}

}
