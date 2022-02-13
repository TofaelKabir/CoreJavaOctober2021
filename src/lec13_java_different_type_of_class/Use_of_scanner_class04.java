package lec13_java_different_type_of_class;

import java.util.Scanner;

/*
System is a class, and 'in' is a property of InputStream
nextInt()  is a method of Scanner class (for int type)
nextLine() is a method of Scanner class (for String type)
close() is a method of Scanner class
To learn more: https://www.javatpoint.com/Scanner-class
*/
public class Use_of_scanner_class04 {
	
	public static void main(String[] args) {
		
		System.out.println("Please put value here: ");
		Scanner scanner = new Scanner(System.in);

		int val1 = scanner.nextInt();
		int val2 = scanner.nextInt();

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
		} else {
			System.out.println("This is not a vliad case");
		}

		scanner.close();

	}

}
