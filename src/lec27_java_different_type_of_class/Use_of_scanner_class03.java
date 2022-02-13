package lec27_java_different_type_of_class;

import java.util.Scanner;

public class Use_of_scanner_class03 {

	public static void main(String[] args) {
		System.out.println("Please put value here: ");
		Scanner scanner = new Scanner(System.in);
		int val1 = scanner.nextInt();
		int val2 = scanner.nextInt();
		int sum = val1 + val2;
		System.out.println("\nThe sum of val 1 and val 2 is: " + sum);
		scanner.close();
	}

}
