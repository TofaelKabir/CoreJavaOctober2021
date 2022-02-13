package lec13_java_different_type_of_class;

import java.util.Scanner;

public class Use_of_scanner_class01 {

	public static void main(String[] args) {
		System.out.println("Please enter your age here");
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();
		System.out.println("\nYour age is: " + age);
		scanner.close();
	}

}
