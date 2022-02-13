package lec13_java_different_type_of_class;

import java.util.Scanner;

public class Use_of_scanner_class02 {

	public static void main(String[] args) {
		System.out.println("Please enter your full name here: ");
		Scanner scanner = new Scanner(System.in);
		String myName = scanner.nextLine();
		System.out.println("\n Hey ! " + myName + " , now you know how Scanner class works!!");
		scanner.close();
	}

}
